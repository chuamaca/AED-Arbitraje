
package com.dev.aed.arbitraje.Model;

import java.sql.Date;

public class Persona_VerExpediente {

   private String Nombres;
    private String Apellidos;
    private String DemandanteID;

    public Persona_VerExpediente(String Nombres, String Apellidos, String DemandanteID) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.DemandanteID = DemandanteID;
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

    public String getDemandanteID() {
        return DemandanteID;
    }

    public void setDemandanteID(String DemandanteID) {
        this.DemandanteID = DemandanteID;
    }

  
   


  
}
