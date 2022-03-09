package domain.distribucion.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.distribucion.ids.RutaId;
import domain.distribucion.ids.VehiculoId;

public class VehiculoEliminado  extends DomainEvent
{

    private final VehiculoId vehiculoId;
    public VehiculoEliminado(VehiculoId vehiculoId) {
        super("RopaDeportiva.VehiculoEliminada");
        this.vehiculoId = vehiculoId;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }
}
