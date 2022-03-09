package domain.factura.command;

import co.com.sofka.domain.generic.Command;
import domain.factura.ids.TransaccionId;
import domain.factura.valueobjects.Fecha;
import generics.Precio;

public class CambiarTransaccion extends Command {

    private final TransaccionId transaccionId;
    private final Fecha fecha;
    private final Precio precio;

    public CambiarTransaccion(String type, TransaccionId transaccionId, Fecha fecha, Precio precio) {
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
