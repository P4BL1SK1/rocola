package ar.edu.unahur.obj2.tp1;

import java.sql.Time;
import java.util.List;

public class Cancion implements Comparable<Cancion>{
    private String titulo;
    private Time duracion;
    private Artista autor;
    private List<Disco> discos;

    public Cancion(String titulo, Time duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = null;
        this.discos = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public Time getDuracion() {
        return duracion;
    }

    public Artista getAutor() {
        return autor;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void setAutor(Artista autor) {
        this.autor = autor;
    }

    public void setDiscos(List<Disco> discos) {
        this.discos = discos;
    }

    @Override
    public String toString() {
        return "Cancion {" +
                ", titulo: " + titulo + '\'' +
                ", duracion: " + duracion +
                ", autor: " + autor +
                ", discos: " + discos +
                '}';
    }

    @Override
    public int compareTo(Cancion cancion) {
        return this.titulo.compareTo(cancion.titulo);
    }
}
