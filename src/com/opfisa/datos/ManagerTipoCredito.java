/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.datos;

import com.opfisa.logica.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ManagerTipoCredito {
    private Conexion mysql=new Conexion();
    private Connection con = mysql.conectar();
    public Statement st = null;
    public ResultSet rs = null;
    
    public Integer totalRegistros;
    public String sql;
    
    public ArrayList<TipoCredito> obtenerTipoCreditos(){        
        
        ArrayList<TipoCredito> listaTipoCredito = new ArrayList<TipoCredito>();
        
        sql = "SELECT * FROM tcredito ORDER BY dcredito";
        
        totalRegistros = 0;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                int codigoTipoCredito = rs.getInt("tcredito");
                String descripcionTipoCredito = rs.getString("dcredito");
                String nombreTipoCredito = rs.getString("nombtc");
                Date fechaVigenciaDesde = rs.getDate("fvigdes");
                Date fechaVigenciaHasta = rs.getDate("fvighas");
                Date fechaAlta = rs.getDate("falta");
                Date fechaBaja = rs.getDate("fbaja");
                int codigoCondicionTipoCredito = rs.getInt("idcondtc");
                
                TipoCredito tipoCredito = new TipoCredito(codigoTipoCredito, descripcionTipoCredito, nombreTipoCredito, fechaVigenciaDesde, fechaVigenciaHasta, fechaAlta, fechaBaja, codigoCondicionTipoCredito);
                                
                totalRegistros = totalRegistros + 1;
                
                listaTipoCredito.add(tipoCredito);
                
            }
            return listaTipoCredito;            
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            e.printStackTrace();
            return null;            
        }finally{
            try {
                st.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }            
        }
        
    }
    
}
