package domain.distribucion.valueobjects.vehiculo;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class TipoVehiculo  implements ValueObject<TipoVehiculo.Properties>
{
    // declaración de variables
    private final String tipoVehiculo;

    // constructor
    public TipoVehiculo(String tipoVehiculo){
        this.tipoVehiculo = tipoVehiculo;
    }

    // interface
    public interface Properties{
        String tipoVehiculo();
    }

    // constructor del properties
    @Override
    public TipoVehiculo.Properties value() {
        return () -> tipoVehiculo;
    }

    // se implementa el equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoVehiculo)) return false;
        TipoVehiculo that = (TipoVehiculo) o;
        return tipoVehiculo.equals(that.tipoVehiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoVehiculo);
    }
}
