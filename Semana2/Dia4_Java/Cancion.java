public class Cancion {
    private String name;
    private String autor;
    private String interprete;
    private double duracion;
    private int año;

    public Cancion(String name, String autor, String interprete, double d, int año){
        this.name = name;
        this.autor = autor;
        this.interprete = interprete;
        this.duracion = d;
        this.año = año;
    }

    public String getName(){
        return name;
    }

    public String getAutor(){
        return autor;
    }

    public String getInterprete(){
        return interprete;
    }

    public double getDuración(){
        return duracion;
    }

    public int getAño(){
        return año;
    }
}

class datosAdicionales{
    static String disquera;
    static String album;
    static String género;

    public static String Informacion(String album, String disquera){
        return album + "-" + disquera;
    }
    
    public static void main(String[] args) {
        Cancion can1 = new Cancion("Clichés", "Jessy & Joy", "Jessy & Joy", 3.18, 2020);
        
    }

}