/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.datos;

/**
 *
 * @author CONDMD29
 */
public class TipoDocumento {
    private int codTipoDocumento;
    private String descripcionTipoDocumento;    

    public TipoDocumento(int codTipoDocumento, String descripcionTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
        this.descripcionTipoDocumento = descripcionTipoDocumento;
    }

    public TipoDocumento() {
    }

    public int getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(int codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    public String getDescripcionTipoDocumento() {
        return descripcionTipoDocumento;
    }

    public void setDescripcionTipoDocumento(String descripcionTipoDocumento) {
        this.descripcionTipoDocumento = descripcionTipoDocumento;
    }

    @Override
    public String toString() {
        return this.getDescripcionTipoDocumento(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
