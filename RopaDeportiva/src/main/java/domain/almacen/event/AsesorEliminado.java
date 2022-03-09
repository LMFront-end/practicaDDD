package domain.almacen.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.AsesorId;


public class AsesorEliminado extends DomainEvent {

    private final AsesorId asesorId;

    public AsesorEliminado(AsesorId asesorId){
        super("RopaDeportiva.AsesorEliminado");
        this.asesorId = asesorId;
    }

    // se genera getter
    public AsesorId getAsesorId() {
        return asesorId;
    }
}
