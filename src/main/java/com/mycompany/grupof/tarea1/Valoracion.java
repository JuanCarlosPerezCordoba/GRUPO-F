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
public class Valoracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IDValoracion;
    private String TipoValoracion;
    private Integer Calificacion;
    private String Comentarios;

    public Long getIDValoracion() {
        return IDValoracion;
    }

    public void setIDValoracion(Long IDValoracion) {
        this.IDValoracion = IDValoracion;
    }

    public String getTipoValoracion() {
        return TipoValoracion;
    }

    public void setTipoValoracion(String TipoValoracion) {
        this.TipoValoracion = TipoValoracion;
    }

    public Integer getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Integer Calificacion) {
        this.Calificacion = Calificacion;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.IDValoracion);
        hash = 37 * hash + Objects.hashCode(this.TipoValoracion);
        hash = 37 * hash + Objects.hashCode(this.Calificacion);
        hash = 37 * hash + Objects.hashCode(this.Comentarios);
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
        final Valoracion other = (Valoracion) obj;
        if (!Objects.equals(this.TipoValoracion, other.TipoValoracion)) {
            return false;
        }
        if (!Objects.equals(this.Comentarios, other.Comentarios)) {
            return false;
        }
        if (!Objects.equals(this.IDValoracion, other.IDValoracion)) {
            return false;
        }
        if (!Objects.equals(this.Calificacion, other.Calificacion)) {
            return false;
        }
        return true;
    }
    
}
