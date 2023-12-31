
package com.dev.aed.arbitraje;


public class RegRegistrarPartes {
    private String partes, Nombres, Apellidos, NombreE, OrigenE, Direccion, FechaNa, FechaCre, Nacionalidad, Correo;
    private int DNI, Ruc, Telefono;

    public RegRegistrarPartes(String partes, String Nombres, String Apellidos, String NombreE, String OrigenE, String Direccion, String FechaNa, String FechaCre, String Nacionalidad, String Correo, int DNI, int Ruc, int Telefono) {
        this.partes = partes;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.NombreE = NombreE;
        this.OrigenE = OrigenE;
        this.Direccion = Direccion;
        this.FechaNa = FechaNa;
        this.FechaCre = FechaCre;
        this.Nacionalidad = Nacionalidad;
        this.Correo = Correo;
        this.DNI = DNI;
        this.Ruc = Ruc;
        this.Telefono = Telefono;
    }

    public String getPartes() {
        return partes;
    }

    public void setPartes(String partes) {
        this.partes = partes;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getOrigenE() {
        return OrigenE;
    }

    public void setOrigenE(String OrigenE) {
        this.OrigenE = OrigenE;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechaNa() {
        return FechaNa;
    }

    public void setFechaNa(String FechaNa) {
        this.FechaNa = FechaNa;
    }

    public String getFechaCre() {
        return FechaCre;
    }

    public void setFechaCre(String FechaCre) {
        this.FechaCre = FechaCre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getRuc() {
        return Ruc;
    }

    public void setRuc(int Ruc) {
        this.Ruc = Ruc;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
}
