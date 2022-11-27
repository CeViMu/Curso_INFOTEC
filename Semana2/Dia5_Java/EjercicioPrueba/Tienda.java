package Semana2.Dia5_Java.EjercicioPrueba;

public class Tienda {
    private String nombre;
    private String direccion;
    private Producto producto;
    private Cliente cliente;

    public Tienda(String nombre, String direccion, Cliente cliente, Producto producto){
        this.nombre = nombre;
        this.direccion = direccion;
        this.producto = producto;
        this.cliente = cliente;
    }
}
