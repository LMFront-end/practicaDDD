package domain.distribucion.event;

import co.com.sofka.domain.generic.DomainEvent;
import generics.HorasDeTrabajo;
import domain.distribucion.ids.ConductorId;
import generics.Identificacion;
import generics.Nombre;

public class ConductorAniadido extends DomainEvent
{
    private final ConductorId conductorId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final HorasDeTrabajo horasDeTrabajo;


    public ConductorAniadido(ConductorId conductorId, Nombre nombre, Identificacion identificacion,
                             HorasDeTrabajo horasDeTrabajo){
        super("RopaDeportiva.AsesorAniadido");
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
