package ar.edu.unahur.obj2.tp1;

import java.sql.Time;
import java.util.List;

public class Canciones implements Comparable<Canciones>{
    private String titulo;
    private Time duracion;
    private Artistas autor;
    private List<Discos> discos;

    public Canciones(String titulo, Time duracion, Artistas autor, List<Discos> discos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = autor;
        this.discos = discos;
    }

    public String getTitulo() {
        return titulo;
    }

    public Time getDuracion() {
        return duracion;
    }

    public Artistas getAutor() {
        return autor;
    }

    public List<Discos> getDiscos() {
        return discos;
    }

    @Override
    public int compareTo(Canciones cancion) {
        return this.titulo.compareTo(cancion.titulo);
    }
}
