package Semana4.Dia7y8_Java.ArchivosJson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws IOException{
        Gson gson = new Gson();
        Path path = Path.of("C:/Users/micho/OneDrive/Escritorio/INFOTEC/Semana4/Dia7y8_Java/ArchivosJson/ArchivoJSON.json");
        String lectura = Files.readString(path);
        System.out.println(lectura); /*imprimiendo en consola el contenido del json */
        ArchivoJSON archiv = gson.fromJson(lectura, ArchivoJSON.class); /*retorno de un objeto de tipo archivo */
        System.out.println(archiv.getNombre());
    }
}
