package domain.almacen.valueobjects.producto;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca implements ValueObject<Marca.Value> {

    private final Value value;

    // constructor
    public Marca(Value value){
        this.value = value;
    }

    // crear el enum
    public enum Value{
        ADIDAS,
        PUMA,
        REBOOK,
        NIKE,
        FILA,
        KAPPA
    }

    // implementacion del metodo value
    @Override
    public Value value(){
        return  value;
    }

    // se implementa el equal y hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marca)) return false;
        Marca marca = (Marca) o;
        return value == marca.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
