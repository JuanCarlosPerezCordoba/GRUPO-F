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
public class Asignatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodAsignatura;
    private String NombreAsignatura;
    private Integer CursoImpartida;

    public Long getCodAsignatura() {
        return CodAsignatura;
    }

    public void setCodAsignatura(Long CodAsignatura) {
        this.CodAsignatura = CodAsignatura;
    }

    public String getNombreAsignatura() {
        return NombreAsignatura;
    }

    public void setNombreAsignatura(String NombreAsignatura) {
        this.NombreAsignatura = NombreAsignatura;
    }

    public Integer getCursoImpartida() {
        return CursoImpartida;
    }

    public void setCursoImpartida(Integer CursoImpartida) {
        this.CursoImpartida = CursoImpartida;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.CodAsignatura);
        hash = 13 * hash + Objects.hashCode(this.NombreAsignatura);
        hash = 13 * hash + Objects.hashCode(this.CursoImpartida);
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
        final Asignatura other = (Asignatura) obj;
        if (!Objects.equals(this.NombreAsignatura, other.NombreAsignatura)) {
            return false;
        }
        if (!Objects.equals(this.CodAsignatura, other.CodAsignatura)) {
            return false;
        }
        if (!Objects.equals(this.CursoImpartida, other.CursoImpartida)) {
            return false;
        }
        return true;
    }
}
