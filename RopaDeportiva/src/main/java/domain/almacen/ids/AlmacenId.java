package domain.almacen.ids;

import co.com.sofka.domain.generic.Identity;

public class AlmacenId extends Identity {

    // constructores
    private AlmacenId(String value) {
        super(value);
    }

    public AlmacenId(){}

    public static AlmacenId of(String value){
        return new AlmacenId(value);
    }
}
