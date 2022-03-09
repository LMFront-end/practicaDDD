package domain.factura;

import co.com.sofka.domain.generic.EventChange;
import domain.almacen.event.*;
import domain.factura.entity.Cliente;
import domain.factura.entity.Estado;
import domain.factura.entity.Transaccion;
import domain.factura.event.ClienteCambiado;
import domain.factura.event.EstadoCambiado;
import domain.factura.event.FacturaCreada;
import domain.factura.event.TransaccionCambiada;

public class FacturaChange extends EventChange {

    public FacturaChange(Factura factura){

        apply((FacturaCreada event) -> {
            factura.facturaId = event.getFacturaId();
        });

        // metodos

        // cambiarCliente()
        apply((ClienteCambiado event) -> {
            Cliente nuevoCliente = new Cliente(event.getClienteId(),
                    event.getNombre(),
                    event.getTelefono(),
                    event.getEmail(),
                    event.getDireccion(),
                    event.getIdentificacion());
            });

        // cambiarTransaccion()

        apply((TransaccionCambiada event) -> {
            Transaccion nuevaTransaccion = new Transaccion(event.getTransaccionId(),
                    event.getFecha(),
                    event.getPrecio());
            });


        // cambiarEstado()
        apply((EstadoCambiado event) -> {
            Estado estado = new Estado(
                    event.getEstadoId(),
                    event.getEstadoActual(),
                    event.getFecha()
            );
        });

    }
}
