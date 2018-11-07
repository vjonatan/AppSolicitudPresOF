/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.base;

import com.opfisa.pojos.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author CONDMD29
 */
public class BaseDatos {
    
    Connection con = null;
    PreparedStatement st = null;
    Statement stat = null;
    ResultSet rs = null;

    public BaseDatos() {
    }   
    
    public Connection conectar(){
		//Connection con = null;
		
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
    
    public void insertarPersona(Persona persona){
        String URL = "jdbc:mysql://localhost:3306/db-sistema";
        String USR = "root";
        String PSW = "123456";
        
        try {
            con = DriverManager.getConnection(URL, USR, PSW);
            
            String sql = "INSERT INTO persona (docu, tdocu, razon, calle, ubica, cloca, telefono, nacido, sexo, ecivil, "
                    + "trabajo, tcalle, tubica, tcloca, ttelefono, tseccion, tsueldo, factual, fbaja, telmovil, telref, "
                    + "email, cctabanc, docucony, docugara)"
                    + "VALUES ('?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)";
            
            st = con.prepareStatement(sql);
            
            st.setString(1, persona.getDocumento());
            
            
        } catch (Exception e) {
        }
        
    }
    
}
