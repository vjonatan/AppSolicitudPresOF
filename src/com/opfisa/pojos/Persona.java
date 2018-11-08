/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opfisa.pojos;

import java.sql.Date;

/**
 *
 * @author ACER
 */
public class Persona {
    private int documento;
    private int tipoDocumento;
    private String razon;
    private String calle;
    private String ubica;    
    private String codLocalidad;
    private String telefono;
    private Date fechaNacimiento;       //nacido
    private String sexo;
    private String estadoCivil;         //ecivil
    private String lugarTrabajo;        //trabajo
    private String calleTrabajo;        //tcalle
    private String ubicacionNroTrabajo; //tubica
    private String codLocalidadTrabajo; //tcloca
    private String telefonoTrabajo;     //ttelefo
    private String seccionTrabajo;      //tseccion
    private double sueldo;
    private Date fechaActualizacion;    //factual
    private Date fechaBaja;             //fbaja
    private String telefonoMovil;       //telmovil
    private String telefonoReferencia;  //telref
    private String email;               
    private String idCodCtaBancaria;    //cctabanc
    private int documentoConyugue;      //docucony
    private int documentoGarante;       //docugara

    public Persona(int documento, int tipoDocumento, String razon, String calle, String ubica, String codLocalidad, String telefono, Date fechaNacimiento, String sexo, String estadoCivil, String lugarTrabajo, String calleTrabajo, String ubicacionNroTrabajo, String codLocalidadTrabajo, String telefonoTrabajo, String seccionTrabajo, double sueldo, Date fechaActualizacion, Date fechaBaja, String telefonoMovil, String telefonoReferencia, String email, String idCodCtaBancaria, int documentoConyugue, int documentoGarante) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.razon = razon;
        this.calle = calle;
        this.ubica = ubica;
        this.codLocalidad = codLocalidad;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.lugarTrabajo = lugarTrabajo;
        this.calleTrabajo = calleTrabajo;
        this.ubicacionNroTrabajo = ubicacionNroTrabajo;
        this.codLocalidadTrabajo = codLocalidadTrabajo;
        this.telefonoTrabajo = telefonoTrabajo;
        this.seccionTrabajo = seccionTrabajo;
        this.sueldo = sueldo;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaBaja = fechaBaja;
        this.telefonoMovil = telefonoMovil;
        this.telefonoReferencia = telefonoReferencia;
        this.email = email;
        this.idCodCtaBancaria = idCodCtaBancaria;
        this.documentoConyugue = documentoConyugue;
        this.documentoGarante = documentoGarante;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getUbica() {
        return ubica;
    }

    public void setUbica(String ubica) {
        this.ubica = ubica;
    }

    public String getCodLocalidad() {
        return codLocalidad;
    }

    public void setCodLocalidad(String codLocalidad) {
        this.codLocalidad = codLocalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getCalleTrabajo() {
        return calleTrabajo;
    }

    public void setCalleTrabajo(String calleTrabajo) {
        this.calleTrabajo = calleTrabajo;
    }

    public String getUbicacionNroTrabajo() {
        return ubicacionNroTrabajo;
    }

    public void setUbicacionNroTrabajo(String ubicacionNroTrabajo) {
        this.ubicacionNroTrabajo = ubicacionNroTrabajo;
    }

    public String getCodLocalidadTrabajo() {
        return codLocalidadTrabajo;
    }

    public void setCodLocalidadTrabajo(String codLocalidadTrabajo) {
        this.codLocalidadTrabajo = codLocalidadTrabajo;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String getSeccionTrabajo() {
        return seccionTrabajo;
    }

    public void setSeccionTrabajo(String seccionTrabajo) {
        this.seccionTrabajo = seccionTrabajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoReferencia() {
        return telefonoReferencia;
    }

    public void setTelefonoReferencia(String telefonoReferencia) {
        this.telefonoReferencia = telefonoReferencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCodCtaBancaria() {
        return idCodCtaBancaria;
    }

    public void setIdCodCtaBancaria(String idCodCtaBancaria) {
        this.idCodCtaBancaria = idCodCtaBancaria;
    }

    public int getDocumentoConyugue() {
        return documentoConyugue;
    }

    public void setDocumentoConyugue(int documentoConyugue) {
        this.documentoConyugue = documentoConyugue;
    }

    public int getDocumentoGarante() {
        return documentoGarante;
    }

    public void setDocumentoGarante(int documentoGarante) {
        this.documentoGarante = documentoGarante;
    }

    @Override
    public String toString() {
        return this.getRazon() + " - " + this.getDocumento();
    }
    
    
    
}
