package Semana2.Dia5_Java.TestJCF;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Doctor> personasList = new ArrayList<>();
        Persona objetoPersona1 = new Doctor(null, null);
        Persona objetoPersona2 = new Doctor(null, null);
        Persona objetoPersona3 = new Doctor(null, null);

        personasList.add(objetoPersona1);
        personasList.add(objetoPersona2);
        personasList.add(objetoPersona3);

        Animal objetoAnimal1 = new Animal(null, null);
        Animal objetoAnimal2 = new Animal(null, null);
        Animal objetoAnimal3 = new Animal(null, null);

        objetoPersona1.setNombre("Juan");
        objetoPersona2.setNombre("Pedro");

        for(Persona item: personasList){
            System.out.println(item.getNombreCompleto());
        }
    }
}
