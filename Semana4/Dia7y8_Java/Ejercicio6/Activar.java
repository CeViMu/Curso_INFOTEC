package Semana4.Dia7y8_Java.Ejercicio6;

public interface Activar {
    public boolean activar() {
        Pelicula.status = true;
        Videojuego.status = true;
    }
}
