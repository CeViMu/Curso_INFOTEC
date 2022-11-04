package Semana2.Dia5_Java.Herencia.Ejercicio_Herencia;

public abstract class Figura {
    private Integer coordenada_x;
    private Integer coordenada_y;
    private Integer ancho;
    private Integer alto;
    private float perimetro;
    private float area;
    //constructor
    public Figura(Integer ancho, Integer alto){
        super();
        this.ancho = ancho; 
        this.alto = alto;   
    } 
    
    public Integer getAncho(){
        return ancho;
    }
    
    public void setAncho(Integer ancho){
      this.ancho = ancho;
    }

    public Integer getAlto(){
        return alto;
    }

    public void setAlto(Integer alto){
        this.alto = alto;
    }

    public Integer areaTriangulo(Integer alto, Integer ancho){
        return alto*ancho;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Triángulo instTriángulo = new Triángulo(2, 2);
        System.out.println("El área del triángulo es: " + instTriángulo.areaTriangulo(2, 3));
        System.out.println("El área del retángulo es: " + instTriángulo.areaTriangulo(3,4));
        System.out.println("El área del círculo es: " + Circulo.areaCirculo(5));

    }

}
