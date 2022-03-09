package domain.distribucion.entity;

import co.com.sofka.domain.generic.Entity;
import domain.distribucion.ids.VehiculoId;
import domain.distribucion.valueobjects.vehiculo.EstadoVehiculo;
import domain.distribucion.valueobjects.vehiculo.Placa;
import domain.distribucion.valueobjects.vehiculo.TipoVehiculo;

import java.util.Objects;

public class Vehiculo extends Entity<VehiculoId>
{
    private Placa placa;
    private TipoVehiculo tipoVehiculo;
    private EstadoVehiculo estadoVehiculo;

    public Vehiculo(VehiculoId entityId, Placa placa, TipoVehiculo tipoVehiculo, EstadoVehiculo estadoVehiculo) {
        super(entityId);
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.estadoVehiculo = estadoVehiculo;
    }

    //cambiarEstadoVehiculo, cambiarPlaca, cambiarTipoVehiculo



    public void cambiarEstadoVehiculo(EstadoVehiculo estadoVehiculo)
    {
        this.estadoVehiculo = Objects.requireNonNull(estadoVehiculo);
    }

    public void cambiarPlaca(Placa placa)
    {
        this.placa = Objects.requireNonNull(placa);
    }
    public void cambiarTipoVehiculo(TipoVehiculo tipoVehiculo)
    {
        this.tipoVehiculo = Objects.requireNonNull(tipoVehiculo);
    }


}
