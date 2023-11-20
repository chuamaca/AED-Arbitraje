
package com.dev.aed.arbitraje.Model;

import java.sql.Date;

/**
 *
 * @author Cesar
 */
public class MVerExpediente {

    public int NroExpediente;
    public String DemandanteID;
    public String DemandadoID;
    public String DesignacionArbitro;
    public String Estado;

    public MVerExpediente() {
    }

    public MVerExpediente(int NroExpediente, String DemandanteID, String DemandadoID, String DesignacionArbitro, String Estado) {
        this.NroExpediente = NroExpediente;
        this.DemandanteID = DemandanteID;
        this.DemandadoID = DemandadoID;
        this.DesignacionArbitro = DesignacionArbitro;
        this.Estado = Estado;
    }

    public int getNroExpediente() {
        return NroExpediente;
    }

    public void setNroExpediente(int NroExpediente) {
        this.NroExpediente = NroExpediente;
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

    public String getDesignacionArbitro() {
        return DesignacionArbitro;
    }

    public void setDesignacionArbitro(String DesignacionArbitro) {
        this.DesignacionArbitro = DesignacionArbitro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }


  
}
