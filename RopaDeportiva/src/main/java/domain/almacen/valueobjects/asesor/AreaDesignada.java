package domain.almacen.valueobjects.asesor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AreaDesignada implements ValueObject <AreaDesignada.Value> {

    private final Value value;

    // constructor
    public AreaDesignada(Value value){
        this.value = value;
    }

    // crear el enum
    public enum Value{
        VESTIDORES,
        CAJA,
        LOBBY,
        ESTANTERIAS
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
        if (!(o instanceof AreaDesignada)) return false;
        AreaDesignada that = (AreaDesignada) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
