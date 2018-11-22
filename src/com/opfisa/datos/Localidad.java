/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.datos;

/**
 *
 * @author ACER
 */
public class Localidad {
    private String codigoLocalidad;
    private String descripcionLocalidad;
    private int codigoPostal;
    private String departamento;
    private String provincia;  

    public Localidad(String codigoLocalidad, String descripcionLocalidad, int codigoPostal, String departamento, String provincia) {
        this.codigoLocalidad = codigoLocalidad;
        this.descripcionLocalidad = descripcionLocalidad;
        this.codigoPostal = codigoPostal;
        this.departamento = departamento;
        this.provincia = provincia;
    }

    public Localidad() {
    }

    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(String codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
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
        return this.getDescripcionLocalidad(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
