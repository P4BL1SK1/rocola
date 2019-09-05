package ar.edu.unahur.obj2.tp1;

public class Artistas {
    private String nombre;
    private Discos discografia;

    public Artistas(String nombre, Discos discografia) {
        this.nombre = nombre;
        this.discografia = discografia;
    }

    public String getNombre() {
        return nombre;
    }

    public Discos getDiscografia() {
        return discografia;
    }


}
