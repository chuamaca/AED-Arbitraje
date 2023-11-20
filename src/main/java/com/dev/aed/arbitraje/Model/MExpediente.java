/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Model;

import java.sql.Date;

/**
 *
 * @author Cesar
 */
public class MExpediente {

    public int NroExpediente;
    public java.sql.Date FechaDemanda;
    public String DemandanteID;
    public String DemandadoID;
    public String Especialidad;
    public Double Cuantia;
    public String ResumenControversia;
    public String ResumenPeticiones;
    public String DesignacionArbitro;
    public String DeclaracionesCompromiso;
    public String Estado;
    public String DecisionFinal;

    public MExpediente(int NroExpediente, Date FechaDemanda, String DemandanteID, String DemandadoID, String Especialidad, Double Cuantia, String ResumenControversia, String ResumenPeticiones, String DesignacionArbitro, String DeclaracionesCompromiso, String Estado, String DecisionFinal) {
        this.NroExpediente = NroExpediente;
        this.FechaDemanda = FechaDemanda;
        this.DemandanteID = DemandanteID;
        this.DemandadoID = DemandadoID;
        this.Especialidad = Especialidad;
        this.Cuantia = Cuantia;
        this.ResumenControversia = ResumenControversia;
        this.ResumenPeticiones = ResumenPeticiones;
        this.DesignacionArbitro = DesignacionArbitro;
        this.DeclaracionesCompromiso = DeclaracionesCompromiso;
        this.Estado = Estado;
        this.DecisionFinal = DecisionFinal;
    }

    public int getNroExpediente() {
        return NroExpediente;
    }

    public void setNroExpediente(int NroExpediente) {
        this.NroExpediente = NroExpediente;
    }

    public Date getFechaDemanda() {
        return FechaDemanda;
    }

    public void setFechaDemanda(Date FechaDemanda) {
        this.FechaDemanda = FechaDemanda;
    }

    public String getDemandanteID() {
        return DemandanteID;
    }

    public void setDemandanteID(String DemandanteID) {
        this.DemandanteID = DemandanteID;
    }

    public String getDemandadoID() {
        return DemandadoID;
    }

    public void setDemandadoID(String DemandadoID) {
        this.DemandadoID = DemandadoID;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public Double getCuantia() {
        return Cuantia;
    }

    public void setCuantia(Double Cuantia) {
        this.Cuantia = Cuantia;
    }

    public String getResumenControversia() {
        return ResumenControversia;
    }

    public void setResumenControversia(String ResumenControversia) {
        this.ResumenControversia = ResumenControversia;
    }

    public String getResumenPeticiones() {
        return ResumenPeticiones;
    }

    public void setResumenPeticiones(String ResumenPeticiones) {
        this.ResumenPeticiones = ResumenPeticiones;
    }

    public String getDesignacionArbitro() {
        return DesignacionArbitro;
    }

    public void setDesignacionArbitro(String DesignacionArbitro) {
        this.DesignacionArbitro = DesignacionArbitro;
    }

    public String getDeclaracionesCompromiso() {
        return DeclaracionesCompromiso;
    }

    public void setDeclaracionesCompromiso(String DeclaracionesCompromiso) {
        this.DeclaracionesCompromiso = DeclaracionesCompromiso;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getDecisionFinal() {
        return DecisionFinal;
    }

    public void setDecisionFinal(String DecisionFinal) {
        this.DecisionFinal = DecisionFinal;
    }

   
    public MExpediente() {
    }
 
    
    
}
