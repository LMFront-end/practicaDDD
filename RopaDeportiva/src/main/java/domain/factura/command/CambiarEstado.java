package domain.factura.command;

import co.com.sofka.domain.generic.Command;
import domain.factura.ids.EstadoId;
import domain.factura.valueobjects.Fecha;
import domain.factura.valueobjects.estado.EstadoActual;

public class CambiarEstado extends Command {

    private final EstadoId estadoId;
    private final EstadoActual estadoActual;
    private final Fecha fecha;

    public CambiarEstado(String type, EstadoId estadoId, EstadoActual estadoActual, Fecha fecha) {
        this.estadoId = estadoId;
        this.estadoActual = estadoActual;
        this.fecha = fecha;
    }

    public EstadoId getEstadoId() {
        return estadoId;
    }

    public EstadoActual getEstadoActual() {
        return estadoActual;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
