/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Model;

/**
 *
 * @author Cesar
 */
public class MUsuario extends MRol {

    private int id_usuario;
    private String username;
    private String password;
    private int nro_intentos;
    private boolean flag_estado;

    public MUsuario() {
    }

    public MUsuario(int id_usuario, String username, String password, int nro_intentos, boolean flag_estado, String idrol, String nombrerol, boolean estadorol) {
        super(idrol, nombrerol, estadorol);
        this.id_usuario = id_usuario;
        this.username = username;
        this.password = password;
        this.nro_intentos = nro_intentos;
        this.flag_estado = flag_estado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNro_intentos() {
        return nro_intentos;
    }

    public void setNro_intentos(int nro_intentos) {
        this.nro_intentos = nro_intentos;
    }

    public boolean isFlag_estado() {
        return flag_estado;
    }

    public void setFlag_estado(boolean flag_estado) {
        this.flag_estado = flag_estado;
    }

}
