/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Conexion {
    String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    String URL = "jdbc:odbc:Personas";
    String USR = "";
    String PSW = "";
    
    Connection con = null;
    PreparedStatement st = null;
    Statement stat = null;
    ResultSet rs = null;

    public Conexion() {
    }
    
    public Connection conectar(){
        try {
            con = DriverManager.getConnection(URL, USR, PSW);
                    
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }                
        
        return con;
    }
    
}
