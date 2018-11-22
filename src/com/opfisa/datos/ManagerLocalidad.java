/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.datos;

import com.opfisa.logica.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class ManagerLocalidad {
    private Conexion mysql=new Conexion();
    private Connection con = mysql.conectar();
    public Statement st = null;
    public ResultSet rs = null;
    
    public Integer totalRegistros;
    public String sql;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"Código", "Descripción", "Código Postal", "Departamento", "Provincia"};
        
        String [] registro = new String [titulos.length];
        
        totalRegistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sql = "SELECT * FROM locali WHERE dloca LIKE '%" + buscar.toUpperCase() + "%' ORDER BY dloca";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                registro[0] = rs.getString("cloca");
                registro[1] = rs.getString("dloca");
                
                String codigoPostal = rs.getString("postal");
                Double codigoPostalAux = Double.valueOf(codigoPostal);
                Integer codigoPostalAux2 = codigoPostalAux.intValue();                
                registro[2] = codigoPostalAux2.toString();

                registro[3] = rs.getString("dpto");
                registro[4] = rs.getString("pcia");
                                
                totalRegistros = totalRegistros + 1;
                
                modelo.addRow(registro);
                
            }
            return modelo;            
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            e.printStackTrace();
            return null;
        }
        
    }
    
    public boolean insertar (Localidad localidad){
        sql = "INSERT INTO locali (cloca, dloca, postal, dpto, pcia)"
                + " VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
            pst.setString(1, localidad.getCodigoLocalidad());
            pst.setString(2, localidad.getDescripcionLocalidad());
            pst.setInt(3, localidad.getCodigoPostal());
            pst.setString(4, localidad.getDepartamento());
            pst.setString(5, localidad.getProvincia());
            
            int n = pst.executeUpdate();
            
            if (n != 0)
                return true;
            else
                return false;
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }
    
    public boolean editar(Localidad localidad){
        sql = "UPDATE locali SET dloca=?, postal=?, dpto=?, pcia=? "
                + " WHERE cloca=?";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
            
            pst.setString(1, localidad.getDescripcionLocalidad());
            pst.setInt(2, localidad.getCodigoPostal());
            pst.setString(3, localidad.getDepartamento());
            pst.setString(4, localidad.getProvincia());
            pst.setString(5, localidad.getCodigoLocalidad());
            
            //int n = pst.executeUpdate();
            pst.executeUpdate();
            //if (n != 0)
                return true;
            //else
            //    return false;
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean eliminar(Localidad localidad){
        sql = "DELETE FROM locali WHERE cloca=?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, localidad.getCodigoLocalidad());
            
            //int n = pst.executeUpdate();
            pst.executeUpdate();
            //if(n != 0)
                return true;
            //else
            //    return false;
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
    
    public ArrayList<Localidad> obtenerLocalidades (){
        ArrayList<Localidad> listaLocalidades = new ArrayList<Localidad>();
        
        sql = "SELECT * FROM locali";
        totalRegistros = 0;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                String codigoLocalidad = rs.getString("cloca");
                String descripcionLocalidad = rs.getString("dloca");
                int codigoPostal = rs.getInt("postal");
                String departamento = rs.getString("dpto");
                String provincia = rs.getString("pcia");
                
                Localidad localidad = new Localidad(codigoLocalidad, descripcionLocalidad, codigoPostal, departamento, provincia);
                listaLocalidades.add(localidad);
                
                totalRegistros = totalRegistros + 1;
                
            }            
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        /*} finally {
            try {
                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }
        
        return listaLocalidades;

    }
    
    public Localidad obtenerLocalidadXCriterio (String buscar){
        Localidad localidad = null;
        PreparedStatement pst = null;
        
        sql = "SELECT * FROM locali WHERE cloca=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, buscar);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                String codigoLocalidad = rs.getString("cloca");
                String descripcionLocalidad = rs.getString("dloca");
                int codigoPostal = rs.getInt("postal");
                String departamento = rs.getString("dpto");
                String provincia = rs.getString("pcia");
                
                localidad = new Localidad(codigoLocalidad, descripcionLocalidad, codigoPostal, departamento, provincia);                
                
            }            
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return localidad;

    }
    
}
