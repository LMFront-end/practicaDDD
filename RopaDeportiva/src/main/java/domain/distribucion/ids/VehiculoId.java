package domain.distribucion.ids;

import co.com.sofka.domain.generic.Identity;

public class VehiculoId extends Identity
{
    // constructores
    private VehiculoId(String value) {
        super(value);
    }

    public VehiculoId(){}

    public static VehiculoId of(String value){
        return new VehiculoId(value);
    }
}
