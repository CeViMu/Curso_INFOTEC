public class App {
    public static void main(String[] args){
        // 1) Obtener la longitud del texto "Hola Mundo java"
        String phrase = "Hola Mundo Java";
        System.out.println("El resultado del ejercicio 1 es: "+phrase.length());

        // 2) Eliminar los espacios del texto "Hola Mundo Java"
        String phrase1 = phrase.replace(" ", "");
        System.out.println("El resultado del ejercicio 2 es: "+phrase1);

        // 3) Imprimir caracter por caracter la frase "Hola Mundo Java"
        System.out.println("El resultado del ejerciio 3 es: ");
        for(int i=0; i<phrase.length(); i++){
            System.out.print(phrase.charAt(i));
        }

        // 4) Invierte la cadena "Hola Mundo Java"
        
        String invertedPhrase = "";
        for(int i=phrase.length()-1; i>=0; i--){
            invertedPhrase+=phrase.charAt(i);
        }
        System.out.println(" ");
        System.out.println("El resultado del ejercicio 4 es: " + invertedPhrase);

        // 5) Cuenta las vocales de la palabra "Hola Mundo Java"
    }

}
