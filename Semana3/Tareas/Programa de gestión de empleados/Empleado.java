package Semana3.Tareas.Programa de gestión de empleados;

public class Empleado {
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String actDiarias;
    private Integer codigo;
    
    public Empleado(String nombre, String apellidos, Integer edad, String actDiarias, Integer codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.actDiarias = actDiarias;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getActDiarias() {
        return actDiarias;
    }

    public void setActDiarias(String actDiarias) {
        this.actDiarias = actDiarias;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
