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
public class PAS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Usuario CodPAS;

    public Usuario getCodPAS() {
        return CodPAS;
    }

    public void setCodPAS(Usuario CodPAS) {
        this.CodPAS = CodPAS;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.CodPAS);
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
        final PAS other = (PAS) obj;
        if (!Objects.equals(this.CodPAS, other.CodPAS)) {
            return false;
        }
        return true;
    }
    
}
