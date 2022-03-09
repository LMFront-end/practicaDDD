package domain.almacen.ids;

import co.com.sofka.domain.generic.Identity;

public class ProductoId extends Identity {

    // constructores
    private ProductoId(String value) {
        super(value);
    }

    public ProductoId(){}

    public static ProductoId of(String value){
        return new ProductoId(value);
    }
}
