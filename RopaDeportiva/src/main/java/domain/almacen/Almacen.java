package domain.almacen;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;
import domain.almacen.entity.Asesor;
import domain.almacen.entity.Gerente;
import domain.almacen.entity.Producto;
import domain.almacen.event.AlmacenCreado;
import domain.almacen.ids.AlmacenId;

import java.util.Set;


public class Almacen extends AggregateEvent<AlmacenId> {

    // se llaman las entidades de almacen
    // modificador de acceso
    protected Set <Asesor> asesor;
    protected Set <Producto> producto;
    protected Gerente gerente;


    // se crea el constructor
    public Almacen(AlmacenId almacenId){
        super(almacenId);
        appendChange(new AlmacenCreado(almacenId)).apply();
    }
}
