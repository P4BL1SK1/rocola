package ar.edu.unahur.obj2.tp1;

import java.util.List;

public class Disco implements Comparable<Disco>{
    private String titulo;
    private Artista autor;
    private Genero genero;
    private List<Cancion> canciones;

    public Disco(String titulo, Artista autor, Genero genero, List<Cancion> canciones) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.canciones = canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public int compareTo(Disco disco) {
        return this.titulo.compareTo(disco.titulo);
    }

    @Override
    public String toString() {
        return "Disco {" +
                "titulo: " + titulo + '\'' +
                ", autor: " + autor +
                ", genero: " + genero +
                ", canciones: " + canciones +
                '}';
    }
}

