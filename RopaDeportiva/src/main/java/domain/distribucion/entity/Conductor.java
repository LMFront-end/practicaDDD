package domain.distribucion.entity;

import co.com.sofka.domain.generic.Entity;
import domain.distribucion.valueobjects.conductor.HorasDeTrabajo;
import domain.distribucion.ids.ConductorId;
import generics.IdentificacionConductor;
import generics.NombreConductor;

import java.util.Objects;

public class Conductor extends Entity<ConductorId>
{
    private NombreConductor nombre;
    private IdentificacionConductor identificacion;
    private HorasDeTrabajo horasDeTrabajo;

    public Conductor(ConductorId entityId, NombreConductor nombre, IdentificacionConductor identificacion, HorasDeTrabajo horasDeTrabajo) {
        super(entityId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.horasDeTrabajo = horasDeTrabajo;
    }


    // métodos de la entidad Conductor

    // cambiarNombre()
    public void cambiarNombre(NombreConductor nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    // cambiarIdentificacion()
    public void cambiarIdentificacion(IdentificacionConductor identificacion){
        this.identificacion = Objects.requireNonNull(identificacion);
    }

    // cambbiarHorasDeTrabajo()
    public void cambiarHorasDeTrabajo(HorasDeTrabajo horasDeTrabajo){
        this.horasDeTrabajo = Objects.requireNonNull(horasDeTrabajo);
    }


}
