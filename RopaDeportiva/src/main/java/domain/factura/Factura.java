package domain.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.AlmacenId;
import domain.factura.entity.Cliente;
import domain.factura.entity.Estado;
import domain.factura.entity.Transaccion;
import domain.factura.event.ClienteCambiado;
import domain.factura.event.EstadoCambiado;
import domain.factura.event.FacturaCreada;
import domain.factura.event.TransaccionCambiada;
import domain.factura.ids.ClienteId;
import domain.factura.ids.EstadoId;
import domain.factura.ids.FacturaId;
import domain.factura.ids.TransaccionId;
import domain.factura.valueobjects.Fecha;
import domain.factura.valueobjects.cliente.Direccion;
import domain.factura.valueobjects.cliente.Email;
import domain.factura.valueobjects.cliente.Telefono;
import domain.factura.valueobjects.estado.EstadoActual;
import generics.Identificacion;
import generics.Nombre;
import generics.Precio;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Factura extends AggregateEvent<FacturaId> {

    // se llaman las entidades de factura
    // modificador de acceso
    protected FacturaId facturaId;
    protected Cliente cliente;
    protected Transaccion transaccion;
    protected Estado estado;
    protected AlmacenId almacenId;

    // se crea el constructor

    public Factura(FacturaId facturaId, AlmacenId almacenId) {
        super(facturaId);

        appendChange(new FacturaCreada(facturaId, almacenId)).apply();

        subscribe(new FacturaChange(this));

    }

    // se crea la funcion from para la factura
    // Metodo que permite reconstruir el estado del agregado a partir de una lista de eventos de dominios
    public static Factura from(FacturaId facturaId, AlmacenId almacenId, List<DomainEvent> events){

        var factura = new Factura(facturaId, almacenId);
        // Evento de dominio, aplica el evento de dominio sobre la factura
        //events.forEach(event -> factura.applyEvent(event))
        events.forEach(factura::applyEvent);
        return factura;
    }

    //Cambiar Cliente
    public void cambiarCliente(ClienteId clienteId, Nombre nombre, Set<Telefono>telefono, Set<Email> email, Set<Direccion> direccion, Identificacion identificacion) {

        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(email);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(identificacion);
        appendChange(new ClienteCambiado(clienteId, nombre, telefono, email, direccion, identificacion)).apply();
    }

    //cambiar transaccion
    public void cambiarTransaccion(TransaccionId transaccionId, Fecha fecha, Precio precio) {

        Objects.requireNonNull(transaccionId);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(precio);
        appendChange(new TransaccionCambiada(transaccionId, fecha, precio)).apply();
    }

    //cambiar estado
    public void cambiarEstado(EstadoId estadoId, EstadoActual estadoActual, Fecha fecha) {

        Objects.requireNonNull(estadoId);
        Objects.requireNonNull(estadoActual);
        Objects.requireNonNull(fecha);
        appendChange(new EstadoCambiado(estadoId, estadoActual, fecha)).apply();
    }

    // se crean los constructores

    public Cliente cliente() {
        return cliente;
    }

    public Transaccion transaccion() {
        return transaccion;
    }

    public Estado estado() {
        return estado;
    }

}
