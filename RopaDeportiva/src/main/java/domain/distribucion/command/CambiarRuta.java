package domain.distribucion.command;

import co.com.sofka.domain.generic.Command;
import domain.distribucion.ids.RutaId;
import domain.distribucion.valueobjects.ruta.Destino;
import domain.distribucion.valueobjects.ruta.Origen;

public class CambiarRuta extends Command
{

    private final RutaId rutaId;
    private final Origen origen;
    private final Destino destino;


    public CambiarRuta(String type, RutaId rutaId, Origen origen, Destino destino) {

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
