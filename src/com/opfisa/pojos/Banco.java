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
public class Banco {
    private String codBanco;
    private String nombreBanco;

    public Banco(String codBanco, String nombreBanco) {
        this.codBanco = codBanco;
        this.nombreBanco = nombreBanco;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    
    
    
}
