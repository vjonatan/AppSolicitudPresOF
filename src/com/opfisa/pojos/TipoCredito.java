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
public class TipoCredito {
    private int idTipoCredito;          //tcredito
    private String codTipoCredito;      //dcredito
    private String nombreTipoCredito;   //nombtc
    private Date fechaVigenciaDesde;    //fvigdes
    private Date fechaVigenciaHasta;    //fvighas
    private Date fechaAlta;             //falta
    private Date fechaBaja;             //fbaja
    
    private int idCondTC;               //idcondtc

    public TipoCredito(int idTipoCredito, String codTipoCredito, String nombreTipoCredito, Date fechaVigenciaDesde, Date fechaVigenciaHasta, Date fechaAlta, Date fechaBaja, int idCondTC) {
        this.idTipoCredito = idTipoCredito;
        this.codTipoCredito = codTipoCredito;
        this.nombreTipoCredito = nombreTipoCredito;
        this.fechaVigenciaDesde = fechaVigenciaDesde;
        this.fechaVigenciaHasta = fechaVigenciaHasta;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.idCondTC = idCondTC;
    }

    public int getIdTipoCredito() {
        return idTipoCredito;
    }

    public void setIdTipoCredito(int idTipoCredito) {
        this.idTipoCredito = idTipoCredito;
    }

    public String getCodTipoCredito() {
        return codTipoCredito;
    }

    public void setCodTipoCredito(String codTipoCredito) {
        this.codTipoCredito = codTipoCredito;
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

    public int getIdCondTC() {
        return idCondTC;
    }

    public void setIdCondTC(int idCondTC) {
        this.idCondTC = idCondTC;
    }
    
    
}
