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
public class MNotificacion {

    public int IdNotificacion;
    public String NroExpediente;
    public String EstadoNotificacion;
    public java.sql.Date FechaNotificacion;
    public java.sql.Date FechaVisualizacion;
    public String ColorEstado;
    public String Observaciones;
    public int Leida;
    public String idUsuario;
    

    public MNotificacion() {
    }

    public MNotificacion(int IdNotificacion, String NroExpediente, String EstadoNotificacion, Date FechaNotificacion, Date FechaVisualizacion, String ColorEstado, String Observaciones, int Leida, String idUsuario) {
        this.IdNotificacion = IdNotificacion;
        this.NroExpediente = NroExpediente;
        this.EstadoNotificacion = EstadoNotificacion;
        this.FechaNotificacion = FechaNotificacion;
        this.FechaVisualizacion = FechaVisualizacion;
        this.ColorEstado = ColorEstado;
        this.Observaciones = Observaciones;
        this.Leida = Leida;
        this.idUsuario = idUsuario;
    }
    
    

    public int getIdNotificacion() {
        return IdNotificacion;
    }

    public void setIdNotificacion(int IdNotificacion) {
        this.IdNotificacion = IdNotificacion;
    }

    public String getNroExpediente() {
        return NroExpediente;
    }

    public void setNroExpediente(String NroExpediente) {
        this.NroExpediente = NroExpediente;
    }

    public String getEstadoNotificacion() {
        return EstadoNotificacion;
    }

    public void setEstadoNotificacion(String EstadoNotificacion) {
        this.EstadoNotificacion = EstadoNotificacion;
    }

    public Date getFechaNotificacion() {
        return FechaNotificacion;
    }

    public void setFechaNotificacion(Date FechaNotificacion) {
        this.FechaNotificacion = FechaNotificacion;
    }

    public Date getFechaVisualizacion() {
        return FechaVisualizacion;
    }

    public void setFechaVisualizacion(Date FechaVisualizacion) {
        this.FechaVisualizacion = FechaVisualizacion;
    }

    public String getColorEstado() {
        return ColorEstado;
    }

    public void setColorEstado(String ColorEstado) {
        this.ColorEstado = ColorEstado;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public int getLeida() {
        return Leida;
    }

    public void setLeida(int Leida) {
        this.Leida = Leida;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    
}
