package domain.almacen.entity;

import co.com.sofka.domain.generic.Entity;
import domain.almacen.ids.GerenteId;
import generics.Identificacion;
import generics.Nombre;

import java.util.Objects;

public class Gerente extends Entity <GerenteId> {

    // se crean variables para los objectValue

    private Nombre nombre;
    private Identificacion identificacion;

    // se crea un constructor público para los objectValue

    public Gerente(GerenteId gerenteId, Nombre nombre, Identificacion identificacion){

        // Super --> herencia
        super(gerenteId);
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // métodos de la entidad Asesor

    // cambiarNombre()
    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    // cambiarIdentificacion()
    public void cambiarIdentificacion(Identificacion identificacion){
        this.identificacion = Objects.requireNonNull(identificacion);
    }

}
