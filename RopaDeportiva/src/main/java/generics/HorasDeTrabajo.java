package generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HorasDeTrabajo implements ValueObject <HorasDeTrabajo.Properties> {

    // declaración de variables
    private final Double horasDeTrabajo;

    // constructor
    public HorasDeTrabajo(Double horasDeTrabajo){
        this.horasDeTrabajo = horasDeTrabajo;
    }

    // interface
    public interface Properties{
        Double horasDeTrabajo();
    }

    // constructor del properties
    @Override
    public Properties value() {
        return () -> horasDeTrabajo;
    }

    // se implementa el equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HorasDeTrabajo)) return false;
        HorasDeTrabajo that = (HorasDeTrabajo) o;
        return horasDeTrabajo.equals(that.horasDeTrabajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horasDeTrabajo);
    }
}
