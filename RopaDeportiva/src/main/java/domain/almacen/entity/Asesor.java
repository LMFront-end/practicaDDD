package domain.almacen.entity;

import co.com.sofka.domain.generic.Entity;
import domain.almacen.ids.AsesorId;
import domain.almacen.valueobjects.asesor.AreaDesignada;
import generics.HorasDeTrabajo;
import generics.Identificacion;
import generics.Nombre;

import java.util.Objects;

public class Asesor extends Entity<AsesorId> {

    // se crean variables para los objectValue

    private Nombre nombre;
    private Identificacion identificacion;
    private HorasDeTrabajo horasDeTrabajo;
    private AreaDesignada areaDesignada;


    // se crea un constructor publico para los objectValue

    public Asesor(AsesorId asesorId, Nombre nombre, Identificacion identificacion, HorasDeTrabajo horasDeTrabajo, AreaDesignada areaDesignada){

        // Super --> herencia
        super(asesorId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.areaDesignada = areaDesignada;
        this.horasDeTrabajo = horasDeTrabajo;
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

    // cambbiarHorasDeTrabajo()
    public void cambiarHorasDeTrabajo(HorasDeTrabajo horasDeTrabajo){
        this.horasDeTrabajo = Objects.requireNonNull(horasDeTrabajo);
    }

    // cambiarAreaDesignada()
    public void cambiarAreaDesignada(AreaDesignada areaDesignada){
        this.areaDesignada = Objects.requireNonNull(areaDesignada);
    }
}
