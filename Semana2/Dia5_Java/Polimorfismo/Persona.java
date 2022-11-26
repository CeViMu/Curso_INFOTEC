package Semana2.Dia5_Java.Polimorfismo;

public abstract class Persona {
    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public abstract Boolean trabajando();

    public static void main(String[] args) {
        Persona i = new Doctor("Pedro");
        Persona d = new Abogado("Gema");
        System.out.println(i.trabajando());
        System.out.println(d.trabajando());
    }
}
