package domain.factura.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.factura.ids.TransaccionId;
import domain.factura.valueobjects.Fecha;
import generics.Precio;

public class TransaccionCambiada extends DomainEvent {

    private final TransaccionId transaccionId;
    private final Fecha fecha;
    private final Precio precio;

    public TransaccionCambiada(TransaccionId transaccionId, Fecha fecha, Precio precio) {
        super("RopaDeportiva.TransaccionCambiada");
        this.transaccionId = transaccionId;
        this.fecha = fecha;
        this.precio = precio;
    }

    public TransaccionId getTransaccionId() {
        return transaccionId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Precio getPrecio() {
        return precio;
    }
}
