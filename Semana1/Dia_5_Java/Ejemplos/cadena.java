package Ejemplos;

public class cadena {
    public static void main(String[] args) {
        double variableDouble = 15.48;
        int i = 1;
        String cadena1, cadena2;
        //convirtiendo cadena en una variable
        cadena1 = Double.toString(variableDouble);
        cadena2 = Integer.toString(i);
        System.out.println("Resultado 1 --> Aqui se realiza una concatenación de ("+cadena1+"+1) con resultado: ("+(cadena1+1)+")");
        System.out.println("Resultado 2 --> Aqui se realiza una concatenación de (1+"+cadena1+") con resultado: ("+(1+cadena1)+")");
        System.out.println("Resultado 3 --> Aqui se realiza una concatenación de cadena2 + cadena1 con resultado: "+ (cadena1 + cadena2));
}
}