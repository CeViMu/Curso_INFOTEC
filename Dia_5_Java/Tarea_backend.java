public class Tarea_backend {
    public static void main(String[] args) {
        System.out.println("Conversiones de tipos de datos de manera implícita");
        System.out.println("1) Convirtiendo la variable var1 de tipo byte a una variable var2 de tipo entero");
        byte var1 = 9;
        int var2 = var1;
        System.out.println("Valor de la variable var1: "+ var1);
        System.out.println("Valor de la variable var2: "+ var2);

        System.out.println("2) Convirtiendo la variable var3 de tipo byte a una variable var4 de tipo short");
        byte var3 = -120;
        short var4 = var3;
        System.out.println("Valor de la variable var3: "+ var3);
        System.out.println("Valor de la variable var4: "+ var4);

        System.out.println("3) Convirtiendo la variable var5 de tipo int a una variable var6 de tipo float");
        int var5 = 200;
        float var6 = var5;
        System.out.println("Valor de la variable var3: "+ var5);
        System.out.println("Valor de la variable var4: "+ var6);

        System.out.println("");
        System.out.println("Conversiones de tipos de datos de manera explícita");
        System.out.println("1) Convirtiendo la variable var7 de tipo float a una variable var8 de tipo entero");
        float var7 = 9;
        int var8 = (int)var1;
        System.out.println("Valor de la variable var1: "+ var7);
        System.out.println("Valor de la variable var2: "+ var8);

        System.out.println("2) Convirtiendo la variable var9 de tipo double a una variable var10 de tipo long");
        double var9 = 11.03;
        long var10 = (long)var9;
        System.out.println("Valor de la variable var1: "+ var9);
        System.out.println("Valor de la variable var2: "+ var10);

        System.out.println("3) Convirtiendo la variable var9 de tipo entero a una variable var10 de tipo byte");
        int var11 = 123;
        byte var12 = (byte)var11;
        System.out.println("Valor de la variable var1: "+ var11);
        System.out.println("Valor de la variable var2: "+ var12);
    }
}