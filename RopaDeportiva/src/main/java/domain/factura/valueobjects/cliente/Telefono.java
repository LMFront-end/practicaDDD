package domain.factura.valueobjects.cliente;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<Telefono.Properties> {

    // declaración de variables
    private final String fijo;
    private final String celular;

    // constructor
    public Telefono(String fijo, String celular){
        this.fijo = fijo;
        this.celular = celular;
    }

    // interface
    public interface Properties{
        String fijo();
        String celular();
    }

    // constructor del properties
    @Override
    public Telefono.Properties value() {
        return new Telefono.Properties(){

            @Override
            public String fijo(){
                return fijo;
            }

            @Override
            public String celular(){
                return celular;
            }
        };
    }

    // se implementa equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefono)) return false;
        Telefono telefono1 = (Telefono) o;
        return fijo.equals(telefono1.fijo) && celular.equals(telefono1.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fijo, celular);
    }
}
