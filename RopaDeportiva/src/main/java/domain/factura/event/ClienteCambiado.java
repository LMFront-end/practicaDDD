package domain.factura.event;


import co.com.sofka.domain.generic.DomainEvent;
import domain.factura.ids.ClienteId;
import domain.factura.valueobjects.cliente.Direccion;
import domain.factura.valueobjects.cliente.Email;
import domain.factura.valueobjects.cliente.Telefono;
import generics.Identificacion;
import generics.Nombre;

public class ClienteCambiado extends DomainEvent {

    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Telefono telefono;
    private final Email email;
    private final Direccion direccion;
    private final Identificacion identificacion;

    public ClienteCambiado(String type, ClienteId clienteId, Nombre nombre, Telefono telefono, Email email, Direccion direccion, Identificacion identificacion) {
        super("RopaDeportiva.ClienteCambiado");
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Email getEmail() {
        return email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
