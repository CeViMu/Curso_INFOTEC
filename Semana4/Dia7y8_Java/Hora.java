package Semana4.Dia7y8_Java;

import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        Scanner hora = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa la hora: ");
        numero = hora.nextInt();
        
        if(numero >= 6 && numero <= 12){
            System.out.println("Buenos días");
        }else if(numero >= 13 && numero <= 20 ){
            System.out.println("Buenas tardes");
        }else if((numero >= 21 && numero <=24) || (numero >= 1 && numero <= 5)){
            System.out.println("Buenas noches");
        }
    }
}


