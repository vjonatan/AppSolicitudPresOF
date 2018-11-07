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
public class TipoCreditoCuotaDetalle {
    private int idTCCDetalle;   //tccdet
    private double alicuota;    //alicuota
    private int cantCuotas;     //ccuotas
    
    private int idTCDetalle;    //tcdetalle

    public TipoCreditoCuotaDetalle(int idTCCDetalle, double alicuota, int cantCuotas, int idTCDetalle) {
        this.idTCCDetalle = idTCCDetalle;
        this.alicuota = alicuota;
        this.cantCuotas = cantCuotas;
        this.idTCDetalle = idTCDetalle;
    }

    public int getIdTCCDetalle() {
        return idTCCDetalle;
    }

    public void setIdTCCDetalle(int idTCCDetalle) {
        this.idTCCDetalle = idTCCDetalle;
    }

    public double getAlicuota() {
        return alicuota;
    }

    public void setAlicuota(double alicuota) {
        this.alicuota = alicuota;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public int getIdTCDetalle() {
        return idTCDetalle;
    }

    public void setIdTCDetalle(int idTCDetalle) {
        this.idTCDetalle = idTCDetalle;
    }
    
    
}
