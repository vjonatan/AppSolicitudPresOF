/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.pojos;

import java.sql.Date;

/**
 *
 * @author CONDMD29
 */
public class SolicitudPrestamo {
    private int idSolPrestamo;
    private double montoSolicitado;
    private Date fechaAlta;
    private Date fechaActualizacion;
    private Date fechaBaja;
        
    private int idTipoCredito;
    private String documentoPersona;
    
}
