package Ejercio abstract;

public class Libro implements PrestaLibro{
   
    private String codigo;
    private String titulo;
    private String estado;
    private Integer año;
    static boolean prestado = false;
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Integer getAño() {
        return año;
    }
    public void setAño(Integer año) {
        this.año = año;
    }
    public static boolean isPrestado() {
        return prestado;
    }
    public static void setPrestado(boolean prestado) {
        Libro.prestado = prestado;
    }

    public Libro(String codigo, String titulo, String estado, Integer año) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.estado = estado;
            this.año = año;
        }

    public String Info(){
        return codigo + titulo + estado + año;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", titulo=" + titulo + ", estado=" + estado + ", año=" + año + "]";
    }

    public String datos1(){
        return año + codigo;
    }
}
