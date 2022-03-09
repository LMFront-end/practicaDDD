package domain.almacen.command;

import co.com.sofka.domain.generic.Command;
import domain.almacen.ids.ProductoId;
import domain.almacen.valueobjects.producto.*;
import generics.Precio;

public class AniadirProducto extends Command {

    private final ProductoId productoId;
    private final Tipo tipo;
    private final Genero genero;
    private final Marca marca;
    private final Precio precio;
    private final Talla talla;

    public AniadirProducto(ProductoId productoId, Tipo tipo, Genero genero, Marca marca, Precio precio, Talla talla){
        this.productoId = productoId;
        this.tipo = tipo;
        this.genero = genero;
        this.marca = marca;
        this.precio = precio;
        this.talla = talla;
    }

    // se agregan los getters

    public ProductoId getProductoId() {
        return productoId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Genero getGenero() {
        return genero;
    }

    public Marca getMarca() {
        return marca;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Talla getTalla() {
        return talla;
    }
}
