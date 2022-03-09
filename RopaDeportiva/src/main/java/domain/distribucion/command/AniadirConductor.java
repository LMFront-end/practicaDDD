package domain.distribucion.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import domain.distribucion.ids.ConductorId;
import generics.HorasDeTrabajo;
import generics.Identificacion;
import generics.Nombre;

public class AniadirConductor extends Command
{

    private final ConductorId conductorId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final HorasDeTrabajo horasDeTrabajo;


    public AniadirConductor(ConductorId conductorId, Nombre nombre, Identificacion identificacion,
                             HorasDeTrabajo horasDeTrabajo){
        this.conductorId = conductorId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.horasDeTrabajo = horasDeTrabajo;

    }

    // se generan los getters

    public ConductorId getConductorId() {
        return conductorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public HorasDeTrabajo getHorasDeTrabajo() {
        return horasDeTrabajo;
    }
}
