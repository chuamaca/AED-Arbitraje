package com.dev.aed.arbitraje.Model;

public class MCriterioAceptacion {

private int id_cuestionario;
    private String pregunta;
    private String descripcion;
    private String respuesta;
    private String obligatorio;
    private String estado;

    public MCriterioAceptacion() {
    }

    public MCriterioAceptacion(int id_cuestionario, String pregunta, String descripcion, String respuesta, String obligatorio, String estado) {
        this.id_cuestionario = id_cuestionario;
        this.pregunta = pregunta;
        this.descripcion = descripcion;
        this.respuesta = respuesta;
        this.obligatorio = obligatorio;
        this.estado = estado;
    }

    public int getId_cuestionario() {
        return id_cuestionario;
    }
    
    public void setId_cuestionario(int id_cuestionario) {
        this.id_cuestionario = id_cuestionario;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(String obligatorio) {
        this.obligatorio = obligatorio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
