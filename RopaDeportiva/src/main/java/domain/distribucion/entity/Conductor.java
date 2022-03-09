package domain.distribucion.entity;

import co.com.sofka.domain.generic.Entity;
import domain.distribucion.ids.ConductorId;
import generics.HorasDeTrabajo;
import generics.Identificacion;
import generics.Nombre;

import java.util.Objects;

public class Conductor extends Entity<ConductorId>
{
    private Nombre nombre;
    private Identificacion identificacion;
    private HorasDeTrabajo horasDeTrabajo;

    public Conductor(ConductorId conductorId, Nombre nombre, Identificacion identificacion, HorasDeTrabajo horasDeTrabajo) {
        super(conductorId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.horasDeTrabajo = horasDeTrabajo;
    }




    // métodos de la entidad Conductor

    // cambiarNombre()
    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    // cambiarIdentificacion()
    public void cambiarIdentificacion(Identificacion identificacion){
        this.identificacion = Objects.requireNonNull(identificacion);
    }

    // cambbiarHorasDeTrabajo()
    public void cambiarHorasDeTrabajo(HorasDeTrabajo horasDeTrabajo){
        this.horasDeTrabajo = Objects.requireNonNull(horasDeTrabajo);
    }


}
