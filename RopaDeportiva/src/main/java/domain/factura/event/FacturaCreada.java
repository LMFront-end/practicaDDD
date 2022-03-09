package domain.factura.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.almacen.ids.AlmacenId;
import domain.factura.ids.FacturaId;

public class FacturaCreada extends DomainEvent {

    private final FacturaId facturaId;
    private final AlmacenId almacenId;

    public FacturaCreada(FacturaId facturaId, AlmacenId almacenId) {
        super("RopaDeportiva.FacturaCreada");
        this.facturaId = facturaId;
        this.almacenId = almacenId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }
}
