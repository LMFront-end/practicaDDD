package domain.distribucion.command;

import co.com.sofka.domain.generic.Command;
import domain.distribucion.ids.ConductorId;

public class EliminarConductor extends Command
{
    private final ConductorId conductorId;

    public EliminarConductor(ConductorId conductorId){

        this.conductorId = conductorId;
    }

    // se genera getter
    public ConductorId getConductorId() {
        return conductorId;
    }
}
