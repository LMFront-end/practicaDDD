package domain.factura.entity;

import co.com.sofka.domain.generic.Entity;
import domain.factura.ids.EstadoId;
import domain.factura.valueobjects.estado.EstadoActual;

public class Estado extends Entity<EstadoId> {

    private EstadoActual estadoActual;
//    private Fecha fecha;
}
