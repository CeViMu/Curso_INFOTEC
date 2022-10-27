public class Ejercicio1_2{
    public static void main(String[] args) {
        //Variable
        String frase = "Aprendiendo Java";
        System.out.println("La frase en mayusculas es: " + frase.toUpperCase());

        //Número de caracteres
        System.out.println("El número de caracteres de la frase es: " + frase.length());

        //Suma, resta, multiplicación y división
        int a = 5;
        int b= 5;
        int suma, resta, multiplicación, division;
        suma = a+b;
        resta = a-b;
        multiplicación = a*b;
        division = a/b;
        System.out.println("La suma de " + a + " + " + b + " es " + suma);
        System.out.println("La resta de " + a + " - " + b + " es " + resta);
        System.out.println("La multiplicación de " + a + " * " + b + " es " + multiplicación);
        System.out.println("La división de " + a + " / " + b + " es " + division);

        //Conversión
        double var1 = 7.771;
        String var1_1 = String.valueOf(var1);
        System.out.println("Resultado: "+ var1_1);

    }
}
