package domain.factura.valueobjects.cliente;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion.Properties> {

    // declaración de variables
    private final String direccion;

    // constructor
    public Direccion(String direccion){
        this.direccion = direccion;
    }

    // interface
    public interface Properties{
        String direccion();

    }

    // constructor del properties
    @Override
    public Direccion.Properties value() {
        return () -> direccion;
    }

    // se implementa equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Direccion)) return false;
        Direccion that = (Direccion) o;
        return Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }
}
