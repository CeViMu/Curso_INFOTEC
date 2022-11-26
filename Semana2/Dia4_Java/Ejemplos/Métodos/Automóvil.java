public class Automóvil {
    String nombre;
    String marca;
    Double km;
    String color;
    static Integer modelo;

    public static void main(String[] args) {
        Automóvil.modelo= 2021;

        Automóvil auto1 = new Automóvil();
        auto1.nombre = "Supre";
        auto1.marca = "Nyse";
        auto1.km = 100d;
        auto1.color = "blanco";
        auto1.modelo = 2020;

        Automóvil auto2 = new Automóvil();
        auto2.nombre = "Vento";
        auto2.marca = "Nyx";
        auto2.km = 120d;
        auto2.color = "negro";
    }
}
