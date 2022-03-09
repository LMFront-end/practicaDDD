package domain.distribucion.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.AlmacenId;
import domain.distribucion.Distribucion;
import domain.distribucion.ids.DistribucionId;

public class DistribucionCreada  extends DomainEvent
{
    private final DistribucionId distribucionId;
    private final AlmacenId almacenId;


    // se implementa el constructor
    public DistribucionCreada(DistribucionId distribucionId,AlmacenId almacenId){
        super("RopaDeportiva.almacenCreado");
        this.distribucionId = distribucionId;
        this.almacenId=almacenId;
    }

    // getters de los datos
    public DistribucionId getDistribucionId()
    {
        return distribucionId;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }
}
