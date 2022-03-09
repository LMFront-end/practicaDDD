package domain.distribucion.ids;

import co.com.sofka.domain.generic.Identity;
import domain.almacen.ids.AlmacenId;

public class DistribucionId  extends Identity
{
    // constructores
    private DistribucionId(String value) {
        super(value);
    }

    public DistribucionId(){}

    public static DistribucionId of(String value){
        return new DistribucionId(value);
    }
}
