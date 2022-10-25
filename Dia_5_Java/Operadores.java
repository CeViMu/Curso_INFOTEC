public class Operadores {
    public static void main(String[] args){
        int a,b, suma, resta, producto;
        float cociente;
        a = 34;
        b = 23;
        suma = a+b;
        resta = a-b;
        producto = a*b;
        cociente = (float) a/b; 
        System.out.println("La suma de " + a + " + " + b + " es " + suma);
        System.out.println("La resta de " + a + " - " + b + " es " + resta);
        System.out.println("El producto de " + a + " * " + b + " es " + producto);
        System.out.println("El cociente de " + a + " / " + b + " es " + cociente);
    }
}
