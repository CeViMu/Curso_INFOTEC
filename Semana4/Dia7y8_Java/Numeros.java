package Semana4.Dia7y8_Java;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
    static Integer divisores;
    public static Boolean primo(Integer n){
        divisores=0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                divisores+=1;
            }
        }
        if(divisores>2){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) { 
        Scanner numero = new Scanner(System.in);
        int n=0, suma=0, mayor=0, menor=0, sumaPo=0, sumaNe=0, k=0;
        ArrayList<Integer> primos = new ArrayList<Integer>();
        do{
            System.out.println("Ingrese un número (Ingrese -1 para finalizar): ");
            n = numero.nextInt();
            if(n != -1){ /*sumar */
                suma = suma + n;
            }

            if(n>0 && n!=-1){
                sumaPo = sumaPo + n;
            }

            if(n<0 && n!=-1){
                sumaNe = sumaNe + n;
                if(primo(n) == true){
                    primos.add(n);
                }
            }

            if(mayor == 0){ /*mayor */
                mayor = n;
            }else{
                if(n > mayor && n!=-1)
                mayor = n;
            }

            if(menor == 0){
                menor = n;
            }else{
                if(n < menor && n!=-1)
                menor = n;
            }
            
            
        }while(n != -1);
        System.out.println("El número mayor ingresado es: " + mayor);
        System.out.println("El número menor ingresado es: " + menor);
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("La suma de los números positivos ingresados es: " + sumaPo);
        System.out.println("La suma de los números negativos ingresados es: " + sumaNe);
        System.out.println("Los elementos de la lista de números son: " + primos.toString());
    }

}
