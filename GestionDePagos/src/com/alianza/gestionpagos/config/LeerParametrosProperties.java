package com.alianza.gestionpagos.config;

import static com.alianza.gestionpagos.config.EncryptionAes.getDescriptar;

import java.io.IOException;

import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LeerParametrosProperties {

    // Variable necesario para implementar los mensajes del log
    private static final Logger log = LogManager.getLogger(LeerParametrosProperties.class.getName());

    private String textoDesencriptado = "";
    private String textoEncriptado = "";
    private final String nombreArchivoProperties = "parametrosConfigurar.properties";

   
    public String getLeerParametrosPropertiesDesencriptado(String parametro) {

        // instancia de la clase Properties
        Properties prop = new Properties();

        InputStream input;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        // Se indica cual es el nombre de archivo properties y lo carga
        input = loader.getResourceAsStream(nombreArchivoProperties);

        // Cargar el archivo de propiedades
        try {

            prop.load(input);

        } catch (IOException e) {

            log.error("No se encontró el archivo properties, verifique el nombre y la ubicación - " + e + " - " + e.getMessage() + " - " + LeerParametrosProperties.class.getName());

        }

        // Se obtienen los parametros encriptados que se encuentran en el
        // archivo properties y los almacena en las variables con su mismo
        // nombre y se valida que exista la propiedad en el archivo properties
        // para finalmente desencriptarlo
        this.textoEncriptado = prop.getProperty(parametro);
        if (this.textoEncriptado != null) {

            this.textoDesencriptado = getDescriptar(this.textoEncriptado);

        } else {

            log.error("En el archivo properties no hay un parametro para: " + parametro);

        }

        if (this.textoDesencriptado.equals("Error al desencriptar")) {

            log.error("Error al desencriptar el parametro: " + parametro);

        }

        try {

            input.close();

        } catch (IOException e) {

            log.error("No se pudo cerrar el input, el cual lee los parametros de conexión del .properties - " + e + " - " + e.getMessage() + " - " + LeerParametrosProperties.class.getName());

        }

        return this.textoDesencriptado;
    }

    /**
     * Getter getLeerParametrosProperties: Recibe un parámetro de tipo String el
     * cual hace referencia a la propiedad del archivo proterties que se quiere
     * retornar
     *
     * @param parametro hace referencia a la propiedad del archivo proterties
     * que se quiere retornar
     * @return Retorna un valor de tipo String tal cual esta en el properties
     */
    public String getLeerParametrosProperties(String parametro) {

        // instancia de la clase Properties
        Properties prop = new Properties();

        InputStream input;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        // Se indica cual es el nombre de archivo properties y lo carga
        input = loader.getResourceAsStream(nombreArchivoProperties);

        // Cargar el archivo de propiedades
        try {

            prop.load(input);

        } catch (IOException e) {

            log.error("No se encontró el archivo properties, verifique el nombre y la ubicación - " + e + " - " + e.getMessage() + " - " + LeerParametrosProperties.class.getName());

        }

        // Se obtienen los parametros encriptados que se encuentran en el
        // archivo properties y los almacena en las variables con su mismo
        // nombre y se valida que exista la propiedad en el archivo properties
        // para finalmente desencriptarlo
        this.textoEncriptado = prop.getProperty(parametro);

        if (this.textoEncriptado == null) {

            log.error("En el archivo properties no hay un parametro para: " + parametro);

        }

        try {

            input.close();

        } catch (IOException e) {

            log.error("No se pudo cerrar el input, el cual lee los parametros de conexión del .properties - " + e + " - " + e.getMessage() + " - " + LeerParametrosProperties.class.getName());

        }

        return this.textoEncriptado;
    }
}
