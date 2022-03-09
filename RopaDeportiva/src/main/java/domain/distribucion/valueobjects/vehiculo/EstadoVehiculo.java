package domain.distribucion.valueobjects.vehiculo;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoVehiculo implements ValueObject<EstadoVehiculo.Properties>
{
    // declaración de variables
    private final String estadoVehiculo;

    // constructor
    public EstadoVehiculo(String estadoVehiculo){
        this.estadoVehiculo = estadoVehiculo;
    }

    // interface
    public interface Properties{
        String estadoVehiculo();
    }

    // constructor del properties
    @Override
    public EstadoVehiculo.Properties value() {
        return () -> estadoVehiculo;
    }

    // se implementa el equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstadoVehiculo)) return false;
        EstadoVehiculo that = (EstadoVehiculo) o;
        return estadoVehiculo.equals(that.estadoVehiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estadoVehiculo);
    }
}
