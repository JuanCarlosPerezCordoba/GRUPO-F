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
public class ParticipacionEnActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IDParticipacion;
    private Integer Nota;
    private String ComentariosNota;
    private Integer HorasDedicadas;
    private String Observaciones;
    private String Estado;

    public Long getIDParticipacion() {
        return IDParticipacion;
    }

    public void setIDParticipacion(Long IDParticipacion) {
        this.IDParticipacion = IDParticipacion;
    }

    public Integer getNota() {
        return Nota;
    }

    public void setNota(Integer Nota) {
        this.Nota = Nota;
    }

    public String getComentariosNota() {
        return ComentariosNota;
    }

    public void setComentariosNota(String ComentariosNota) {
        this.ComentariosNota = ComentariosNota;
    }

    public Integer getHorasDedicadas() {
        return HorasDedicadas;
    }

    public void setHorasDedicadas(Integer HorasDedicadas) {
        this.HorasDedicadas = HorasDedicadas;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.IDParticipacion);
        hash = 97 * hash + Objects.hashCode(this.Nota);
        hash = 97 * hash + Objects.hashCode(this.ComentariosNota);
        hash = 97 * hash + Objects.hashCode(this.HorasDedicadas);
        hash = 97 * hash + Objects.hashCode(this.Observaciones);
        hash = 97 * hash + Objects.hashCode(this.Estado);
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
        final ParticipacionEnActividad other = (ParticipacionEnActividad) obj;
        if (!Objects.equals(this.ComentariosNota, other.ComentariosNota)) {
            return false;
        }
        if (!Objects.equals(this.Observaciones, other.Observaciones)) {
            return false;
        }
        if (!Objects.equals(this.Estado, other.Estado)) {
            return false;
        }
        if (!Objects.equals(this.IDParticipacion, other.IDParticipacion)) {
            return false;
        }
        if (!Objects.equals(this.Nota, other.Nota)) {
            return false;
        }
        if (!Objects.equals(this.HorasDedicadas, other.HorasDedicadas)) {
            return false;
        }
        return true;
    }
    
}
