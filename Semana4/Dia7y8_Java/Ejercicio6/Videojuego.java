package Semana4.Dia7y8_Java.Ejercicio6;

public class Videojuego {
    private String titulo;
    private float duracion = 10;
    private Boolean status = false;
    private String genero;
    private String compañia;

    public String getTitulo() {
        return titulo;
    }

    public void setTiulo(String titulo) {
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

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public Videojuego(String titulo, float duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Videojuego(String titulo, float duracion, Boolean status, String genero, String compañia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.status = status;
        this.genero = genero;
        this.compañia = compañia;
    }

    
    @Override
    public String toString() {
        return "Videojuego [titulo=" + titulo + ", duracion=" + duracion + ", status=" + status + ", genero=" + genero
                + ", compañia=" + compañia + "]";
    }
}
