package domain.almacen;

import co.com.sofka.domain.generic.EventChange;
import domain.almacen.entity.Producto;
import domain.almacen.event.AlmacenCreado;
import domain.almacen.event.ProductoAniadido;
import domain.almacen.event.ProductoCambiado;
import domain.almacen.event.ProductoEliminado;


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

        

        // cambiarAsesor()

        // eliminarAsesor()

        // añadirGerente()

        // cambiarGerente()

        // eliminarGerente()


    }
}
