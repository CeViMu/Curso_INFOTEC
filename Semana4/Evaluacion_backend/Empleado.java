package Semana4.Evaluacion_backend;

import java.util.ArrayList;

public class Empleado {
    private String nombreCompleto;
    private Integer edad;
    private Integer antiguedad;
    private String tipo;
    private String[] actividades;

    public Empleado(String nombreCompleto, Integer edad, Integer antiguedad, String tipo) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.tipo = tipo;
    }

    public String[] getActividades() {
        return actividades;
    }

    public void setActividades(String[] actividades) {
        this.actividades = actividades;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo; 
    }

    if(tipo = 1){actividades[1] = "Acomodar productos";
        actividades[0] = "Vender productos";
        actividades[1] = "Acomodar productos";
        actividades[2] = "Descansar";
        actividades[3] = "Sentarse";
    }else if (tipo = 2){
        actividades[0] = "Vender productos";
        actividades[1] = "Descansar";
        actividades[2] = "Correr";
    }

    public void recibirPago(double salario){

    }
}
