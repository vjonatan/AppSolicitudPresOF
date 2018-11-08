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
public class Localidad {
    private String codLocalidad;            //cloca
    private String descripcionLocalidad;    //dloca
    private int codigoPostal;               //postal
    private String departamento;            //dpto
    private String provincia;               //pcia

    public Localidad(String codLocalidad, String descripcionLocalidad, int codigoPostal, String departamento, String provincia) {
        this.codLocalidad = codLocalidad;
        this.descripcionLocalidad = descripcionLocalidad;
        this.codigoPostal = codigoPostal;
        this.departamento = departamento;
        this.provincia = provincia;
    }

    public String getCodLocalidad() {
        return codLocalidad;
    }

    public void setCodLocalidad(String codLocalidad) {
        this.codLocalidad = codLocalidad;
    }

    public String getDescripcionLocalidad() {
        return descripcionLocalidad;
    }

    public void setDescripcionLocalidad(String descripcionLocalidad) {
        this.descripcionLocalidad = descripcionLocalidad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return this.getCodLocalidad() + " - " + this.getDescripcionLocalidad() + " - " 
             + this.getCodigoPostal() + " - " + this.getDepartamento() + " - " + this.getProvincia();
    }
    
    
    
    
}
