package domain.almacen;

import co.com.sofka.domain.generic.EventChange;
import domain.almacen.event.AlmacenCreado;


public class AlmacenChange extends EventChange {

    public AlmacenChange(Almacen almacen){

        apply((AlmacenCreado event) -> {
            almacen.almacenId = event.getAlmacenId();
        });
    }
}
