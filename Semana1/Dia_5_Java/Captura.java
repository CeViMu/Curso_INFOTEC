import java.util.Scanner;

public class Captura {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = lectura.nextInt();
        System.out.println("Tu edad es: "+ edad);
    }
}
