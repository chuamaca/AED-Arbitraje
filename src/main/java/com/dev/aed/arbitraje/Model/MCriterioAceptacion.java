package com.dev.aed.arbitraje.Model;

public class MCriterioAceptacion {


    private String pregunta;
    private String Descripcion;
    private String respuesta;
    private String obligatorio;
    private String estado;

    public MCriterioAceptacion() {
    }

    public MCriterioAceptacion(String pregunta, String Descripcion, String respuesta, String obligatorio, String estado) {
        this.pregunta = pregunta;
        this.Descripcion = Descripcion;
        this.respuesta = respuesta;
        this.obligatorio = obligatorio;
        this.estado = estado;
    }

    
    


    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
