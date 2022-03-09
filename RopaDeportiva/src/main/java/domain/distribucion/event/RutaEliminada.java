package domain.distribucion.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.distribucion.ids.RutaId;

public class RutaEliminada extends DomainEvent
{

    private final RutaId rutaId;

    public RutaEliminada( RutaId rutaId) {
        super("RopaDeportiva.RutaEliminada");
        this.rutaId = rutaId;
    }

    public RutaId getRutaId() {
        return rutaId;
    }
}
