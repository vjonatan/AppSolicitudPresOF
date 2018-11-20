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
public class ManagerBanco {
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
        
        sql = "SELECT * FROM banco WHERE nombco LIKE '%" + buscar.toUpperCase() + "%' ORDER BY nombco";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                               
                registro[0] =  rs.getString("codbco");
                
                registro[1] = rs.getString("nombco");                                
                                
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
    
    public boolean insertar (Banco banco){
        sql = "INSERT INTO tdocu (codbco, nombco)"
                + " VALUES(?, ?)";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
            pst.setString(1, banco.getCodBanco());
            pst.setString(2, banco.getNombreBanco());
            
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
    
    public boolean editar(Banco banco){
        sql = "UPDATE banco SET nombco=? "
                + " WHERE codbco=?";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
                        
            pst.setString(1, banco.getNombreBanco());
            pst.setString(2, banco.getCodBanco());
            
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
    
    public boolean eliminar(Banco banco){
        sql = "DELETE FROM banco WHERE codbco=?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, banco.getCodBanco());
            
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
    
    public ArrayList<Banco> obtenerBanco (){
        ArrayList<Banco> listaBancos = new ArrayList<>();
        
        totalRegistros = 0;
        sql = "SELECT * FROM banco ORDER BY codbco";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                String codigoBanco = rs.getString("codbco");
                String nombreBanco = rs.getString("nombco");
                
                Banco banco = new Banco(codigoBanco, nombreBanco);
                listaBancos.add(banco);
                
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
        
        return listaBancos;

    }
    
    public Banco obtenerBancoXCriterio (String buscar){
        Banco banco = null;
        PreparedStatement pst = null;
        
        sql = "SELECT * FROM banco WHERE codbco=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, buscar);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                String codigoBanco = rs.getString("codbco");
                String nombreBanco = rs.getString("nombco");
                
                banco = new Banco(codigoBanco, nombreBanco);
                
            }            
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return banco;

    }
    
}
