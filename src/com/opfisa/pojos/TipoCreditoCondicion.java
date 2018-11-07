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
public class TipoCreditoCondicion {
    private int idCondTC;                           //idcondtc
    private String sexoSolicitante;                 //sexo
    private int edadSolicitanteDesde;               //edadsold
    private int edadSolicitanteHasta;               //edadsolh
    private String estadoActividadSolicitante;      //estacti

    public TipoCreditoCondicion(int idCondTC, String sexoSolicitante, int edadSolicitanteDesde, int edadSolicitanteHasta, String estadoActividadSolicitante) {
        this.idCondTC = idCondTC;
        this.sexoSolicitante = sexoSolicitante;
        this.edadSolicitanteDesde = edadSolicitanteDesde;
        this.edadSolicitanteHasta = edadSolicitanteHasta;
        this.estadoActividadSolicitante = estadoActividadSolicitante;
    }

    public int getIdCondTC() {
        return idCondTC;
    }

    public void setIdCondTC(int idCondTC) {
        this.idCondTC = idCondTC;
    }

    public String getSexoSolicitante() {
        return sexoSolicitante;
    }

    public void setSexoSolicitante(String sexoSolicitante) {
        this.sexoSolicitante = sexoSolicitante;
    }

    public int getEdadSolicitanteDesde() {
        return edadSolicitanteDesde;
    }

    public void setEdadSolicitanteDesde(int edadSolicitanteDesde) {
        this.edadSolicitanteDesde = edadSolicitanteDesde;
    }

    public int getEdadSolicitanteHasta() {
        return edadSolicitanteHasta;
    }

    public void setEdadSolicitanteHasta(int edadSolicitanteHasta) {
        this.edadSolicitanteHasta = edadSolicitanteHasta;
    }

    public String getEstadoActividadSolicitante() {
        return estadoActividadSolicitante;
    }

    public void setEstadoActividadSolicitante(String estadoActividadSolicitante) {
        this.estadoActividadSolicitante = estadoActividadSolicitante;
    }
    
    
}
