/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.pojos;

/**
 *
 * @author CONDMD29
 */
public class CuentaBancaria {
    private String idCodCtaBancaria; //cctabanc
    private String nroSucursal;      //nrosuc
    private String nroCuenta;        //nrocta   
    private String cbu;
    
    private String codBanco;         //codbco

    public CuentaBancaria(String idCodCtaBancaria, String nroSucursal, String nroCuenta, String cbu, String codBanco) {
        this.idCodCtaBancaria = idCodCtaBancaria;
        this.nroSucursal = nroSucursal;
        this.nroCuenta = nroCuenta;
        this.cbu = cbu;
        this.codBanco = codBanco;
    }

    public String getIdCodCtaBancaria() {
        return idCodCtaBancaria;
    }

    public void setIdCodCtaBancaria(String idCodCtaBancaria) {
        this.idCodCtaBancaria = idCodCtaBancaria;
    }

    public String getNroSucursal() {
        return nroSucursal;
    }

    public void setNroSucursal(String nroSucursal) {
        this.nroSucursal = nroSucursal;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }
    
    
}
