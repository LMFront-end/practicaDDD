package domain.almacen.valueobjects.producto;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<Tipo.Value> {

    private final Value value;

    // constructor
    public Tipo(Value value){
        this.value = value;
    }

    // crear el enum
    public enum Value{
        PANTALONES,
        CAMISAS,
        CAMISETAS,
        FALDAS,
        SHORTS,
        BLUSAS,
        BUSOS_DAMA,
        BUSOS_CABALLERO,
        MEDIAS,
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
        if (!(o instanceof Tipo)) return false;
        Tipo tipo = (Tipo) o;
        return value == tipo.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

