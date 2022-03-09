package domain.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.almacen.ids.AlmacenId;
import domain.factura.entity.Cliente;
import domain.factura.entity.Estado;
import domain.factura.entity.Transaccion;
import domain.factura.ids.FacturaId;

public class Factura extends AggregateEvent<FacturaId> {

    // se llaman las entidades de factura
    // modificador de acceso
    protected FacturaId facturaId;
    protected Cliente cliente;
    protected Transaccion transaccion;
    protected Estado estado;
    protected AlmacenId almacenId;

    // se crea el constructor

    public Factura(FacturaId entityId, AlmacenId almacenId) {
        super(entityId);
        this.almacenId = almacenId;
    }
}
