package domain.distribucion.valueobjects.ruta;

import co.com.sofka.domain.generic.ValueObject;



import java.util.Objects;

public class PLaca implements ValueObject <PLaca.Properties>
{
    // declaración de variables
    private final String destino;

    // constructor
    public PLaca(String destino){
        this.destino = destino;
    }

    // interface
    public interface Properties{
        String destino();
    }

    // constructor del properties
    @Override
    public PLaca.Properties value() {
        return () -> destino;
    }

    // se implementa el equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PLaca)) return false;
        PLaca that = (PLaca) o;
        return destino.equals(that.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destino);
    }

}