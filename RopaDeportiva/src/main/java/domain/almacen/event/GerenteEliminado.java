package domain.almacen.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.GerenteId;
import generics.Identificacion;
import generics.Nombre;

public class GerenteEliminado extends DomainEvent {

    private final GerenteId gerenteId;

    public GerenteEliminado(GerenteId gerenteId){
        super("RopaDeportiva.GerenteEliminado");
        this.gerenteId = gerenteId;

    }

    // se genera el getter

    public GerenteId getGerenteId() {
        return gerenteId;
    }
}
