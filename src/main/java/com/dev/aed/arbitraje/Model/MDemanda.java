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
public class MDemanda {
    
    public int Iddemanda;
    public String NroExpediente;
    public java.sql.Date FechaDemanda;
    public String DemandanteID;
    public String DemandadoID;
    public String Ubigeo;
    public String Especialidad;
    public Double Cuantia;
    public int IdAnexo;
    public String ResumenControversia;
    public String ResumenPeticiones;
    public String DesignacionArbitro;
    public String DeclaracionesCompromiso;
    public String Estado;
    public String DecisionFinal;
    public String MotivoAnulacion;
    public String SustentoAnulacion;
    public java.sql.Date FechaAprobacion;
    public int UsuarioAprobador;
    public String usuario;
    
    public String refNroexpediente;
    public String refMotivo;

    public MDemanda(int Iddemanda, String NroExpediente, Date FechaDemanda, String DemandanteID, String DemandadoID, String Ubigeo, String Especialidad, Double Cuantia, int IdAnexo, String ResumenControversia, String ResumenPeticiones, String DesignacionArbitro, String DeclaracionesCompromiso, String Estado, String DecisionFinal, String MotivoAnulacion, String SustentoAnulacion, Date FechaAprobacion, int UsuarioAprobador, String usuario) {
        
        this.Iddemanda=Iddemanda;
        this.NroExpediente = NroExpediente;
        this.FechaDemanda = FechaDemanda;
        this.DemandanteID = DemandanteID;
        this.DemandadoID = DemandadoID;
        this.Ubigeo = Ubigeo;
        this.Especialidad = Especialidad;
        this.Cuantia = Cuantia;
        this.IdAnexo = IdAnexo;
        this.ResumenControversia = ResumenControversia;
        this.ResumenPeticiones = ResumenPeticiones;
        this.DesignacionArbitro = DesignacionArbitro;
        this.DeclaracionesCompromiso = DeclaracionesCompromiso;
        this.Estado = Estado;
        this.DecisionFinal = DecisionFinal;
        this.MotivoAnulacion = MotivoAnulacion;
        this.SustentoAnulacion = SustentoAnulacion;
        this.FechaAprobacion = FechaAprobacion;
        this.UsuarioAprobador = UsuarioAprobador;
        this.usuario = usuario;
    }

    public MDemanda(int Iddemanda, String NroExpediente, Date FechaDemanda, String DemandanteID, String DemandadoID, String Ubigeo, String Especialidad, Double Cuantia, int IdAnexo, String ResumenControversia, String ResumenPeticiones, String DesignacionArbitro, String DeclaracionesCompromiso, String Estado, String DecisionFinal, String MotivoAnulacion, String SustentoAnulacion, Date FechaAprobacion, int UsuarioAprobador, String usuario, String refNroexpediente, String refMotivo) {
        this.Iddemanda = Iddemanda;
        this.NroExpediente = NroExpediente;
        this.FechaDemanda = FechaDemanda;
        this.DemandanteID = DemandanteID;
        this.DemandadoID = DemandadoID;
        this.Ubigeo = Ubigeo;
        this.Especialidad = Especialidad;
        this.Cuantia = Cuantia;
        this.IdAnexo = IdAnexo;
        this.ResumenControversia = ResumenControversia;
        this.ResumenPeticiones = ResumenPeticiones;
        this.DesignacionArbitro = DesignacionArbitro;
        this.DeclaracionesCompromiso = DeclaracionesCompromiso;
        this.Estado = Estado;
        this.DecisionFinal = DecisionFinal;
        this.MotivoAnulacion = MotivoAnulacion;
        this.SustentoAnulacion = SustentoAnulacion;
        this.FechaAprobacion = FechaAprobacion;
        this.UsuarioAprobador = UsuarioAprobador;
        this.usuario = usuario;
        this.refNroexpediente = refNroexpediente;
        this.refMotivo = refMotivo;
    }
    
    

 

    public String getRefMotivo() {
        return refMotivo;
    }

    public void setRefMotivo(String refMotivo) {
        this.refMotivo = refMotivo;
    }

    public String getRefNroexpediente() {
        return refNroexpediente;
    }

    public void setRefNroexpediente(String refNroexpediente) {
        this.refNroexpediente = refNroexpediente;
    }

   
    
    public MDemanda() {
    }
    
    
        public int getIddemanda() {
        return Iddemanda;
    }

    public void setIddemanda(int Iddemanda) {
        this.Iddemanda = Iddemanda;
    }

    public String getNroExpediente() {
        return NroExpediente;
    }

    public void setNroExpediente(String NroExpediente) {
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

    public String getUbigeo() {
        return Ubigeo;
    }

    public void setUbigeo(String Ubigeo) {
        this.Ubigeo = Ubigeo;
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

    public int getIdAnexo() {
        return IdAnexo;
    }

    public void setIdAnexo(int IdAnexo) {
        this.IdAnexo = IdAnexo;
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

    public String getMotivoAnulacion() {
        return MotivoAnulacion;
    }

    public void setMotivoAnulacion(String MotivoAnulacion) {
        this.MotivoAnulacion = MotivoAnulacion;
    }

    public String getSustentoAnulacion() {
        return SustentoAnulacion;
    }

    public void setSustentoAnulacion(String SustentoAnulacion) {
        this.SustentoAnulacion = SustentoAnulacion;
    }

    public Date getFechaAprobacion() {
        return FechaAprobacion;
    }

    public void setFechaAprobacion(Date FechaAprobacion) {
        this.FechaAprobacion = FechaAprobacion;
    }

    public int getUsuarioAprobador() {
        return UsuarioAprobador;
    }

    public void setUsuarioAprobador(int UsuarioAprobador) {
        this.UsuarioAprobador = UsuarioAprobador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
    
    
}
