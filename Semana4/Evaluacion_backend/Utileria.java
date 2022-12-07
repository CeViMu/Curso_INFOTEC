package Semana4.Evaluacion_backend;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utileria {
    public float mayorPrecio(float[] productos){
        float mayor = productos[0];
        for (int i=1; i<productos.length; i++) {
            if(productos[i] > mayor){
                mayor = productos[i];
            }
        }
        return mayor;
    }

    public float mayorCantidad(float[] productos){
        float mayorC = productos[0];
        for (int i=1; i<productos.length; i++) {
            if(productos[i] > mayorC){
                mayorC = productos[i];
            }
        }
        return mayorC;
    }

    public float totalDeCostos(float[] productos){
        float total = 0;
        return total;
    }

    public void hora(){
        DateFormat date= new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("Hora actual: " + dateFormat(date));
    }
    

}
