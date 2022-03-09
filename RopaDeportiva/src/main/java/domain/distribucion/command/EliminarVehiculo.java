package domain.distribucion.command;

import co.com.sofka.domain.generic.Command;
import domain.distribucion.ids.VehiculoId;

public class EliminarVehiculo  extends Command
{
    private final VehiculoId vehiculoId;
    public EliminarVehiculo(VehiculoId vehiculoId) {

        this.vehiculoId = vehiculoId;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }
}
