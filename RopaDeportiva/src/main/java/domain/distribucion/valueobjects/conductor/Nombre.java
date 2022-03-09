package domain.distribucion.valueobjects.conductor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre   implements ValueObject<generics.Nombre.Properties>
{
    // declaracion de variables
    private final String nombre;
    private final String apellido;

    // constructor
    public Nombre(String nombre, String apellido){
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

    // implementación de equals y el hashCode


    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}





