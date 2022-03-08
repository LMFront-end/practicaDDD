package domain.almacen.ids;

import co.com.sofka.domain.generic.Identity;


public class AsesorId extends Identity {

    // constructores
    private AsesorId(String value) {
        super(value);
    }

    public AsesorId(){}

    public static AsesorId of(String value){
        return new AsesorId(value);
    }
}
