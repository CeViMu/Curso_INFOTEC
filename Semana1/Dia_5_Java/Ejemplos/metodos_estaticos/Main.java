package metodos estaticos;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        //modificando el salario 
        Empleado.setSalarioBase(500); //los sets son para asignar y los geters para obtener un dato en una variable
        System.out.println("Salario base del empleado1: " + empleado1.getSalarioBase);
        System.out.println("Salario base del empleado2: " + empleado2.getSalarioBase);

        //Modificamos el salario base a 2500; 
        Empleado.setSalarioBase(2500); //los sets son para asignar y los geters para obtener un dato en una variable
        System.out.println("Salario base del empleado1: " + empleado1.getSalarioBase);
        System.out.println("Salario base del empleado2: " + empleado2.getSalarioBase);

    }
}
