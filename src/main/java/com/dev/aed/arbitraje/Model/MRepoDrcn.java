package com.dev.aed.arbitraje.Model;

import java.sql.Date;

public class MRepoDrcn {

    public int NroExpediente;
    public Date FechaDemanda;
    public Date FechaAprobacion;
    String Estado;
    public int DiasTranscurridos;

    public MRepoDrcn() {
    }

    public MRepoDrcn(int NroExpediente, Date FechaDemanda) {
        this.NroExpediente = NroExpediente;
        this.FechaDemanda = FechaDemanda;
    }

    public MRepoDrcn(int NroExpediente, Date FechaDemanda, Date FechaAprobacion, String Estado, int DiasTranscurridos) {
        this.NroExpediente = NroExpediente;
        this.FechaDemanda = FechaDemanda;
        this.FechaAprobacion = FechaAprobacion;
        this.Estado = Estado;
        this.DiasTranscurridos = DiasTranscurridos;
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

    public Date getFechaAprobacion() {
        return FechaAprobacion;
    }

    public void setFechaAprobacion(Date FechaAprobacion) {
        this.FechaAprobacion = FechaAprobacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getDiasTranscurridos() {
        return DiasTranscurridos;
    }

    public void setDiasTranscurridos(int DiasTranscurridos) {
        this.DiasTranscurridos = DiasTranscurridos;
    }

}
