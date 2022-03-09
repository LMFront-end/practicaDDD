package domain.distribucion;

import co.com.sofka.domain.generic.EventChange;

import domain.distribucion.entity.Conductor;
import domain.distribucion.entity.Ruta;
import domain.distribucion.entity.Vehiculo;
import domain.distribucion.event.*;

public class DistribucionChange  extends EventChange
{
    public DistribucionChange(Distribucion distribucion ){

        apply((DistribucionCreada event) -> {
            distribucion.distribucionId = event.getDistribucionId();
            distribucion.almacenId=event.getAlmacenId();
        });

        // metodos
        // añadirConductor()
        apply((ConductorAniadido event) -> {
            distribucion.conductor(new Conductor(
                    event.getConductorId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getHorasDeTrabajo()
            ));
        });


        // cambiarConductor()
        apply((ConductorCambiado event) -> {
            distribucion.conductor(new Conductor(
                    event.getConductorId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getHorasDeTrabajo()
            ));
        });

        // eliminarProducto()

        apply((ConductorEliminado event) -> {
            distribucion.conductor = null;
        });


        // añadirRuta()
        apply((RutaAniadida event) -> {
            distribucion.ruta(new Ruta(
                    event.getRutaId(),
                    event.getOrigen(),
                    event.getDestino()
            ));
        });


        // cambiarRuta()
        apply((RutaCambiada event) -> {
            distribucion.ruta(new Ruta(
                    event.getRutaId(),
                    event.getOrigen(),
                    event.getDestino()
            ));
        });

        // eliminarProducto()

        apply((RutaEliminada event) -> {
            distribucion.ruta = null;
        });


        // añadirRuta()
        apply((RutaAniadida event) -> {
            distribucion.ruta(new Ruta(
                    event.getRutaId(),
                    event.getOrigen(),
                    event.getDestino()
            ));
        });


        // cambiarRuta()
        apply((RutaCambiada event) -> {
            distribucion.ruta(new Ruta(
                    event.getRutaId(),
                    event.getOrigen(),
                    event.getDestino()
            ));
        });

        // eliminarRuta()

        apply((RutaEliminada event) -> {
            distribucion.ruta = null;
        });


        // añadirVehiculo()
        apply((VehiculoAniadido event) -> {
            distribucion.vehiculo(new Vehiculo(
                    event.getVehiculoId(),
                    event.getPlaca(),
                    event.getTipoVehiculo(),
                    event.getEstadoVehiculo()
            ));
        });


        // CambiarVehiculo()
        apply((VehiculoCambiado event) -> {
            distribucion.vehiculo(new Vehiculo(
                    event.getVehiculoId(),
                    event.getPlaca(),
                    event.getTipoVehiculo(),
                    event.getEstadoVehiculo()
            ));
        });

        // eliminarVehiculo()

        apply((VehiculoEliminado event) -> {
            distribucion.vehiculo = null;
        });













    }
}
