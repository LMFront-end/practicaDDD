package domain.distribucion.command;

import co.com.sofka.domain.generic.Command;
import domain.distribucion.ids.RutaId;

public class EliminarRuta extends Command
{
    private final RutaId rutaId;

    public EliminarRuta( RutaId rutaId) {

        this.rutaId = rutaId;
    }

    public RutaId getRutaId() {
        return rutaId;
    }
}
