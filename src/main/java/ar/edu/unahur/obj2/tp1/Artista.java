package ar.edu.unahur.obj2.tp1;

import java.util.Objects;

public class Artista{
    private String nombre;
    private Disco discografia;

    public Artista(String nombre, Disco discografia) {
        this.nombre = nombre;
        this.discografia = discografia;
    }

    public String getNombre() {
        return nombre;
    }

    public Disco getDiscografia() {
        return discografia;
    }

    @Override
    public String toString() {
        return "Artista {" +
                "Nombre: " + nombre + " \n" +
                ", Discografia: " + discografia +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return Objects.equals(nombre, artista.nombre) &&
                Objects.equals(discografia, artista.discografia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, discografia);
    }

    @Override
    public int compareTo(Artista artista) {
        return this.nombre.compareTo(artista.nombre);
    }

}
