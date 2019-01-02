/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.base;

import com.opfisa.datos.TipoCredito;
import com.opfisa.pojos.Banco;
import com.opfisa.pojos.Localidad;
import com.opfisa.pojos.Persona;
import com.opfisa.pojos.SolicitudPrestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author CONDMD29
 */
public class BaseDatos {
    
    String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    String URL = "jdbc:odbc:Personas";
    String USR = "";
    String PSW = "";
    
    Connection con = null;
    PreparedStatement st = null;
    Statement stat = null;
    ResultSet rs = null;

    public BaseDatos() {
    }   
    
    
    
    public void insertarPersona(Persona persona){
        /*String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
        String URL = "jdbc:odbc:Personas";
        String USR = "";
        String PSW = "";*/
        
        try {
            con = DriverManager.getConnection(URL, USR, PSW);
            
            String sql = "INSERT INTO persona (docu, tdocu, razon, calle, ubica, cloca, telefono, nacido, sexo, ecivil, "
                    + "trabajo, tcalle, tubica, tcloca, ttelefono, tseccion, tsueldo, factual, fbaja, telmovil, telref, "
                    + "email, cctabanc, docucony, docugara)"
                    + "VALUES ('?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)";
            /*
            st = con.prepareStatement(sql);
            
            st.setString(1, persona.getDocumento());
            */
            
        } catch (Exception e) {
        }        
    }
    
    public ArrayList<Persona> obtenerPersonas(){
        String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
        String URL = "jdbc:odbc:Personas";
        String USR = "";
        String PSW = "";
        
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        
        try {
            con = DriverManager.getConnection(URL, USR, PSW);
            
            String sql = "SELECT * FROM personas";
            
            st = con.prepareStatement(sql);
            
            rs = st.executeQuery();
            
            while (rs.next()) {
                int documento = rs.getInt("docu");
                int tipoDocumento = rs.getInt("tdocu");
                String razonSocial = rs.getString("razon");
                String calle = rs.getString("calle");
                String ubicacion = rs.getString("ubica");
                String codigoLocalidad = rs.getString("cloca");
                String telefono = rs.getString("telefono");
                Date fechaNacimiento = rs.getDate("nacido");
                String sexo = rs.getString("sexo");
                String estadoCivil = rs.getString("ecivil");
                String trabajo = rs.getString("trabajo");
                String calleTrabajo = rs.getString("tcalle");
                String ubicacionTrabajo = rs.getString("tubica");
                String codLocalidadTrabajo = rs.getString("tcloca");
                String telefonoTrabajo = rs.getString("ttelefo");
                String areaTrabajo = rs.getString("tseccion");
                double sueldo = rs.getDouble("sueldo");
                Date fechaActualizacion = rs.getDate("factual");
                Date fechaBaja = rs.getDate("fbaja");
                String telefonoMovil = rs.getString("telmovil");
                String telefonoReferencia = rs.getString("telref");
                String email = rs.getString("email");
                String codCtaBancaria = rs.getString("cctabanc");
                int documentoConyugue = rs.getInt("docucony");
                int documentoGarante = rs.getInt("docugara");
                
                Persona persona = new Persona(documento, tipoDocumento, razonSocial, calle, ubicacion, codigoLocalidad, telefono, fechaNacimiento, sexo, estadoCivil
                                                , trabajo, calleTrabajo, ubicacionTrabajo, codLocalidadTrabajo, telefonoTrabajo, areaTrabajo, sueldo
                                                , fechaActualizacion, fechaBaja
                                                , telefonoMovil, telefonoReferencia, email, codCtaBancaria, null, null, documentoConyugue, documentoGarante);
                
                listaPersonas.add(persona);
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }finally{
            try {
                st.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
       
        return listaPersonas;
                
    }
    
    public ArrayList<Banco> obtenerBancos(){
        String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
        String URL = "jdbc:odbc:Personas";
        String USR = "";
        String PSW = "";
        
        ArrayList<Banco> listaBancos = new ArrayList<Banco>();
        
        try {
            con = DriverManager.getConnection(URL, USR, PSW);
            
            String sql = "SELECT * FROM banco";
            
            st = con.prepareStatement(sql);
            
            rs = st.executeQuery();
            
            while (rs.next()) {
                String codBanco = rs.getString("codbco");
                String nombreBanco = rs.getString("nombco");
                                
                Banco banco = new Banco(codBanco, nombreBanco);
                
                listaBancos.add(banco);
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }finally{
            try {
                st.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }            
        }
       
        return listaBancos;
    }
    
    public ArrayList<Localidad> obtenerLocalidades(){
        String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
        String URL = "jdbc:odbc:Personas";
        String USR = "";
        String PSW = "";
        
        ArrayList<Localidad> listaLocalidades = new ArrayList<Localidad>();
        
        try {
            con = DriverManager.getConnection(URL, USR, PSW);
            
            String sql = "SELECT * FROM locali ORDER BY cloca";
            
            st = con.prepareStatement(sql);
            
            rs = st.executeQuery();
            
            while (rs.next()) {
                String codLocalidad = rs.getString("cloca");
                String descripcionLocalidad = rs.getString("dloca");
                int codigoPostal = rs.getInt("postal");
                String departamento = rs.getString("dpto");
                String provincia = rs.getString("pcia");
                                
                Localidad localidad = new Localidad(codLocalidad, descripcionLocalidad, codigoPostal, departamento, provincia);
                
                listaLocalidades.add(localidad);
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }finally{
            try {
                st.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }            
        }
       
        return listaLocalidades;        
    }
    
    public ArrayList<SolicitudPrestamo> obtenerSolicitudesPrestamo(){
        String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
        String URL = "jdbc:odbc:Personas";
        String USR = "";
        String PSW = "";
        
        ArrayList<SolicitudPrestamo> listaSolicitudesPrestamo = new ArrayList<SolicitudPrestamo>();
        
        try {
            con = DriverManager.getConnection(URL, USR, PSW);
            
            String sql = "SELECT * FROM locali ORDER BY solpreca";
            
            st = con.prepareStatement(sql);
            
            rs = st.executeQuery();
            
            while (rs.next()) {
                int idSolicitudPrestamo = rs.getInt("solprest");
                int montoSolicitado = rs.getInt("solmonto");
                Date fechaAlta = rs.getDate("falta");
                Date fechaBaja = rs.getDate("fbaja");
                Date fechaModificacion = rs.getDate("fmodif");
                int idTipoCredito = rs.getInt("tcredi");
                String documento = rs.getString("docu");
                                
                SolicitudPrestamo solicitudPrestamo = new SolicitudPrestamo(idSolicitudPrestamo, montoSolicitado, fechaAlta, fechaBaja, fechaModificacion, idTipoCredito, documento);
                
                listaSolicitudesPrestamo.add(solicitudPrestamo);
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }finally{
            try {
                st.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }            
        }
       
        return listaSolicitudesPrestamo; 
    }                
    
    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        
        /*        
        for (Persona per : bd.obtenerPersonas()) {
            System.out.println(per.toString());
        }
        */
        
        for (Localidad loc : bd.obtenerLocalidades()) {
            System.out.println(loc.toString());
        }
        
    }
    
}
