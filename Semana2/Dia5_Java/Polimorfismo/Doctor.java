package Semana2.Dia5_Java.Polimorfismo;

public class Doctor extends Persona{
    public Doctor(String nombre){
        super(nombre); //aqui se le pasa el nombre
    }

    @Override
    public Boolean trabajando() {
        // TODO Auto-generated method stub
        return true;
    }
}
