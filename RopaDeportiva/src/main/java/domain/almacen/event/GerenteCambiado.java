package domain.almacen.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.GerenteId;
import generics.Identificacion;
import generics.Nombre;

public class GerenteCambiado extends DomainEvent {

    private final GerenteId gerenteId;
    private final Nombre nombre;
    private final Identificacion identificacion;

    public GerenteCambiado(GerenteId gerenteId, Nombre nombre, Identificacion identificacion){
        super("RopaDeportiva.GerenteAniadido");
        this.gerenteId = gerenteId;
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // se generan los getters

    public GerenteId getGerenteId() {
        return gerenteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
