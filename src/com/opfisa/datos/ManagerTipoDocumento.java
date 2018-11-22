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
 * @author CONDMD29
 */
public class ManagerTipoDocumento {
    private Conexion mysql=new Conexion();
    private Connection con = mysql.conectar();
    public Statement st = null;
    public ResultSet rs = null;
    
    public Integer totalRegistros;
    public String sql;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"Código", "Descripción"};
        
        String [] registro = new String [titulos.length];
        
        totalRegistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sql = "SELECT * FROM tdocu WHERE desdocu LIKE '%" + buscar.toUpperCase() + "%' ORDER BY desdocu";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                String codTdocu = rs.getString("tdocu");
                Double codTdocuAux = Double.valueOf(codTdocu);
                Integer codTdocuAux2 = codTdocuAux.intValue();                
                registro[0] = codTdocuAux2.toString();
                
                registro[1] = rs.getString("desdocu");                                
                                
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
    
    public boolean insertar (TipoDocumento tipoDocumento){
        sql = "INSERT INTO tdocu (tdocu, desdocu)"
                + " VALUES(?, ?)";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
            pst.setInt(1, tipoDocumento.getCodTipoDocumento());
            pst.setString(2, tipoDocumento.getDescripcionTipoDocumento());
            
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
    
    public boolean editar(TipoDocumento tipoDocumento){
        sql = "UPDATE tdocu SET desdocu=? "
                + " WHERE tdocu=?";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
            
            pst.setString(1, tipoDocumento.getDescripcionTipoDocumento());
            pst.setInt(2, tipoDocumento.getCodTipoDocumento());
            
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
    
    public boolean eliminar(TipoDocumento tipoDocumento){
        sql = "DELETE FROM tdocu WHERE cloca=?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, tipoDocumento.getCodTipoDocumento());
            
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
    
    public ArrayList<TipoDocumento> obtenerTipoDocumento (){
        ArrayList<TipoDocumento> listaTipoDocumentos = new ArrayList<>();
        
        totalRegistros = 0;
        sql = "SELECT * FROM tdocu ORDER BY tdocu";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                int codTipoDocumento = rs.getInt("tdocu");
                String descripcionTipoDocumento = rs.getString("desdocu");
                
                TipoDocumento tipoDocumento = new TipoDocumento(codTipoDocumento, descripcionTipoDocumento);
                listaTipoDocumentos.add(tipoDocumento);
                
                totalRegistros = totalRegistros + 1;
                
            }            
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        } finally {
            try {
                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return listaTipoDocumentos;

    }
    
    public TipoDocumento obtenerTipoDocumentoXCriterio (String buscar){
        TipoDocumento tipoDocumento = null;
        PreparedStatement pst = null;
        
        sql = "SELECT * FROM tdocu WHERE tdocu=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, buscar);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                int codTipoDocumento = rs.getInt("tdocu");
                String descripcionTipoDocumento = rs.getString("desdocu");
                
                tipoDocumento = new TipoDocumento(codTipoDocumento, descripcionTipoDocumento);

            }            
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        } finally {
            try {
                pst.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return tipoDocumento;

    }
    
}
