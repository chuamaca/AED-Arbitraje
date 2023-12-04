
package com.dev.aed.arbitraje.Model;

import java.sql.Date;

public class MAceptarDemanda {
    
    public int idAceptar;
    public int NroExpediente;
    public String Estado;
    public Double Cuantia;
    public String AsignacionArbitro;
    public String Arbitro1;
    public String instancia;
    public String InformacionDeArbitro;
    
     public MAceptarDemanda() {
    }

    public MAceptarDemanda(int idAceptar, int NroExpediente, String Estado, Double Cuantia, String AsignacionArbitro, String Arbitro1, String instancia, String InformacionDeArbitro) {
        this.idAceptar = idAceptar;
        this.NroExpediente = NroExpediente;
        this.Estado = Estado;
        this.Cuantia = Cuantia;
        this.AsignacionArbitro = AsignacionArbitro;
        this.Arbitro1 = Arbitro1;
        this.instancia = instancia;
        this.InformacionDeArbitro = InformacionDeArbitro;
    }


    public int getIdAceptar() {
        return idAceptar;
    }

    public void setIdAceptar(int idAceptar) {
        this.idAceptar = idAceptar;
    }

    public int getNroExpediente() {
        return NroExpediente;
    }

    public void setNroExpediente(int NroExpediente) {
        this.NroExpediente = NroExpediente;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Double getCuantia() {
        return Cuantia;
    }

    public void setCuantia(Double Cuantia) {
        this.Cuantia = Cuantia;
    }

    public String getAsignacionArbitro() {
        return AsignacionArbitro;
    }

    public void setAsignacionArbitro(String AsignacionArbitro) {
        this.AsignacionArbitro = AsignacionArbitro;
    }

    public String getArbitro1() {
        return Arbitro1;
    }

    public void setArbitro1(String Arbitro1) {
        this.Arbitro1 = Arbitro1;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getInformacionDeArbitro() {
        return InformacionDeArbitro;
    }

    public void setInformacionDeArbitro(String InformacionDeArbitro) {
        this.InformacionDeArbitro = InformacionDeArbitro;
    }
    
    
}
