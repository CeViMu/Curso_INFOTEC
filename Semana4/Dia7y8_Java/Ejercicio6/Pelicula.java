package Semana4.Dia7y8_Java.Ejercicio6;

public class Pelicula {
    private String titulo;
    static private float duracion;
    private Boolean status = false;
    private String genero;
    private String director;

    public Pelicula(String titulo, float duracion, String genero, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director; 
    }

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public Pelicula(String titulo, float duracion, String status, String genero, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.status = status;
        this.genero = genero;
        this.director = director;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setNombre(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Videojuego [titulo=" + titulo + ", duracion=" + duracion + ", status=" + status + ", genero=" + genero
                + ", compañia=" + director + "]";
    }
}
