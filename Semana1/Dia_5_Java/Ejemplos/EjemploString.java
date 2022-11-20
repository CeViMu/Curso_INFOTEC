package Ejemplos;

import java.time.format.SignStyle;

public class EjemploString {
    public static void main(String[] args) {
        String cadena = "cadena de texto";
        //longitud
        System.out.println("Función length(): " + cadena.length());
        //Devuelve el subconjunto de una cadena basado en la posición inicial de ella 
        System.out.println("Función subString(): " + cadena.substring(6));
        //Devuelve el subconjunto de una cadena basado en la posición inicial y final de ella
        System.out.println("Función subString(int i, int j): " + cadena.substring(0, 6));
        //Devulve el índice de la primera ocurrencia del valor especificado
        System.out.println("Función indexOf(): " + cadena.indexOf("texto"));
        //Indica si un objeto es igual a otro
        System.out.println("Función equals(): " + cadena.equals("cadena de texto"));
        //Compara si dos strings para ver si son iguales ignorando diferencia entre mayusculas y minusculas
        System.out.println("FUnción equalIgnoreCase(): " + cadena.equalsIgnoreCase("cadena DE TEXTO"));
    
        System.out.print(cadena.toLowerCase()); //minusculas
        System.out.print(cadena.toUpperCase()); //mayusculas
    }
    
}
