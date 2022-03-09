package domain.distribucion.ids;

import co.com.sofka.domain.generic.Identity;

public class RutaId extends Identity
{

    // constructores
    private RutaId(String value) {
        super(value);
    }

    public RutaId(){}

    public static RutaId of(String value){
        return new RutaId(value);
    }
}
