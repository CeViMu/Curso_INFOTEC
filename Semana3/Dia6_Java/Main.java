package Semana3.Dia6_Java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ejercicio1 info = new Ejercicio1();
        info.informacion("Cecilia", "Muñoz", 23, 52);
        info.metodo2(info.informacion("Cecilia", "Muñoz", 23, 52), 1.62, 1400.23);
        info.reemplazo();
        info.suma();
    }
}
