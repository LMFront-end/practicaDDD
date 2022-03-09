package generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IdentificacionConductor implements ValueObject<IdentificacionConductor.Properties>
{
    // declaración de variables
    private final Long identificacion;

    // constructor
    public IdentificacionConductor(Long identificacion){
        this.identificacion = identificacion;
    }

    // interface
    public interface Properties{
        Long identificacion();

    }

    // constructor del properties
    @Override
    public IdentificacionConductor.Properties value() {
        return () -> identificacion;
    }

    // se implementa equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdentificacionConductor)) return false;
        IdentificacionConductor that = (IdentificacionConductor) o;
        return Objects.equals(identificacion, that.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacion);
    }
}
