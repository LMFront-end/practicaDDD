package domain.almacen.entity;

import co.com.sofka.domain.generic.Entity;
import domain.almacen.ids.ProductoId;
import domain.almacen.valueobjects.producto.*;


import java.util.Objects;

public class Producto extends Entity<ProductoId> {

    // se crean variables para los objectValue

    private Tipo tipo;
    private Genero genero;
    private Marca marca;
    private Precio precio;
    private Talla talla;


    // se crea un constructor público para los objectValue

    public Producto(ProductoId productoId, Tipo tipo, Genero genero, Marca marca, Precio precio, Talla talla){

        // Super --> herencia
        super(productoId);
        this.tipo = tipo;
        this.genero = genero;
        this.marca = marca;
        this.precio = precio;
        this.talla = talla;
    }

    // métodos para el Producto

    //cambiarPrecio()
    public void cambiarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    //cambiarTalla()
    public void cambiarTalla(Talla talla){
        this.talla = Objects.requireNonNull(talla);
    }

    //cambiarMarca()
    public void cambiarMarca(Marca marca){
        this.marca = Objects.requireNonNull(marca);
    }

    //cambiarGenero()
    public void cambiarGenero(Genero genero){
        this.genero = Objects.requireNonNull(genero);
    }

    //cambiarTipo()
    public void cambiarTipo(Tipo tipo){
        this.tipo = Objects.requireNonNull(tipo);
    }

}
