package domain.almacen.command;

import co.com.sofka.domain.generic.Command;
import domain.almacen.ids.AsesorId;

public class EliminarAsesor extends Command {

    private final AsesorId asesorId;

    public EliminarAsesor(AsesorId asesorId){
        this.asesorId = asesorId;
    }

    // se genera getter
    public AsesorId getAsesorId() {
        return asesorId;
    }
}

