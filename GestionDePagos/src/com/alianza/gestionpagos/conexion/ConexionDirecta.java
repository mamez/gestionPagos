package com.alianza.gestionpagos.conexion;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.alianza.gestionpagos.exception.GestionPagosException;




public class ConexionDirecta {
	
	
	/**
	 * Metodo para obtener el datasource a partir de la variable statica JDNI
	 * @return
	 * @throws GestionPagosException
	 */
	public static DataSource getDataSource(ConexionType conexionType) throws GestionPagosException{
		Context ctx = null;
		DataSource ds= null;
		try {
			ctx = new InitialContext();
			Context envCtx = (Context) ctx.lookup("java:comp/env");
			ds = (DataSource) envCtx.lookup(conexionType.getJdni());
			return ds;
		} catch (NamingException e) {
			throw new GestionPagosException(e.getMessage());
		}catch (Exception e) {
			throw new GestionPagosException(e.getMessage());
		}
	}
	
	/**
	 * Metodo para obtener la conexion mediante el datasource creado
	 * @return
	 * @throws GestionPagosException
	 */
	public static Connection getConexion(ConexionType conexionType) throws GestionPagosException{
		Connection con = null;
		try {
			con = getDataSource(conexionType).getConnection();
			return con;
		} catch (SQLException e){
			throw new GestionPagosException(e.getMessage());
		}catch (GestionPagosException e) {
			throw new GestionPagosException(e.getMessage());
		}catch (Exception e) {
			throw new GestionPagosException(e.getMessage());
		}
		
	}

}