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
public class Alumno implements Serializable {

   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Usuario CodUMA;
   private Integer Curso;

    public Usuario getCodUMA() {
        return CodUMA;
    }

    public void setCodUMA(Usuario CodUMA) {
        this.CodUMA = CodUMA;
    }

    public Integer getCurso() {
        return Curso;
    }

    public void setCurso(Integer Curso) {
        this.Curso = Curso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.CodUMA);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.CodUMA, other.CodUMA)) {
            return false;
        }
        return true;
    }
      
    
}
