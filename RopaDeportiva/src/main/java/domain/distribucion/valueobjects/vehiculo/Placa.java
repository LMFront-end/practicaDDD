package domain.distribucion.valueobjects.vehiculo;

import co.com.sofka.domain.generic.ValueObject;
import domain.distribucion.valueobjects.ruta.PLaca;

import java.util.Objects;

public class Placa  implements ValueObject<Placa.Properties>
{
    // declaración de variables
    private final String placa;

    // constructor
    public Placa(String placa){
        this.placa = placa;
    }

    // interface
    public interface Properties{
        String placa();
    }

    // constructor del properties
    @Override
    public Placa.Properties value() {
        return () -> placa;
    }

    // se implementa el equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Placa)) return false;
        Placa that = (Placa) o;
        return placa.equals(that.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }
}
