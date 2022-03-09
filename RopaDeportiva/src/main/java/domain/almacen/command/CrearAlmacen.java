package domain.almacen.command;

import co.com.sofka.domain.generic.Command;
import domain.almacen.ids.AlmacenId;

public class CrearAlmacen extends Command {

    private final AlmacenId almacenId;

    public CrearAlmacen(AlmacenId almacenId){
        this.almacenId = almacenId;
    }

    public AlmacenId getAlmacenId(){
        return almacenId;
    }
}
