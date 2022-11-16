package Semana3.Dia6_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1 {
        String nombre;
        String apellido;
        Integer edad;
        Integer peso;
        double estatura;
        double sueldo;

        public String informacion(String nombre, String apellido, Integer edad, Integer peso){
            String frase = nombre + " " + apellido + " " + edad + " " + peso;
            System.out.println(frase);
            return frase;
        }

        public String metodo2(String frase, double estatura, double sueldo){
            String frase1 = frase + " " + estatura + " " + sueldo;
            System.out.println(frase1);
            return frase1;
        }

        public void reemplazo(){
            ArrayList numeros = new ArrayList<>();
            numeros.add(10);
            numeros.add(58);
            numeros.add(68);
            numeros.add(920);
            numeros.add(15);
            numeros.add(16);
            numeros.add(85);
            numeros.add(75);
            numeros.add(32);
            System.out.println(numeros);
            numeros.set(3, 25);
            numeros.set(2, 90);
            System.out.print(numeros);
        }

        public void suma(){
            ArrayList sumandos = new ArrayList<>();
            sumandos.add("15");
            sumandos.add("30");
            sumandos.add("12");
            sumandos.add("60");
            System.out.println(sumandos);

        }
}
