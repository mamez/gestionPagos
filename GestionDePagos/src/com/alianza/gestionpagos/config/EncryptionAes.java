package com.alianza.gestionpagos.config;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ipseccolombia.security.Crypto;

/**
 * Descripta los datos en AES
 *
 * @author Ing. Carlos Andres Nino Cruz
 * @version 2018/03/28 - yyyy-MM-dd
 */
public class EncryptionAes {

    // Variable necesario para implementar los mensajes del log
    private static final Logger log = LogManager.getLogger(EncryptionAes.class.getName());

    private static final String SEMILLA = "SDhLeUU4V1R3N3JDcndURGlSMDBaTU9uWlgvaWdKTlRHY09kdzV3MVhjS3ZBOEs3NG9DaXc3NEZUc1c5d3FiRG9XMD1dQ2IwYlE0Y01FaFM2Q3RWckkxRFBFZz09XWh5cnovRThOWDZUT1BTZzBxL3ZmUFpmM2Zia2tzcVBKUkhoTG1UdFg1VkE9";

    private static String llaveSecreta = "";
    private static int iteracionesContrasenia = 1;
    private static final int tamanioClave = 256; // Número de Bits
    @SuppressWarnings("unused")
    private static final int saltLongitud = tamanioClave / 8;
    private static byte[] ivBytes;

    /**
     * Getter getDescriptar: Descripta los parametros que se le pasan en la
     * variable textoEncriptado
     *
     * @author Ing. Carlos Andres NiÃ±o Cruz
     * @param textoEncriptado: String que que indica el texto a descriptar
     * @return retorna el String descriptado
     * @version 2018/01/09 - yyyy-MM-ddd
     */
    public static String getDescriptar(String textoEncriptado) {

        LeerParametrosProperties properties = new LeerParametrosProperties();

        // Retorna la semilla desencriptada
        llaveSecreta = Crypto.decrypt(SEMILLA);
        iteracionesContrasenia = Integer.parseInt(properties.getLeerParametrosProperties("iteraciones"));

        String[] campos = textoEncriptado.split("]");
        byte[] saltBytes = Base64.decodeBase64(campos[0]);
        ivBytes = Base64.decodeBase64(campos[1]);
        byte[] textoEncriptadoBytes = Base64.decodeBase64(campos[2]);

        // Derivar la clave
        SecretKeyFactory secretKeyFactory = null;
        try {
            // PBKDF2--WithHmac--SHA512
            // PBKDF2: Representa la función derivada de clave basada en contraseña, un sucesor de PBKDF1 y se utiliza para implementar una función pseudoaleatoria, como un hash criptográfico, cifrado o HMAC a la contraseña de entrada o frase de contraseña junto con un valor de sal y repite el proceso muchas veces para producir una clave derivada, que luego se puede utilizar como una clave criptográfica en las operaciones posteriores.
            // HMAC: Los Stands for Hash (Keyed-Hash Message Authentication Code) son una construcción específica para calcular un código de autenticación de mensajes (MAC) que involucra una función criptográfica hash en combinación con una clave criptográfica secreta. Cualquier función hash criptográfica, puede usarse en el cálculo de un HMAC; el algoritmo MAC resultante se denomina HMAC-MD5 o HMAC-SHA1 en consecuencia.
            secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        } catch (NoSuchAlgorithmException e) {
            log.error(e + " - " + e.getMessage() + " - " + EncryptionAes.class.getName());
        }
        PBEKeySpec pBEKeySpec = new PBEKeySpec(llaveSecreta.toCharArray(), saltBytes, iteracionesContrasenia, tamanioClave);

        SecretKey secretKey = null;
        try {
            secretKey = secretKeyFactory.generateSecret(pBEKeySpec);
        } catch (InvalidKeySpecException e) {
            log.error(e + " - " + e.getMessage() + " - " + EncryptionAes.class.getName());
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");

        // Descifrar el mensaje
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            log.error(e + " - " + e.getMessage() + " - " + EncryptionAes.class.getName());
        }
        try {
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, new IvParameterSpec(ivBytes));
        } catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
            log.error(e + " - " + e.getMessage() + " - " + EncryptionAes.class.getName());
        }

        byte[] textoDescifradoBytes = null;

        try {

            textoDescifradoBytes = cipher.doFinal(textoEncriptadoBytes);

        } catch (IllegalBlockSizeException | BadPaddingException e) {

            log.error("Error al descriptar, verifique el texto a desencriptar, no corresponde con la llave o las iteraciones de encripcion: " + e + " - " + e.getMessage() + " - " + EncryptionAes.class.getName());

            return "Error al desencriptar";
        }

        return new String(textoDescifradoBytes);

    }
}
