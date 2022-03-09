package domain.almacen;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.entity.Asesor;
import domain.almacen.entity.Gerente;
import domain.almacen.entity.Producto;
import domain.almacen.event.*;
import domain.almacen.ids.AlmacenId;
import domain.almacen.ids.AsesorId;
import domain.almacen.ids.GerenteId;
import domain.almacen.ids.ProductoId;
import domain.almacen.valueobjects.asesor.AreaDesignada;
import domain.almacen.valueobjects.asesor.HorasDeTrabajo;
import domain.almacen.valueobjects.producto.*;
import generics.Identificacion;
import generics.Nombre;
import generics.Precio;

import java.util.List;
import java.util.Objects;
import java.util.Set;


public class Almacen extends AggregateEvent<AlmacenId> {

    // se llaman las entidades de almacen
    // modificador de acceso
    protected AlmacenId almacenId;
    protected Set <Asesor> asesores;
    protected Set <Producto> productos;
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

    // métodos del agregado

    // añadirProducto()
    public void aniadirProducto(ProductoId productoId, Tipo tipo, Genero genero, Marca marca, Precio precio, Talla talla ){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(genero);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(talla);
        appendChange(new ProductoAniadido(productoId, tipo, genero,  marca,  precio,  talla));
    }

    // cambiarProducto()
    public void  cambiarProducto(ProductoId productoId, Tipo tipo, Genero genero, Marca marca, Precio precio, Talla talla){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(genero);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(talla);
        appendChange(new ProductoCambiado(productoId, tipo, genero,  marca,  precio,  talla));
    }

    // eliminarProducto()
    public void eliminarProducto(ProductoId productoId){
        Objects.requireNonNull(productoId);
        appendChange(new ProductoEliminado(productoId));
    }

    // añadirAsesor()
    public void aniadirAsesor(AsesorId asesorId, Nombre nombre, Identificacion identificacion, HorasDeTrabajo horasDeTrabajo, AreaDesignada areaDesignada){
        Objects.requireNonNull(asesorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(horasDeTrabajo);
        Objects.requireNonNull(areaDesignada);
        appendChange(new AsesorAniadido(asesorId, nombre, identificacion, horasDeTrabajo, areaDesignada));

    }

    // cambiarAsesor()
    public void cambiarAsesor(AsesorId asesorId, Nombre nombre, Identificacion identificacion, HorasDeTrabajo horasDeTrabajo, AreaDesignada areaDesignada){
        Objects.requireNonNull(asesorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(horasDeTrabajo);
        Objects.requireNonNull(areaDesignada);
        appendChange(new AsesorCambiado(asesorId, nombre, identificacion, horasDeTrabajo, areaDesignada));
    }

    // eliminarAsesor()
    public void eliminarAsesor(AsesorId asesorId){
        Objects.requireNonNull(asesorId);
        appendChange(new AsesorEliminado(asesorId));

    }

    // añadirGerente()
    public void aniadirGerente(GerenteId gerenteId, Nombre nombre, Identificacion identificacion){
        Objects.requireNonNull(gerenteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        appendChange(new GerenteAniadido(gerenteId, nombre, identificacion));
    }

    // cambiarGerente()
    public void cambiarGerente(GerenteId gerenteId, Nombre nombre, Identificacion identificacion){
        Objects.requireNonNull(gerenteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        appendChange(new GerenteCambiado(gerenteId, nombre, identificacion));
    }

    // eliminarGerente()
    public void eliminarGerente(GerenteId gerenteId){
        Objects.requireNonNull(gerenteId);
        appendChange(new GerenteEliminado(gerenteId));
    }

    // se crean los constructores

    public Set<Asesor> asesores(){
        return asesores;
    }

    public Set <Producto> productos(){
        return productos;
    }

    public Gerente gerente(){
        return gerente;
    }

}
