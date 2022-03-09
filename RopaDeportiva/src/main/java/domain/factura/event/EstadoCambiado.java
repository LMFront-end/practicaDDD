package domain.factura.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.factura.ids.EstadoId;
import domain.factura.valueobjects.Fecha;
import domain.factura.valueobjects.estado.EstadoActual;

public class EstadoCambiado extends DomainEvent {

    private final EstadoId estadoId;
    private final EstadoActual estadoActual;
    private final Fecha fecha;

    public EstadoCambiado(String type, EstadoId estadoId, EstadoActual estadoActual, Fecha fecha) {
        super("RopaDeportiva.EstadoCambiado");
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
