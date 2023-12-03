package com.dev.aed.arbitraje.Model;

import java.sql.Date;

public class MGestionarAudiencia {

    public String idAudiencia;
    public String NumerodeExpediente;
    public String FechadeProgramacion;
    public String LugardeAudiencia;
    public String Arbitro;
    public String Estado;
    public String EstadoAudiencia;
    public String ResultadoAudiencia;
    public String FechaAudiencia;

    public MGestionarAudiencia() {
    }

    public MGestionarAudiencia(String idAudiencia, String NumerodeExpediente, String FechadeProgramacion, String LugardeAudiencia, String Arbitro, String Estado, String EstadoAudiencia, String ResultadoAudiencia, String FechaAudiencia) {
        this.idAudiencia = idAudiencia;
        this.NumerodeExpediente = NumerodeExpediente;
        this.FechadeProgramacion = FechadeProgramacion;
        this.LugardeAudiencia = LugardeAudiencia;
        this.Arbitro = Arbitro;
        this.Estado = Estado;
        this.EstadoAudiencia = EstadoAudiencia;
        this.ResultadoAudiencia = ResultadoAudiencia;
        this.FechaAudiencia = FechaAudiencia;
    }

    public MGestionarAudiencia(String EstadoAudiencia, String ResultadoAudiencia, String FechaAudiencia) {
        this.EstadoAudiencia = EstadoAudiencia;
        this.ResultadoAudiencia = ResultadoAudiencia;
        this.FechaAudiencia = FechaAudiencia;
    }

    public String getIdAudiencia() {
        return idAudiencia;
    }

    public void setIdAudiencia(String idAudiencia) {
        this.idAudiencia = idAudiencia;
    }

    public String getNumerodeExpediente() {
        return NumerodeExpediente;
    }

    public void setNumerodeExpediente(String NumerodeExpediente) {
        this.NumerodeExpediente = NumerodeExpediente;
    }

    public String getFechadeProgramacion() {
        return FechadeProgramacion;
    }

    public void setFechadeProgramacion(String FechadeProgramacion) {
        this.FechadeProgramacion = FechadeProgramacion;
    }

    public String getLugardeAudiencia() {
        return LugardeAudiencia;
    }

    public void setLugardeAudiencia(String LugardeAudiencia) {
        this.LugardeAudiencia = LugardeAudiencia;
    }

    public String getArbitro() {
        return Arbitro;
    }

    public void setArbitro(String Arbitro) {
        this.Arbitro = Arbitro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
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
