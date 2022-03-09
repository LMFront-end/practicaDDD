package domain.factura.command;

import co.com.sofka.domain.generic.Command;
import domain.almacen.ids.AlmacenId;
import domain.factura.ids.FacturaId;

public class CrearFactura extends Command {

    private final FacturaId facturaId;
    private final AlmacenId almacenId;

    public CrearFactura(FacturaId facturaId, AlmacenId almacenId) {
        this.almacenId = almacenId;
        this.facturaId = facturaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }
}
