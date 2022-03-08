package domain.almacen.valueobjects.asesor;

import co.com.sofka.domain.generic.ValueObject;



public class Nombre implements ValueObject<Nombre.Properties> {

    // declaracion de variables
    private final String nombre;
    private final String apellido;

    public Nombre(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public interface Properties{
        public String nombre();
        public String apellido();
    }

    @Override
    public Properties value() {
        return new Properties(){

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


}
