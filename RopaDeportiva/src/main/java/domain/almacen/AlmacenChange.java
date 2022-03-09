package domain.almacen;

import co.com.sofka.domain.generic.EventChange;
import domain.almacen.entity.Asesor;
import domain.almacen.entity.Gerente;
import domain.almacen.entity.Producto;
import domain.almacen.event.*;


public class AlmacenChange extends EventChange {

    public AlmacenChange(Almacen almacen){

        apply((AlmacenCreado event) -> {
            almacen.almacenId = event.getAlmacenId();
        });

        // metodos
        // añadirProducto()
        apply((ProductoAniadido event) -> {
            almacen.productos.add(new Producto(
                    event.getProductoId(),
                    event.getTipo(),
                    event.getGenero(),
                    event.getMarca(),
                    event.getPrecio(),
                    event.getTalla()
            ));
        });

        // cambiarProducto()
        apply((ProductoCambiado event) -> {
            Producto nuevoProducto = new Producto(event.getProductoId(),
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

        // eliminarProducto()
        apply((ProductoEliminado event) -> {
            almacen.productos.forEach(producto -> {
                if (producto.identity().equals(event.getProductoId())) {
                    almacen.productos.remove(producto);
                }
            });
        });

        // añadirAsesor()

        apply((AsesorAniadido event) -> {
            almacen.asesores.add(new Asesor(
                    event.getAsesorId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getHorasDeTrabajo(),
                    event.getAreaDesignada()
            ));
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

        // eliminarAsesor()

        apply((AsesorEliminado event) -> {
            almacen.asesores.forEach(asesor -> {
                if (asesor.identity().equals(event.getAsesorId())) {
                    almacen.asesores.remove(asesor);
                }
            });
        });

        // añadirGerente()

        apply((GerenteAniadido event) -> {
            almacen.gerente = new Gerente(
                    event.getGerenteId(),
                    event.getNombre(),
                    event.getIdentificacion()
            );
        });

        // cambiarGerente()
        apply((GerenteCambiado event) -> {
            almacen.gerente = new Gerente(
                    event.getGerenteId(),
                    event.getNombre(),
                    event.getIdentificacion()
            );
        });

        // eliminarGerente()
        apply((GerenteEliminado event) -> {
            almacen.gerente = null;
        });


    }
}
