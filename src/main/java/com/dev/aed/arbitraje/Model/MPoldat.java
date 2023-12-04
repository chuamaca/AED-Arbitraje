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
public class MPoldat {
    
    //Clase para Model de Base de datos, Herencia, Interfaces
    public int srtseq;
    public String polcod;
    public String polvar;
    public String polval;
    public String wh_id_tmpl;
    public String rtstr1;
    public String rtstr2;
    public int rtnum1;
    public int rtnum2;
    public int rtflt1;
    public int rtflt2;
    public java.sql.Date moddte;
    public String mod_usr_id;
    public String grp_nam;

    public MPoldat(String polval, String rtstr1, String rtstr2) {
        this.polval = polval;
        this.rtstr1 = rtstr1;
        this.rtstr2 = rtstr2;
    }

    public MPoldat(int srtseq, String polcod, String polvar, String polval, String wh_id_tmpl, String rtstr1, String rtstr2, int rtnum1, int rtnum2, int rtflt1, int rtflt2, Date moddte, String mod_usr_id, String grp_nam) {
        this.srtseq = srtseq;
        this.polcod = polcod;
        this.polvar = polvar;
        this.polval = polval;
        this.wh_id_tmpl = wh_id_tmpl;
        this.rtstr1 = rtstr1;
        this.rtstr2 = rtstr2;
        this.rtnum1 = rtnum1;
        this.rtnum2 = rtnum2;
        this.rtflt1 = rtflt1;
        this.rtflt2 = rtflt2;
        this.moddte = moddte;
        this.mod_usr_id = mod_usr_id;
        this.grp_nam = grp_nam;
    }
    
    
    

    public MPoldat() {
    }

    public int getSrtseq() {
        return srtseq;
    }

    public void setSrtseq(int srtseq) {
        this.srtseq = srtseq;
    }

    public String getPolcod() {
        return polcod;
    }

    public void setPolcod(String polcod) {
        this.polcod = polcod;
    }

    public String getPolvar() {
        return polvar;
    }

    public void setPolvar(String polvar) {
        this.polvar = polvar;
    }

    public String getPolval() {
        return polval;
    }

    public void setPolval(String polval) {
        this.polval = polval;
    }

    public String getWh_id_tmpl() {
        return wh_id_tmpl;
    }

    public void setWh_id_tmpl(String wh_id_tmpl) {
        this.wh_id_tmpl = wh_id_tmpl;
    }

    public String getRtstr1() {
        return rtstr1;
    }

    public void setRtstr1(String rtstr1) {
        this.rtstr1 = rtstr1;
    }

    public String getRtstr2() {
        return rtstr2;
    }

    public void setRtstr2(String rtstr2) {
        this.rtstr2 = rtstr2;
    }

    public int getRtnum1() {
        return rtnum1;
    }

    public void setRtnum1(int rtnum1) {
        this.rtnum1 = rtnum1;
    }

    public int getRtnum2() {
        return rtnum2;
    }

    public void setRtnum2(int rtnum2) {
        this.rtnum2 = rtnum2;
    }

    public int getRtflt1() {
        return rtflt1;
    }

    public void setRtflt1(int rtflt1) {
        this.rtflt1 = rtflt1;
    }

    public int getRtflt2() {
        return rtflt2;
    }

    public void setRtflt2(int rtflt2) {
        this.rtflt2 = rtflt2;
    }

    public Date getModdte() {
        return moddte;
    }

    public void setModdte(Date moddte) {
        this.moddte = moddte;
    }

    public String getMod_usr_id() {
        return mod_usr_id;
    }

    public void setMod_usr_id(String mod_usr_id) {
        this.mod_usr_id = mod_usr_id;
    }

    public String getGrp_nam() {
        return grp_nam;
    }

    public void setGrp_nam(String grp_nam) {
        this.grp_nam = grp_nam;
    }

    @Override
    public String toString() {
        return "Poldat{" + "srtseq=" + srtseq + ", polcod=" + polcod + ", polvar=" + polvar + ", polval=" + polval + ", wh_id_tmpl=" + wh_id_tmpl + ", rtstr1=" + rtstr1 + ", rtstr2=" + rtstr2 + ", rtnum1=" + rtnum1 + ", rtnum2=" + rtnum2 + ", rtflt1=" + rtflt1 + ", rtflt2=" + rtflt2 + ", moddte=" + moddte + ", mod_usr_id=" + mod_usr_id + ", grp_nam=" + grp_nam + '}';
    }
    
}
