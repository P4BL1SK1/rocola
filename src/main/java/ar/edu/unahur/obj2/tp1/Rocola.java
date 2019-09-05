package ar.edu.unahur.obj2.tp1;

import java.util.List;
import java.util.stream.Collectors;

public class Rocola {
    private List<Discos> discos;

    public Rocola(List<Discos> discos) {
        this.discos = discos;
    }
    public List<Canciones> CancionesDisponbles() {
        return this.discos.stream().flatMap(disco->disco.getCanciones().stream()).sorted().collect(Collectors.toList());
    }
    public List<Discos> discosDisponibles() {
        return this.discos.stream().sorted().sorted().collect(Collectors.toList());
    }
}
