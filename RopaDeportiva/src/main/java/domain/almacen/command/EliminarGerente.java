package domain.almacen.command;

import co.com.sofka.domain.generic.Command;
import domain.almacen.ids.GerenteId;

public class EliminarGerente extends Command {

    private final GerenteId gerenteId;

    public EliminarGerente(GerenteId gerenteId){
        this.gerenteId = gerenteId;

    }

    // se genera el getter
    public GerenteId getGerenteId() {
        return gerenteId;
    }
}
