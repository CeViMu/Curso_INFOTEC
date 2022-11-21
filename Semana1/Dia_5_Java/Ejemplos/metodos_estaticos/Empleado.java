package Ejemplos.metodos estaticos;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private static double salarioBase=1000;

    public double getSalarioBase(){
        return salarioBase;
    }

    public static void setSalarioBase(double salario){
        salarioBase = salario;
    }

    public static String muestraMensaje(){
        return "Soy un método estático";
    }
}
