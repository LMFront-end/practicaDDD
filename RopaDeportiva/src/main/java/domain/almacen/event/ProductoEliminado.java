package domain.almacen.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.ProductoId;
import domain.almacen.valueobjects.producto.*;

public class ProductoEliminado extends DomainEvent {

    private final ProductoId productoId;


    public ProductoEliminado(ProductoId productoId){
        super("RopaDeportiva.ProductoEliminado");
        this.productoId = productoId;
    }

    // se genera el getter

    public ProductoId getProductoId() {
        return productoId;
    }

}
