package Semana4.Dia7y8_Java.ArchivosJson;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class Main {

    public static void main(String[] args) throws IOException{
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("C:/Users/micho/OneDrive/Escritorio/INFOTEC/Semana4/Dia7y8_Java/ArchivosJson/ArchivoJSON.json");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        JSONArray arra = (JSONArray) pJsonObj.get()
    }
}
