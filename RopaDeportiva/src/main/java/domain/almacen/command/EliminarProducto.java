package domain.almacen.command;

import co.com.sofka.domain.generic.Command;
import domain.almacen.ids.ProductoId;

public class EliminarProducto extends Command {

    private final ProductoId productoId;


    public EliminarProducto(ProductoId productoId){
        this.productoId = productoId;
    }

    // se genera el getter

    public ProductoId getProductoId() {
        return productoId;
    }
}
