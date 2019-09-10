package ar.edu.unahur.obj2.tp1;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Rocola {
    private List<Disco> discos;

    public Rocola(List<Disco> discos) {
        this.discos = discos;
    }
    public List<Cancion> CancionesDisponbles() {
        return this.discos.stream().flatMap(disco->disco.getCanciones().stream()).sorted().collect(Collectors.toList());
    }
    public List<Disco> discosDisponibles() {
        return this.discos.stream().sorted().sorted().collect(Collectors.toList());
    }
    public List<Artista> artistasDisponibles() {
        return  this.discos.stream().map(disk -> disk.getAutor()).sorted().collect(Collectors.toList());
    }
    public  List<Disco> albumPorGenero(Genero genero) {
        return this.discos.stream().filter(disk -> disk.getGenero().equals(genero)).collect(Collectors.toList());
    }
    /*public List<Cancion> cancionPorGenero(Genero genero) {
        return this.discos.stream().filter(disk -> disk.getCanciones().equals(genero)).collect(Collector)
    }*/
}
