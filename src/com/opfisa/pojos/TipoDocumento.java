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
public class TipoDocumento {
    private int tipoDocumento;      //tdocu
    private String descripcionDocumento; //desdocu

    public TipoDocumento(int tipoDocumento, String descripcionDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.descripcionDocumento = descripcionDocumento;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    public void setDescripcionDocumento(String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }
    
    
}
