package domain.almacen.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.AlmacenId;

public class AlmacenCreado extends DomainEvent {

    private final AlmacenId almacenId;


    // se implementa el constructor
    public AlmacenCreado(AlmacenId almacenId){
        super("RopaDeportiva.almacenCreado");
        this.almacenId = almacenId;
    }

    // getters de los datos
    public AlmacenId getAlmacenId(){
        return almacenId;
    }
}
