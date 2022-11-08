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

    public void setName(String name){
        this.name = name;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getInterprete(){
        return interprete;
    }

    public void setInterprete(String interprete){
        this.interprete = interprete;
    }

    public double getDuración(){
        return duracion;
    }

    public void setDuración(double duracion){
        this.duracion = duracion;
    }

    public int getAño(){
        return año;
    }

    public void setAño(int año){
        this.año = año;
    }
}