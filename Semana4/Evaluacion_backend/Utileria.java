package Semana4.Evaluacion_backend;

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

    public 
}
