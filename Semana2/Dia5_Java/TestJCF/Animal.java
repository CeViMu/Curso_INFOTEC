package Semana2.Dia5_Java.TestJCF;

public class Animal {
    private String raza;
    private String edad;
    
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public Animal(String raza, String edad) {
        this.raza = raza;
        this.edad = edad;
    }
    
}
