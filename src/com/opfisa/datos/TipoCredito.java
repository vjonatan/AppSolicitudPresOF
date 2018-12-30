/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.datos;

import java.sql.Date;

/**
 *
 * @author ACER
 */
public class TipoCredito {
    private int codTipoCredito;
    private String descripcionTipoCredito;
    private String nombreTipoCredito;
    private Date fechaVigenciaDesde;
    private Date fechaVigenciaHasta;
    private Date fechaAlta;
    private Date fechaBaja;
    
    private int idCondicionTipoCredito; // se vincula con la tabla de configuración de lineas de crédito

    public TipoCredito() {
    }

    public TipoCredito(int codTipoCredito, String descripcionTipoCredito, String nombreTipoCredito, Date fechaVigenciaDesde, Date fechaVigenciaHasta, Date fechaAlta, Date fechaBaja, int idCondicionTipoCredito) {
        this.codTipoCredito = codTipoCredito;
        this.descripcionTipoCredito = descripcionTipoCredito;
        this.nombreTipoCredito = nombreTipoCredito;
        this.fechaVigenciaDesde = fechaVigenciaDesde;
        this.fechaVigenciaHasta = fechaVigenciaHasta;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.idCondicionTipoCredito = idCondicionTipoCredito;
    }

    public int getCodTipoCredito() {
        return codTipoCredito;
    }

    public void setCodTipoCredito(int codTipoCredito) {
        this.codTipoCredito = codTipoCredito;
    }

    public String getDescripcionTipoCredito() {
        return descripcionTipoCredito;
    }

    public void setDescripcionTipoCredito(String descripcionTipoCredito) {
        this.descripcionTipoCredito = descripcionTipoCredito;
    }

    public String getNombreTipoCredito() {
        return nombreTipoCredito;
    }

    public void setNombreTipoCredito(String nombreTipoCredito) {
        this.nombreTipoCredito = nombreTipoCredito;
    }

    public Date getFechaVigenciaDesde() {
        return fechaVigenciaDesde;
    }

    public void setFechaVigenciaDesde(Date fechaVigenciaDesde) {
        this.fechaVigenciaDesde = fechaVigenciaDesde;
    }

    public Date getFechaVigenciaHasta() {
        return fechaVigenciaHasta;
    }

    public void setFechaVigenciaHasta(Date fechaVigenciaHasta) {
        this.fechaVigenciaHasta = fechaVigenciaHasta;
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

    public int getIdCondicionTipoCredito() {
        return idCondicionTipoCredito;
    }

    public void setIdCondicionTipoCredito(int idCondicionTipoCredito) {
        this.idCondicionTipoCredito = idCondicionTipoCredito;
    }

    @Override
    public String toString() {
        return this.codTipoCredito + " - " + this.descripcionTipoCredito;
    }    
    
}



