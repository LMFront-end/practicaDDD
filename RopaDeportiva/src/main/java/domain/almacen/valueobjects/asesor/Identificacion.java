package domain.almacen.valueobjects.asesor;

import co.com.sofka.domain.generic.ValueObject;

public class Identificacion implements ValueObject<Identificacion.Properties> {

    // declaración de variables
    private final Long identificacion;

    // constructor
    public Identificacion(Long identificacion){
        this.identificacion = identificacion;
    }

    // interface
    public interface Properties{
        public Long identificacion();

    }

    // constructor del properties
    @Override
    public Properties value() {
        return new Properties(){
            @Override
            public Long identificacion(){
                return identificacion;
            }
        };
    }
}
