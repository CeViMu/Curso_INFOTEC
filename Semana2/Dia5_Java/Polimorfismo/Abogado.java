package Semana2.Dia5_Java.Polimorfismo;

public class Abogado extends Persona{
    public Abogado(String nombre){
        super(nombre); //aqui se le pasa el nombre
    }

    @Override
    public Boolean trabajando() {
        // TODO Auto-generated method stub
        return false;
    }
}
