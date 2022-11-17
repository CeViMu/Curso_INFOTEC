package Semana4.Evaluacion_backend;

public class Producto {
    private String nombre;
    private float precio;
    private Integer cantidad;
    private Integer tipo;
    
    public Producto(String nombre, float precio, Integer cantidad, Integer tipo) {
        this.nombre = nombre;
        this.precio = (int)(Math.random()*201+300);
        this.cantidad = (int)(Math.random()*6+10);
        this.tipo = (int)(Math.random()*21+1);
    }
    
    
}
