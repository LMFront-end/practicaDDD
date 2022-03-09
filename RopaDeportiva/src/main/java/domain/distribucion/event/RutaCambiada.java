package domain.distribucion.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.distribucion.ids.RutaId;
import domain.distribucion.valueobjects.ruta.Destino;
import domain.distribucion.valueobjects.ruta.Origen;

public class RutaCambiada  extends DomainEvent
{
    private final RutaId rutaId;
    private final Origen origen;
    private final Destino destino;


    public RutaCambiada(String type, RutaId rutaId, Origen origen, Destino destino) {
        super("RopaDeportiva.RutaAniadida");
        this.rutaId = rutaId;
        this.origen = origen;
        this.destino = destino;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public Origen getOrigen() {
        return origen;
    }

    public Destino getDestino() {
        return destino;
    }
}
