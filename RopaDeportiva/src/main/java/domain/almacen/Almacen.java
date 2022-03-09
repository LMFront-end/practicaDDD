package domain.almacen;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.entity.Asesor;
import domain.almacen.entity.Gerente;
import domain.almacen.entity.Producto;
import domain.almacen.event.AlmacenCreado;
import domain.almacen.ids.AlmacenId;

import java.util.List;
import java.util.Set;


public class Almacen extends AggregateEvent<AlmacenId> {

    // se llaman las entidades de almacen
    // modificador de acceso
    protected AlmacenId almacenId;
    protected Set <Asesor> asesor;
    protected Set <Producto> producto;
    protected Gerente gerente;


    // se crea el constructor
    public Almacen(AlmacenId almacenId){
        super(almacenId);
        appendChange(new AlmacenCreado(almacenId)).apply();

        subscribe(new AlmacenChange(this));
    }

    // se crea la funcion from para el almacen
    // Metodo que permite reconstruir el estado del agregado a partir de una lista de eventos de dominios
    public static Almacen from(AlmacenId almacenId, List<DomainEvent> events){

        var almacen = new Almacen(almacenId);
        // Evento de dominio, aplica el evento de dominio sobre el almacen
        //events.forEach(event -> almacen.applyEvent(event))
        events.forEach(almacen::applyEvent);
        return almacen;
    }
}
