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
public class TipoCreditoDetalle {
    private int idTCDetalle;        //tcdetalle
    private double montoCredito;    //cmonto
    
    private int idTipoCredito;      //tcredito

    public TipoCreditoDetalle(int idTCDetalle, double montoCredito, int idTipoCredito) {
        this.idTCDetalle = idTCDetalle;
        this.montoCredito = montoCredito;
        this.idTipoCredito = idTipoCredito;
    }

    public int getIdTCDetalle() {
        return idTCDetalle;
    }

    public void setIdTCDetalle(int idTCDetalle) {
        this.idTCDetalle = idTCDetalle;
    }

    public double getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(double montoCredito) {
        this.montoCredito = montoCredito;
    }

    public int getIdTipoCredito() {
        return idTipoCredito;
    }

    public void setIdTipoCredito(int idTipoCredito) {
        this.idTipoCredito = idTipoCredito;
    }
    
    
}
