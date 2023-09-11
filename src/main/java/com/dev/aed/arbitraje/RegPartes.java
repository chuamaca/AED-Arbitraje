/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje;

/**
 *
 * @author CJesusAc
 */
public class RegPartes {
    private char idPartes;
    private String Nombres, Apellidos, NombreEmp;
    private char Fecha_Nacimiento, Fecha_Creacion, DNI;
    private String Nacionalidad, OrigenEmp, Direccion, Correo;
    private int telefono, RUC;

    public RegPartes(char idPartes, String Nombres, String Apellidos, String NombreEmp, char Fecha_Nacimiento, char Fecha_Creacion, char DNI, String Nacionalidad, String OrigenEmp, String Direccion, String Correo, int telefono, int RUC) {
        this.idPartes = idPartes;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.NombreEmp = NombreEmp;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Fecha_Creacion = Fecha_Creacion;
        this.DNI = DNI;
        this.Nacionalidad = Nacionalidad;
        this.OrigenEmp = OrigenEmp;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.telefono = telefono;
        this.RUC = RUC;
    }

    public char getIdPartes() {
        return idPartes;
    }

    public void setIdPartes(char idPartes) {
        this.idPartes = idPartes;
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

    public String getNombreEmp() {
        return NombreEmp;
    }

    public void setNombreEmp(String NombreEmp) {
        this.NombreEmp = NombreEmp;
    }

    public char getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(char Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public char getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(char Fecha_Creacion) {
        this.Fecha_Creacion = Fecha_Creacion;
    }

    public char getDNI() {
        return DNI;
    }

    public void setDNI(char DNI) {
        this.DNI = DNI;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getOrigenEmp() {
        return OrigenEmp;
    }

    public void setOrigenEmp(String OrigenEmp) {
        this.OrigenEmp = OrigenEmp;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }
    
}
