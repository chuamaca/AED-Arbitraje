/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Model;

/**
 *
 * @author Cesar
 */
public class MRol {

    private String idrol;
    private String nombrerol;
    private boolean estadorol;

    public MRol(String idrol, String nombrerol, boolean estadorol) {
        this.idrol = idrol;
        this.nombrerol = nombrerol;
        this.estadorol = estadorol;
    }

    public MRol() {
    }

    public String getIdrol() {
        return idrol;
    }

    public void setIdrol(String idrol) {
        this.idrol = idrol;
    }

    public String getNamerol() {
        return nombrerol;
    }

    public void setNamerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }

    public boolean isEstadorol() {
        return estadorol;
    }

    public void setEstadorol(boolean estadorol) {
        this.estadorol = estadorol;
    }

}
