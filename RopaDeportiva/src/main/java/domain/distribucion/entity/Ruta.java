package domain.distribucion.entity;

import co.com.sofka.domain.generic.Entity;
import domain.distribucion.ids.RutaId;
import domain.distribucion.valueobjects.ruta.Destino;
import domain.distribucion.valueobjects.ruta.Origen;
import generics.NombreConductor;

import java.util.Objects;

public class Ruta extends Entity<RutaId>
{
    private Origen origen;
    private Destino destino;

    public Ruta(RutaId entityId, Origen origen, Destino destino) {
        super(entityId);
        this.origen = origen;
        this.destino = destino;
    }


    //nuevoOrigen()

     public void cambiarOrigen(Origen origen)
     {
        this.origen = Objects.requireNonNull(origen);
     }

     // nuevoDestino()
    public void cambiarDestino(Destino destino)
    {
        this.destino = Objects.requireNonNull(destino);
    }


}
