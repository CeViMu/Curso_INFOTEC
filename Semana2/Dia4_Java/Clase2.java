import javax.smartcardio.Card;

public class Clase2 {
    static String disquera;
    static String album;
    static String genero;

    public String concatenacion(){
        System.out.println(Clase2.disquera + "-" + Clase2.album); 
    } 

    Cancion obje1 = new Cancion("Cliches", "Jess and Joy", "Jess and Joy", 3.18, 2021);

    /**
     * @return
     */
    public Object objeto1(obje1){
        obje1.getName(null);
        obje1.getAutor(null);
        obje1.getInterprete(null);
        obje1.getDuración(null);
        obje1.getAño(null);
    }
}
