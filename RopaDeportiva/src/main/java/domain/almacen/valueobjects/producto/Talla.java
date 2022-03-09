package domain.almacen.valueobjects.producto;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Talla implements ValueObject<Talla.Value> {

    private final Value value;

    // constructor
    public Talla(Value value){
        this.value = value;
    }

    // crear el enum
    public enum Value{
        AMERICANA,
        UNICA,
        PEQUEÑAS,
        EXTRA_CHICAS,
        EXTRA_GRANDE,
        GRANDE
    }

    // implementacion del metodo value
    @Override
    public Value value(){
        return  value;
    }

    // se implementa el equals y hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Talla)) return false;
        Talla talla = (Talla) o;
        return value == talla.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
