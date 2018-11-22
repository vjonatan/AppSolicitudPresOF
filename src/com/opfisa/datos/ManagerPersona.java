/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.datos;

import com.opfisa.logica.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class ManagerPersona {
    private Conexion mysql=new Conexion();
    private Connection con = mysql.conectar();
    public Statement st = null;
    public ResultSet rs = null;
    
    public Integer totalRegistros;
    public String sql;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"Documento", "Tipo Doc", "Razon Social", "Domicilio", "Nro", "Localidad", "Telefono", "Fecha Nac", "Sexo", "E.Civil", "Trabajo"
                            , "Domicilio Trabajo", "Dom.Trab.Nro", "Loc.Trabajo", "Tel.Trabajo", "Sector Trab.", "Sueldo", "F.Actualizacion", "F.Baja"
                            , "Tel. Movil", "Tel. Ref.", "Email", "Cta.Banc.", "Doc. Conyugue", "Doc. Garante", "Banco", "CBU"};
        
        String [] registro = new String [titulos.length];
        
        totalRegistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sql = "SELECT * FROM personas WHERE razon LIKE '%" + buscar.toUpperCase() + "%' ORDER BY razon";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                String numeroDocumento = rs.getString("docu");
                Double nroDocAux = Double.valueOf(numeroDocumento);
                Integer nroDocAux2 = nroDocAux.intValue();                
                registro[0] = nroDocAux2.toString(); //rs.getString("docu");
                
                String tipoDocumento = rs.getString("tdocu");
                Double tdocuAux = Double.valueOf(tipoDocumento);
                Integer tdocuAux2 = tdocuAux.intValue();
                registro[1] = tdocuAux2.toString();  //rs.getString("tdocu");
                
                registro[2] = rs.getString("razon");
                registro[3] = rs.getString("calle");
                registro[4] = rs.getString("ubica");
                registro[5] = rs.getString("cloca");
                registro[6] = rs.getString("telefono");
                registro[7] = rs.getString("nacido");
                registro[8] = rs.getString("sexo");
                registro[9] = rs.getString("ecivil");
                registro[10] = rs.getString("trabajo");
                registro[11] = rs.getString("tcalle");
                registro[12] = rs.getString("tubica");
                registro[13] = rs.getString("tcloca");
                registro[14] = rs.getString("ttelefo");
                registro[15] = rs.getString("tseccion");
                registro[16] = rs.getString("sueldo");
                registro[17] = rs.getString("factual");
                registro[18] = rs.getString("fbaja");
                registro[19] = rs.getString("telmovil");
                registro[20] = rs.getString("telref");
                registro[21] = rs.getString("email");
                registro[22] = rs.getString("cctabanc");
                
                String numeroDocumentoC = rs.getString("docucony");
                Double numeroDocumentoCAux = Double.valueOf(numeroDocumentoC);
                Integer numeroDocumentoCAux2 = numeroDocumentoCAux.intValue(); 
                registro[23] = numeroDocumentoCAux2.toString();
                
                String numeroDocumentoG = rs.getString("docugara");
                Double numeroDocumentoGAux = Double.valueOf(numeroDocumentoG);
                Integer numeroDocumentoGAux2 = numeroDocumentoGAux.intValue();                
                registro[24] = numeroDocumentoGAux2.toString();
                
                registro[25] = rs.getString("codbanc");
                registro[26] = rs.getString("cbu");
                
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
    
    public boolean insertar (Persona persona){
        sql = "INSERT INTO personas (docu, tdocu, razon, calle, ubica, cloca, telefono, nacido, sexo, ecivil, "
                + "trabajo, tcalle, tubica, tcloca, ttelefo, tseccion, sueldo, factual, fbaja, telmovil, telref, email, "
                + "cctabanc, docucony, docugara, codbanc, cbu)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
            pst.setInt(1, persona.getDocumento());
            pst.setInt(2, persona.getTipoDocumento());
            pst.setString(3, persona.getRazon());
            pst.setString(4, persona.getCalle());
            pst.setString(5, persona.getUbica());
            pst.setString(6, persona.getCodLocalidad());
            pst.setString(7, persona.getTelefono());
            pst.setDate(8, persona.getFechaNacimiento());
            pst.setString(9, persona.getSexo());
            pst.setString(10, persona.getEstadoCivil());
            pst.setString(11, persona.getLugarTrabajo());
            pst.setString(12, persona.getCalleTrabajo());
            pst.setString(13, persona.getUbicacionNroTrabajo());
            pst.setString(14, persona.getCodLocalidadTrabajo());
            pst.setString(15, persona.getTelefonoTrabajo());
            pst.setString(16, persona.getSeccionTrabajo());
            pst.setDouble(17, persona.getSueldo());
            pst.setDate(18, persona.getFechaActualizacion());
            pst.setDate(19, persona.getFechaBaja());
            pst.setString(20, persona.getTelefonoMovil());
            pst.setString(21, persona.getTelefonoReferencia());
            pst.setString(22, persona.getEmail());
            pst.setString(23, persona.getNroCtaBancaria());
            pst.setInt(24, persona.getDocumentoConyugue());
            pst.setInt(25, persona.getDocumentoGarante());
            pst.setString(26, persona.getCodBanco());
            pst.setString(27, persona.getCbu());
            
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
    
    public boolean editar(Persona persona){
        sql = "UPDATE personas SET tdocu=?, razon=?, calle=?, ubica=?, cloca=?, telefono=?, nacido=?, sexo=?, ecivil=?, "
                + "trabajo=?, tcalle=?, tubica=?, tcloca=?, ttelefo=?, tseccion=?, sueldo=?, factual=?, fbaja=?, telmovil=?, telref=?, email=?, "
                + "cctabanc=?, docucony=?, docugara=?, codbanc=?, cbu=?"
                + " WHERE docu=?";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, persona.getTipoDocumento());
            pst.setString(2, persona.getRazon());
            pst.setString(3, persona.getCalle());
            pst.setString(4, persona.getUbica());
            pst.setString(5, persona.getCodLocalidad());
            pst.setString(6, persona.getTelefono());
            pst.setDate(7, persona.getFechaNacimiento());
            pst.setString(8, persona.getSexo());
            pst.setString(9, persona.getEstadoCivil());
            pst.setString(10, persona.getLugarTrabajo());
            pst.setString(11, persona.getCalleTrabajo());
            pst.setString(12, persona.getUbicacionNroTrabajo());
            pst.setString(13, persona.getCodLocalidadTrabajo());
            pst.setString(14, persona.getTelefonoTrabajo());
            pst.setString(15, persona.getSeccionTrabajo());
            pst.setDouble(16, persona.getSueldo());
            pst.setDate(17, persona.getFechaActualizacion());
            pst.setDate(18, persona.getFechaBaja());
            pst.setString(19, persona.getTelefonoMovil());
            pst.setString(20, persona.getTelefonoReferencia());
            pst.setString(21, persona.getEmail());
            pst.setString(22, persona.getNroCtaBancaria());
            pst.setInt(23, persona.getDocumentoConyugue());
            pst.setInt(24, persona.getDocumentoGarante());
            pst.setString(25, persona.getCodBanco());
            pst.setString(26, persona.getCbu());
            pst.setInt(27, persona.getDocumento());
            
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
    
    public boolean editarFechaBaja(Persona persona){
        sql = "UPDATE personas SET fbaja=? "
                + " WHERE docu=?";
        
        try {
            PreparedStatement pst = null;
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, persona.getTipoDocumento());
            pst.setInt(27, persona.getDocumento());
            
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
    
    public boolean eliminar(Persona persona){
        sql = "DELETE FROM personas WHERE docu=?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, persona.getDocumento());
            
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
    
}
