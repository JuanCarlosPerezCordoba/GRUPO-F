/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grupof.tarea1;

import java.io.Serializable;
import java.util.Date;
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
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodActividad;
    private Integer Duracion;
    private Date FechaInicio;
    private Date FechaFin;
    private String Localizacion;
    private String Descripcion;
    private String CapacidadesNecesarias;
    private String EstadoActividad;
    private String TipoActividad;
    private String NombreActividad;
    private String EstadoSolicitud;
    private List<ParticipacionEnActividad> participantes;
    private Valoracion Valoracion;

    public Long getCodActividad() {
        return CodActividad;
    }

    public void setCodActividad(Long CodActividad) {
        this.CodActividad = CodActividad;
    }

    public Integer getDuracion() {
        return Duracion;
    }

    public void setDuracion(Integer Duracion) {
        this.Duracion = Duracion;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCapacidadesNecesarias() {
        return CapacidadesNecesarias;
    }

    public void setCapacidadesNecesarias(String CapacidadesNecesarias) {
        this.CapacidadesNecesarias = CapacidadesNecesarias;
    }

    public String getEstadoActividad() {
        return EstadoActividad;
    }

    public void setEstadoActividad(String EstadoActividad) {
        this.EstadoActividad = EstadoActividad;
    }

    public String getTipoActividad() {
        return TipoActividad;
    }

    public void setTipoActividad(String TipoActividad) {
        this.TipoActividad = TipoActividad;
    }

    public String getNombreActividad() {
        return NombreActividad;
    }

    public void setNombreActividad(String NombreActividad) {
        this.NombreActividad = NombreActividad;
    }

    public String getEstadoSolicitud() {
        return EstadoSolicitud;
    }

    public void setEstadoSolicitud(String EstadoSolicitud) {
        this.EstadoSolicitud = EstadoSolicitud;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.CodActividad);
        hash = 43 * hash + Objects.hashCode(this.Duracion);
        hash = 43 * hash + Objects.hashCode(this.FechaInicio);
        hash = 43 * hash + Objects.hashCode(this.FechaFin);
        hash = 43 * hash + Objects.hashCode(this.Localizacion);
        hash = 43 * hash + Objects.hashCode(this.Descripcion);
        hash = 43 * hash + Objects.hashCode(this.CapacidadesNecesarias);
        hash = 43 * hash + Objects.hashCode(this.EstadoActividad);
        hash = 43 * hash + Objects.hashCode(this.TipoActividad);
        hash = 43 * hash + Objects.hashCode(this.NombreActividad);
        hash = 43 * hash + Objects.hashCode(this.EstadoSolicitud);
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
        final Actividad other = (Actividad) obj;
        if (!Objects.equals(this.Localizacion, other.Localizacion)) {
            return false;
        }
        if (!Objects.equals(this.Descripcion, other.Descripcion)) {
            return false;
        }
        if (!Objects.equals(this.CapacidadesNecesarias, other.CapacidadesNecesarias)) {
            return false;
        }
        if (!Objects.equals(this.EstadoActividad, other.EstadoActividad)) {
            return false;
        }
        if (!Objects.equals(this.TipoActividad, other.TipoActividad)) {
            return false;
        }
        if (!Objects.equals(this.NombreActividad, other.NombreActividad)) {
            return false;
        }
        if (!Objects.equals(this.EstadoSolicitud, other.EstadoSolicitud)) {
            return false;
        }
        if (!Objects.equals(this.CodActividad, other.CodActividad)) {
            return false;
        }
        if (!Objects.equals(this.Duracion, other.Duracion)) {
            return false;
        }
        if (!Objects.equals(this.FechaInicio, other.FechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.FechaFin, other.FechaFin)) {
            return false;
        }
        return true;
    }
    
}
