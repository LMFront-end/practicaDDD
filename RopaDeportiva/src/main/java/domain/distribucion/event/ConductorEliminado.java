package domain.distribucion.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.distribucion.ids.ConductorId;

public class ConductorEliminado extends DomainEvent
{
    private final ConductorId conductorId;

    public ConductorEliminado(ConductorId conductorId){
        super("RopaDeportiva.ConductorEliminado");
        this.conductorId = conductorId;
    }

    // se genera getter
    public ConductorId getConductorId() {
        return conductorId;
    }
}
