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
public class Organización implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodProyecto;
    private String Nombre;
    private String Sede;
    private String proposito;
    private List<Actividad> Actividades;
    private List<Valoracion> valoraciones;

    public Long getCodProyecto() {
        return CodProyecto;
    }

    public void setCodProyecto(Long CodProyecto) {
        this.CodProyecto = CodProyecto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String Sede) {
        this.Sede = Sede;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.CodProyecto);
        hash = 47 * hash + Objects.hashCode(this.Nombre);
        hash = 47 * hash + Objects.hashCode(this.Sede);
        hash = 47 * hash + Objects.hashCode(this.proposito);
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
        final Organización other = (Organización) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Sede, other.Sede)) {
            return false;
        }
        if (!Objects.equals(this.proposito, other.proposito)) {
            return false;
        }
        if (!Objects.equals(this.CodProyecto, other.CodProyecto)) {
            return false;
        }
        return true;
    }
}
