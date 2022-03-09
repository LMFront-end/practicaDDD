package domain.factura.entity;

import co.com.sofka.domain.generic.Entity;
import domain.factura.ids.ClienteId;
import domain.factura.valueobjects.cliente.Direccion;
import domain.factura.valueobjects.cliente.Email;
import domain.factura.valueobjects.cliente.Telefono;
import generics.Identificacion;
import generics.Nombre;

import java.util.Objects;
import java.util.Set;

public class Cliente extends Entity<ClienteId> {

    // se crean variables para los objectValue

    private Nombre nombre;
    private Set<Telefono> telefono;
    private Set<Email> email;
    private Set<Direccion> direccion;
    private Identificacion identificacion;

    // se crea un constructor publico para los objectValue

    public Cliente(ClienteId entityId, Nombre nombre, Set<Telefono> telefono, Set<Email> email, Set<Direccion> direccion, Identificacion identificacion) {

        // Super --> herencia
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }

    // métodos de la entidad Cliente

    // cambiarNombre()
    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    // aniadirTelefono()
    public void aniadirTelefono(Telefono telefono){ this.telefono.add(telefono); }

    // cambiarTelefono()
    public void cambiarTelefono(Telefono telefono){ this.telefono.forEach(t -> {
        if (t.equals(telefono)) {
            this.telefono.remove(t);
            this.telefono.add(telefono);
        }}); }

    // actualizarTelefono()
    public void actualizarTelefono(Telefono telefono){ this.telefono.forEach(t -> {
        if (t.equals(telefono)) {
            this.telefono.remove(t);
            this.telefono.add(telefono);
        }}); }

    // eliminarTelefono()
    public void eliminarTelefono(Telefono telefono){ this.telefono.remove(telefono); }

    // aniadirEmail()
    public void aniadirEmail(Email email){ this.email.add(email); }

    // cambiarEmail()
    public void cambiarEmail(Email email){ this.email.forEach(t -> {
        if (t.equals(email)) {
            this.email.remove(t);
            this.email.add(email);
        }}); }

    // actualizarEmail()
    public void actualizarEmail(Email email){ this.email.forEach(t -> {
        if (t.equals(email)) {
            this.email.remove(t);
            this.email.add(email);
        }}); }

    // cambiarDireccion()
    public void cambiarDireccion(Direccion direccion){ this.direccion.forEach(t -> {
        if (t.equals(direccion)) {
            this.direccion.remove(t);
            this.direccion.add(direccion);
        }}); }

    // actualizarTelefono()
    public void actualizarDireccion(Direccion direccion){ this.direccion.forEach(t -> {
        if (t.equals(direccion)) {
            this.direccion.remove(t);
            this.direccion.add(direccion);
        }}); }

    // eliminarDireccion()
    public void eliminarDireccion(Direccion direccion){ this.direccion.remove(direccion); }

    // cambiarIdentificacion()
    public void cambiarIdentificacion(Identificacion identificacion){
        this.identificacion = Objects.requireNonNull(identificacion);
    }


}
