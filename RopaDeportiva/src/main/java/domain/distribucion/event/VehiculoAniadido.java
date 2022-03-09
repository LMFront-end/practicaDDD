package domain.distribucion.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.distribucion.ids.VehiculoId;
import domain.distribucion.valueobjects.vehiculo.EstadoVehiculo;
import domain.distribucion.valueobjects.vehiculo.Placa;
import domain.distribucion.valueobjects.vehiculo.TipoVehiculo;

public class VehiculoAniadido  extends DomainEvent
{
    private final VehiculoId vehiculoId;
    private final EstadoVehiculo estadoVehiculo;
    private final Placa placa;
    private final TipoVehiculo tipoVehiculo;

    public VehiculoAniadido(VehiculoId vehiculoId, EstadoVehiculo estadoVehiculo, Placa placa, TipoVehiculo tipoVehiculo) {
        super("RopaDeportiva.VehiculoAniadido");
        this.vehiculoId = vehiculoId;
        this.estadoVehiculo = estadoVehiculo;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public Placa getPlaca() {
        return placa;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
}
