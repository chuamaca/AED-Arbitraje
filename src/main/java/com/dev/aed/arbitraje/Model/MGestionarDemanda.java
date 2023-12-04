package com.dev.aed.arbitraje.Model;

import java.sql.Date;

public class MGestionarDemanda {

    public String EstadoAudiencia;
    public String ResultadoAudiencia;
    public String FechaAudiencia;

    public MGestionarDemanda() {
    }

    public MGestionarDemanda(String EstadoAudiencia, String ResultadoAudiencia, String FechaAudiencia) {
        this.EstadoAudiencia = EstadoAudiencia;
        this.ResultadoAudiencia = ResultadoAudiencia;
        this.FechaAudiencia = FechaAudiencia;
    }

  
    public String getEstadoAudiencia() {
        return EstadoAudiencia;
    }

    public void setEstadoAudiencia(String EstadoAudiencia) {
        this.EstadoAudiencia = EstadoAudiencia;
    }

    public String getResultadoAudiencia() {
        return ResultadoAudiencia;
    }

    public void setResultadoAudiencia(String ResultadoAudiencia) {
        this.ResultadoAudiencia = ResultadoAudiencia;
    }

    public String getFechaAudiencia() {
        return FechaAudiencia;
    }

    public void setFechaAudiencia(String FechaAudiencia) {
        this.FechaAudiencia = FechaAudiencia;
    }
    
}
