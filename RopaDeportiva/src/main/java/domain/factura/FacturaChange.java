package domain.factura;

import co.com.sofka.domain.generic.EventChange;
import domain.almacen.entity.Asesor;
import domain.almacen.entity.Gerente;
import domain.almacen.entity.Producto;
import domain.almacen.event.*;
import domain.factura.entity.Cliente;

public class FacturaChange extends EventChange {

    public FacturaChange(Factura factura){

        apply((FacturaCreada event) -> {
            factura.facturaId = event.getFacturaId();
        });

        // metodos

        // cambiarCliente()
        apply((ClienteCambiado event) -> {
            Cliente nuevoCliente = new Cliente(event.getClienteId(),
                    event.getTipo(),
                    event.getGenero(),
                    event.getMarca(),
                    event.getPrecio(),
                    event.getTalla());
            almacen.productos.forEach((producto) -> {
                if(producto.equals(nuevoProducto)){
                    almacen.productos.remove(producto);
                    almacen.productos.add(nuevoProducto);
                }
            });
        });

        // cambiarAsesor()

        apply((AsesorCambiado event) -> {
            Asesor nuevoAsesor = new Asesor(event.getAsesorId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getHorasDeTrabajo(),
                    event.getAreaDesignada());

            almacen.asesores.forEach((asesor) -> {
                if(asesor.equals(nuevoAsesor)){
                    almacen.asesores.remove(asesor);
                    almacen.asesores.add(nuevoAsesor);
                }
            });
        });

        // cambiarGerente()
        apply((GerenteCambiado event) -> {
            almacen.gerente = new Gerente(
                    event.getGerenteId(),
                    event.getNombre(),
                    event.getIdentificacion()
            );
        });

    }
}
