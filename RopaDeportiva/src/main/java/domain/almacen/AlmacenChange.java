package domain.almacen;

import co.com.sofka.domain.generic.EventChange;
import domain.almacen.entity.Producto;
import domain.almacen.event.AlmacenCreado;


public class AlmacenChange extends EventChange {

    public AlmacenChange(Almacen almacen){

        apply((AlmacenCreado event) -> {
            almacen.almacenId = event.getAlmacenId();
        });

        // metodos

        // añadirProducto()

        apply((ProductoAniadido event) -> {
            almacen.producto = new Producto(event.)
        });

        // cambiarProducto()

        // eliminarProducto()

        // añadirAsesor()

        // cambiarAsesor()

        // eliminarAsesor()

        // cambiarGerente()

        // eliminarGerente()


    }
}
