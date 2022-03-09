package domain.factura.command;

import co.com.sofka.domain.generic.Command;
import domain.factura.ids.FacturaId;

public class CrearFactura extends Command {

    private final FacturaId facturaId;

    public CrearFactura(FacturaId facturaId) {
        this.facturaId = facturaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
