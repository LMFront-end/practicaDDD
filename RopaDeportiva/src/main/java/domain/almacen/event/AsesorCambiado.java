package domain.almacen.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.AsesorId;
import domain.almacen.valueobjects.asesor.AreaDesignada;
import domain.almacen.valueobjects.asesor.HorasDeTrabajo;
import generics.Identificacion;
import generics.Nombre;

public class AsesorCambiado extends DomainEvent {

    private final AsesorId asesorId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final HorasDeTrabajo horasDeTrabajo;
    private final AreaDesignada areaDesignada;

    public AsesorCambiado(AsesorId asesorId, Nombre nombre, Identificacion identificacion, HorasDeTrabajo horasDeTrabajo, AreaDesignada areaDesignada){
        super("RopaDeportiva.AsesorCambiado");
        this.asesorId = asesorId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.horasDeTrabajo = horasDeTrabajo;
        this.areaDesignada = areaDesignada;
    }

    // se generan los getters

    public AsesorId getAsesorId() {
        return asesorId;
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

    public AreaDesignada getAreaDesignada() {
        return areaDesignada;
    }
}
