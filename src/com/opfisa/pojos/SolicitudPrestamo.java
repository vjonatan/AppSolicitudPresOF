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
    private int idSolPrestamo;          //solprest
    private double montoSolicitado;     //solmonto
    private Date fechaAlta;             //falta
    private Date fechaBaja;             //fbaja
    private Date fechaModificacion;     //fmodif
        
    private int idTipoCredito;          //tcredi
    private String documentoPersona;    //docu

    public SolicitudPrestamo(int idSolPrestamo, double montoSolicitado, Date fechaAlta, Date fechaBaja, Date fechaModificacion, int idTipoCredito, String documentoPersona) {
        this.idSolPrestamo = idSolPrestamo;
        this.montoSolicitado = montoSolicitado;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.fechaModificacion = fechaModificacion;
        this.idTipoCredito = idTipoCredito;
        this.documentoPersona = documentoPersona;
    }

    public int getIdSolPrestamo() {
        return idSolPrestamo;
    }

    public void setIdSolPrestamo(int idSolPrestamo) {
        this.idSolPrestamo = idSolPrestamo;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public int getIdTipoCredito() {
        return idTipoCredito;
    }

    public void setIdTipoCredito(int idTipoCredito) {
        this.idTipoCredito = idTipoCredito;
    }

    public String getDocumentoPersona() {
        return documentoPersona;
    }

    public void setDocumentoPersona(String documentoPersona) {
        this.documentoPersona = documentoPersona;
    }
    
}
