package Semana4.Dia7y8_Java;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner altura = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa la altura: ");
        numero = altura.nextInt();

        for(int i = numero; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
        for(int i = numero; i>=1; i--){
            if(i==numero){
                for(int j=1; j<=i; j++){
                    System.out.print("*");                
                }
            }else{
                for(int j=1; j<=i; j++){
                    if(j==1 || j==i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                
            }
            
            System.out.print('\n');
        }

    }
}
