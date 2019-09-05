package ar.edu.unahur.obj2.tp1;

import java.util.List;

public class Discos implements Comparable<Discos>{
    private String titulo;
    private Artistas autor;
    private Generos genero;
    private List<Canciones> canciones;

    public Discos(String titulo, Artistas autor, Generos genero, List<Canciones> canciones) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.canciones = canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artistas getAutor() {
        return autor;
    }

    public Generos getGenero() {
        return genero;
    }

    public List<Canciones> getCanciones() {
        return canciones;
    }

    @Override
    public int compareTo(Discos disco) {
        return this.titulo.compareTo(disco.titulo);
    }
}
