package Ejercio abstract;

public class Revista{
    private String codigo;
    private String titulo;
    private String estado;
    private Integer año;
    private Integer numero;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
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
    public Revista(String codigo, String titulo, String estado, Integer año, Integer numero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.año = año;
        this.numero = numero;
    } 

    @Override
    public String toString() {
        return "Revista [codigo=" + codigo + ", titulo=" + titulo + ", estado=" + estado + ", año=" + año + ", numero="
                + numero + ", revista1=" + revista1 + "]";
    }
    revista1.toString();
    
    public String datos(){
        return año + codigo;
    }
}
