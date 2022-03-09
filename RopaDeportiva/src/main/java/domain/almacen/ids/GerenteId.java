package domain.almacen.ids;

import co.com.sofka.domain.generic.Identity;

public class GerenteId extends Identity {

    // constructores
    private GerenteId(String value) {
        super(value);
    }

    public GerenteId(){}

    public static GerenteId of(String value){
        return new GerenteId(value);
    }
}
