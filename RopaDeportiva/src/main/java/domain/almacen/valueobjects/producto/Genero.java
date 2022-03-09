package domain.almacen.valueobjects.producto;

import co.com.sofka.domain.generic.ValueObject;
import domain.almacen.valueobjects.asesor.AreaDesignada;

import java.util.Objects;

public class Genero implements ValueObject<Genero.Value> {

    private final Value value;

    // constructor
    public Genero(Value value){
        this.value = value;
    }

    // crear el enum
    public enum Value{
        MASCULINO,
        FEMENINO,
        UNISEX
    }

    // implementacion del metodo value
    @Override
    public Value value(){
        return  value;
    }

    // Se implementa el equals y hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero)) return false;
        Genero genero = (Genero) o;
        return value == genero.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
