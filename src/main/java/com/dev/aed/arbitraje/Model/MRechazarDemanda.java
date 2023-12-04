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
public class MRechazarDemanda {

    public int idRechazo;
      public int NroExpediente;
    public String Motivo;
    public String Fecha;
    public String Arbitro;
    public String instancia;
    public String Estado;

    public MRechazarDemanda() {
    }

    public MRechazarDemanda(String Estado) {
        this.Estado = Estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public MRechazarDemanda(int idRechazo, int NroExpediente, String Motivo, String Fecha, String Arbitro, String instancia) {
        this.idRechazo = idRechazo;
        this.NroExpediente = NroExpediente;
        this.Motivo = Motivo;
        this.Fecha = Fecha;
        this.Arbitro = Arbitro;
        this.instancia = instancia;
    }

    public int getIdRechazo() {
        return idRechazo;
    }

    public void setIdRechazo(int idRechazo) {
        this.idRechazo = idRechazo;
    }

    public int getNroExpediente() {
        return NroExpediente;
    }

    public void setNroExpediente(int NroExpediente) {
        this.NroExpediente = NroExpediente;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getArbitro() {
        return Arbitro;
    }

    public void setArbitro(String Arbitro) {
        this.Arbitro = Arbitro;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }


    
    
}
