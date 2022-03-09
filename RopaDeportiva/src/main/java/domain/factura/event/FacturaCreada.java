package domain.factura.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.factura.ids.FacturaId;

public class FacturaCreada extends DomainEvent {

    private final FacturaId facturaId;

    public FacturaCreada(String type, FacturaId facturaId) {
        super("RopaDeportiva.FacturaCreada");
        this.facturaId = facturaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
