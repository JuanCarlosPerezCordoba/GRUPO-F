/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grupof.tarea1;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author aleex
 */
@Entity
public class PDI implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Usuario CodPDI;
     private String Departamento;
     private String Titulacion;
     private Long CodActividad;
     private List<Asignatura> Asignaturas;
     private List<Actividad> Actividades;
     

    public Usuario getCodPDI() {
        return CodPDI;
    }

    public void setCodPDI(Usuario CodPDI) {
        this.CodPDI = CodPDI;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public Long getCodActividad() {
        return CodActividad;
    }

    public void setCodActividad(Long CodActividad) {
        this.CodActividad = CodActividad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.CodPDI);
        hash = 67 * hash + Objects.hashCode(this.Departamento);
        hash = 67 * hash + Objects.hashCode(this.Titulacion);
        hash = 67 * hash + Objects.hashCode(this.CodActividad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PDI other = (PDI) obj;
        if (!Objects.equals(this.Departamento, other.Departamento)) {
            return false;
        }
        if (!Objects.equals(this.Titulacion, other.Titulacion)) {
            return false;
        }
        if (!Objects.equals(this.CodPDI, other.CodPDI)) {
            return false;
        }
        if (!Objects.equals(this.CodActividad, other.CodActividad)) {
            return false;
        }
        return true;
    }
    
}
