package domain.distribucion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.Almacen;
import domain.almacen.event.*;
import domain.almacen.ids.AlmacenId;
import domain.almacen.ids.AsesorId;
import domain.almacen.ids.GerenteId;
import domain.almacen.ids.ProductoId;
import domain.almacen.valueobjects.asesor.AreaDesignada;
import domain.almacen.valueobjects.producto.*;
import domain.distribucion.entity.Conductor;
import domain.distribucion.entity.Ruta;
import domain.distribucion.entity.Vehiculo;
import domain.distribucion.event.*;
import domain.distribucion.ids.ConductorId;
import domain.distribucion.ids.DistribucionId;
import domain.distribucion.ids.RutaId;
import domain.distribucion.ids.VehiculoId;
import domain.distribucion.valueobjects.ruta.Destino;
import domain.distribucion.valueobjects.ruta.Origen;
import domain.distribucion.valueobjects.vehiculo.EstadoVehiculo;
import domain.distribucion.valueobjects.vehiculo.Placa;
import domain.distribucion.valueobjects.vehiculo.TipoVehiculo;
import generics.HorasDeTrabajo;
import generics.Identificacion;
import generics.Nombre;

import java.util.List;
import java.util.Objects;

public class Distribucion extends AggregateEvent<DistribucionId>
{
    protected DistribucionId distribucionId;
    protected Conductor conductor;
    protected Ruta ruta;
    protected Vehiculo vehiculo;
    protected AlmacenId almacenId;

    // se crea el constructor
    public Distribucion(DistribucionId distribucionId, AlmacenId almacenId){
        super(distribucionId);
        appendChange(new DistribucionCreada(distribucionId,almacenId)).apply();

        subscribe(new DistribucionChange(this));
    }



    // Metodo que permite reconstruir el estado del agregado a partir de una lista de eventos de dominios
    public static Distribucion from(DistribucionId distribucionId, AlmacenId almacenId,List<DomainEvent> events){

        var distribucion = new Distribucion(distribucionId,almacenId);
        // Evento de dominio, aplica el evento de dominio sobre el almacen
        //events.forEach(event -> almacen.applyEvent(event))
        events.forEach(distribucion::applyEvent);
        return distribucion;
    }

    // métodos del agregado

    // añadirConductor()
    public void aniadirConductor(ConductorId conductorId, Nombre nombre, Identificacion identificacion, HorasDeTrabajo horasDeTrabajo ){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(horasDeTrabajo);
        appendChange(new ConductorAniadido(conductorId, nombre, identificacion,  horasDeTrabajo));
    }

    // cambiarConductor()
    public void  cambiarCondcutor(ConductorId conductorId, Nombre nombre, Identificacion identificacion, HorasDeTrabajo horasDeTrabajo){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(horasDeTrabajo);
        appendChange(new ConductorAniadido(conductorId, nombre, identificacion,  horasDeTrabajo));
    }

    // eliminarConductor()
    public void eliminarConductor(ConductorId conductorId){
        Objects.requireNonNull(conductorId);
        appendChange(new ConductorEliminado(conductorId));
    }

    // añadirRuta()
    public void aniadirRuta(RutaId rutaId, Origen origen, Destino destino){
        Objects.requireNonNull(rutaId);
        Objects.requireNonNull(origen);
        Objects.requireNonNull(destino);
        appendChange(new RutaAniadida(rutaId, origen, destino));

    }

    // cambiarRuta()
    public void cambiarRuta(RutaId rutaId, Origen origen, Destino destino){
        Objects.requireNonNull(rutaId);
        Objects.requireNonNull(origen);
        Objects.requireNonNull(destino);
        appendChange(new RutaAniadida(rutaId, origen, destino));
    }

    // eliminarRuta()
    public void eliminarRuta(RutaId rutaId){
        Objects.requireNonNull(rutaId);
        appendChange(new RutaEliminada(rutaId));

    }


    // añadirVehiculo()
    public void añadirVehiculo(VehiculoId vehiculoId, EstadoVehiculo estadoVehiculo, Placa placa, TipoVehiculo tipoVehiculo ){
        Objects.requireNonNull(vehiculoId);
        Objects.requireNonNull(estadoVehiculo);
        Objects.requireNonNull(placa);
        Objects.requireNonNull(tipoVehiculo);
        appendChange(new VehiculoAniadido(vehiculoId, estadoVehiculo,placa,  tipoVehiculo));
    }

    // cambiarVehiculo()
    public void  cambiarVehiculo(VehiculoId vehiculoId, EstadoVehiculo estadoVehiculo, Placa placa, TipoVehiculo tipoVehiculo ){
        Objects.requireNonNull(vehiculoId);
        Objects.requireNonNull(estadoVehiculo);
        Objects.requireNonNull(placa);
        Objects.requireNonNull(tipoVehiculo);
        appendChange(new VehiculoCambiado(vehiculoId, estadoVehiculo,placa,  tipoVehiculo));
    }

    // eliminarVehiculo()
    public void eliminarVehiculo(VehiculoId vehiculoId){
        Objects.requireNonNull(vehiculoId);
        appendChange(new VehiculoEliminado(vehiculoId));
    }






    public Conductor conductor(Conductor conductor){
        return this.conductor;
    }
    public Ruta ruta(Ruta ruta){
        return this.ruta;
    }
    public Vehiculo vehiculo(Vehiculo vehiculo){
        return this.vehiculo;
    }

}
