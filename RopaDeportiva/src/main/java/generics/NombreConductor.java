package generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreConductor implements ValueObject<generics.Nombre.Properties>
{
    // declaracion de variables
    private final String nombre;
    private final String apellido;

    // constructor
    public NombreConductor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // interface
    public interface Properties{
        String nombre();
        String apellido();
    }

    // constructor del properties
    @Override
    public generics.Nombre.Properties value() {
        return new generics.Nombre.Properties(){

            @Override
            public String nombre(){
                return nombre;
            }

            @Override
            public String apellido(){
                return apellido;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NombreConductor)) return false;
        NombreConductor that = (NombreConductor) o;
        return nombre.equals(that.nombre) && apellido.equals(that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}





