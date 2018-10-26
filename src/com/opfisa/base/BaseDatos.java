/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CONDMD29
 */
public class BaseDatos {
    
    public static Connection conectar(){
		Connection con = null;
		
		String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
		String URL = "jdbc:odbc:Personas";
		String USER = "";
		String PASSWD = "";
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWD);
			if(con != null)
				System.out.println("Conectado");
			
		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}
		
		return con;
		
	}
    
}
