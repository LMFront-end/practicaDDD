package domain.almacen.command;

import co.com.sofka.domain.generic.Command;
import domain.almacen.ids.GerenteId;
import generics.Identificacion;
import generics.Nombre;

public class CambiarGerente extends Command {

    private final GerenteId gerenteId;
    private final Nombre nombre;
    private final Identificacion identificacion;

    public CambiarGerente(GerenteId gerenteId, Nombre nombre, Identificacion identificacion){
        this.gerenteId = gerenteId;
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // se generan los getters

    public GerenteId getGerenteId() {
        return gerenteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
