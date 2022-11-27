package Semana2.Dia5_Java.TestJCF;

public class Persona {
    public Persona(String nombre, String apellido){ //por defecto
        this.nombre = nombre;
        this.apellido = apellido;
    }

    private String nombre;
    private String apellido;

    public String getNombreCompleto(){
        return nombre+" "+apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
