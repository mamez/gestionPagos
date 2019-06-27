package com.alianza.gestionpagos.config;

/**
 *
 * @author Ing. Daniel Roa
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BDConexiones {

    // Variable necesario para implementar los mensajes del log
    private static final Logger log = LogManager.getLogger(BDConexiones.class.getName());
   
 
   

    public static Connection conectar() {

    	
        // Instancia de la clase LeerParametrosProperties
        LeerParametrosProperties properties = new LeerParametrosProperties();
        
        // Se recuperan los datos encriptados del archivo .properties
        // encriptados, se desencriptan y se asignan a las variables
        // desencriptados
        final String ip = properties.getLeerParametrosPropertiesDesencriptado("ip");
        final String puerto = properties.getLeerParametrosPropertiesDesencriptado("puerto");
        final String sid = properties.getLeerParametrosPropertiesDesencriptado("sid");
        final String usuarioBD = properties.getLeerParametrosPropertiesDesencriptado("usuarioBD");
        final String claveBD = properties.getLeerParametrosPropertiesDesencriptado("claveBD");
        String urlFinal = "jdbc:oracle:thin:@" + ip + ":" + puerto + ":" + sid;

        Connection cnn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cnn = DriverManager.getConnection(urlFinal, usuarioBD, claveBD);
        } catch (ClassNotFoundException | SQLException e3) {
            log.fatal(e3 + " - " + e3.getMessage());

        }

        return cnn;
    }

   
    public static void desconectar(Connection cnn) {

        desconectar(cnn, null);
    }

    
    public static void desconectar(PreparedStatement ps) {

        desconectar(null, ps);
    }

    
    private static void desconectar(Connection cnn, PreparedStatement ps) {

        try {
            log.fatal("Desconectando a la Base de Datos");
            // Realiza la validación si "Connection" o "PreparedStatement"
            // vienen diferente de nulos para realizar el cierre
            if (ps != null) {

                ps.close();
            }
            if (cnn != null) {

                cnn.close();
            }
        } catch (SQLException e4) {

            log.fatal(e4 + " - " + e4.getMessage());
        }
    }

    
    public static void rollBack(Connection cnn) {
        log.fatal("Realizando rollBack a la Base de Datos");
        try {

            cnn.rollback();
        } catch (SQLException e5) {

            log.fatal(e5 + " - " + e5.getMessage());
        }
    }

}
