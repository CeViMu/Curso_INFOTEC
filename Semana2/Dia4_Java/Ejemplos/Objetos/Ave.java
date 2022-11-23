package Semana2.Dia4_Java.Ejemplos.Objetos;

public class Ave {
    String nombre;
    String raza;
    int edad;
    String color;

    public Ave(String nombre, String raza, int edad, String color){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    //Creando metodos get y set
    public String getNombre(){
        return nombre;
    }

    public String getRaza(){
        return raza;
    }

    public int getEdad(){
        return edad;
    }

    public String getColor(){
        return color;
    }

    @Override //sobreescritura
    public String toString(){
        return("Hola soy un pajaro, mi nombre es: " + this.getNombre() + "\nMi raza, edad y color son: " + this.getRaza() + ", " + this.getEdad() + " y " + this.getColor());
    }

    public static void main(String[] args) {
        Ave periquito = new Ave("Oliv", "perico", 5, "azul"); //Instanciando un objeto
        System.out.println(periquito.toString()); //para imprimir lo que esta en toString
    }
}
