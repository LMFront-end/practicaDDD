package domain.distribucion.valueobjects.ruta;

import co.com.sofka.domain.generic.ValueObject;



import java.util.Objects;

public class Origen implements ValueObject <Origen.Properties>
{
    // declaración de variables
    private final String origen;

    // constructor
    public Origen(String origen_){
        this.origen = origen_;
    }

    // interface
    public interface Properties{
        String origen();
    }

    // constructor del properties
    @Override
    public Origen.Properties value() {
        return () -> origen;
    }

    // se implementa el equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Origen)) return false;
        Origen that = (Origen) o;
        return origen.equals(that.origen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origen);
    }

}
