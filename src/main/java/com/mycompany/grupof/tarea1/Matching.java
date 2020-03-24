/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grupof.tarea1;

import java.io.Serializable;
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
public class Matching implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String InfoTitulacion;
    private String InfoIdiomas;
    private String InfoPreferencias;
    private String InfoCapacidades;
    private String TipoActividad;
    private String AmbitoActividad;

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getInfoTitulacion() {
        return InfoTitulacion;
    }

    public void setInfoTitulacion(String InfoTitulacion) {
        this.InfoTitulacion = InfoTitulacion;
    }

    public String getInfoIdiomas() {
        return InfoIdiomas;
    }

    public void setInfoIdiomas(String InfoIdiomas) {
        this.InfoIdiomas = InfoIdiomas;
    }

    public String getInfoPreferencias() {
        return InfoPreferencias;
    }

    public void setInfoPreferencias(String InfoPreferencias) {
        this.InfoPreferencias = InfoPreferencias;
    }

    public String getInfoCapacidades() {
        return InfoCapacidades;
    }

    public void setInfoCapacidades(String InfoCapacidades) {
        this.InfoCapacidades = InfoCapacidades;
    }

    public String getTipoActividad() {
        return TipoActividad;
    }

    public void setTipoActividad(String TipoActividad) {
        this.TipoActividad = TipoActividad;
    }

    public String getAmbitoActividad() {
        return AmbitoActividad;
    }

    public void setAmbitoActividad(String AmbitoActividad) {
        this.AmbitoActividad = AmbitoActividad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.InfoTitulacion);
        hash = 89 * hash + Objects.hashCode(this.InfoIdiomas);
        hash = 89 * hash + Objects.hashCode(this.InfoPreferencias);
        hash = 89 * hash + Objects.hashCode(this.InfoCapacidades);
        hash = 89 * hash + Objects.hashCode(this.TipoActividad);
        hash = 89 * hash + Objects.hashCode(this.AmbitoActividad);
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
        final Matching other = (Matching) obj;
        if (!Objects.equals(this.InfoTitulacion, other.InfoTitulacion)) {
            return false;
        }
        if (!Objects.equals(this.InfoIdiomas, other.InfoIdiomas)) {
            return false;
        }
        if (!Objects.equals(this.InfoPreferencias, other.InfoPreferencias)) {
            return false;
        }
        if (!Objects.equals(this.InfoCapacidades, other.InfoCapacidades)) {
            return false;
        }
        if (!Objects.equals(this.TipoActividad, other.TipoActividad)) {
            return false;
        }
        if (!Objects.equals(this.AmbitoActividad, other.AmbitoActividad)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
}
