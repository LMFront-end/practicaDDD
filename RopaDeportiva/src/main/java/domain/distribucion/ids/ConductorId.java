package domain.distribucion.ids;

import co.com.sofka.domain.generic.Identity;

public class ConductorId extends Identity
{
    // constructores
    private ConductorId(String value) {
        super(value);
    }

    public ConductorId(){}

    public static ConductorId of(String value){
        return new ConductorId(value);
    }
}
