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
public class MAnexo {
    
        public int IdAnexo;
	public String NroExpediente;
	public String TipoDocumento;
	public String NombreDocumento;
	public String Formato;
	public java.sql.Date FechaCarga;
	public int EstadoCarga;
	public String Usuario;
        public byte[] archivopdf;

    public MAnexo() {
    }

    public MAnexo(int IdAnexo, String NroExpediente, String TipoDocumento, String NombreDocumento, String Formato, Date FechaCarga, int EstadoCarga, String Usuario) {
        this.IdAnexo = IdAnexo;
        this.NroExpediente = NroExpediente;
        this.TipoDocumento = TipoDocumento;
        this.NombreDocumento = NombreDocumento;
        this.Formato = Formato;
        this.FechaCarga = FechaCarga;
        this.EstadoCarga = EstadoCarga;
        this.Usuario = Usuario;
    }

    public MAnexo(int IdAnexo, String NroExpediente, String TipoDocumento, String NombreDocumento, String Formato, Date FechaCarga, int EstadoCarga, String Usuario, byte[] archivopdf) {
        this.IdAnexo = IdAnexo;
        this.NroExpediente = NroExpediente;
        this.TipoDocumento = TipoDocumento;
        this.NombreDocumento = NombreDocumento;
        this.Formato = Formato;
        this.FechaCarga = FechaCarga;
        this.EstadoCarga = EstadoCarga;
        this.Usuario = Usuario;
        this.archivopdf = archivopdf;
    }

    public int getIdAnexo() {
        return IdAnexo;
    }

    public void setIdAnexo(int IdAnexo) {
        this.IdAnexo = IdAnexo;
    }

    public String getNroExpediente() {
        return NroExpediente;
    }

    public void setNroExpediente(String NroExpediente) {
        this.NroExpediente = NroExpediente;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNombreDocumento() {
        return NombreDocumento;
    }

    public void setNombreDocumento(String NombreDocumento) {
        this.NombreDocumento = NombreDocumento;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public Date getFechaCarga() {
        return FechaCarga;
    }

    public void setFechaCarga(Date FechaCarga) {
        this.FechaCarga = FechaCarga;
    }

    public int getEstadoCarga() {
        return EstadoCarga;
    }

    public void setEstadoCarga(int EstadoCarga) {
        this.EstadoCarga = EstadoCarga;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public byte[] getArchivopdf() {
        return archivopdf;
    }

    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }
    
    
    
        
        
}
