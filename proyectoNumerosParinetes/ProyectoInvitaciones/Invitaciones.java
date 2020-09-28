public class Invitaciones{
    private String enero = ("Enero");
    private String febrero = ("Febrero");
    private String marzo = ("Marzo");
    private String abril = ("Abril");
    private String mayo = ("Mayo");    
    private String junio = ("Junio");
    private String julio = ("Julio");
    private String agosto = ("Agosto");
    private String septiembre = ("Septiembre");
    private String octubre = ("Octubre");
    private String noviembre = ("Novimebre");
    private String diciembre = ("Dicimebre");
    private String mesNoExiste = ("no existe ese mes");
    private String fecha = ("dia/mes/anio");
    private int maxDias = 31; 
    private int numeroDeEnero = 1;
    private int numeroDeFebrero = 2;
    private int numeroDeMarzo = 3;
    private int numeroDeAbril = 4;
    private int numeroDeMayo = 5;
    private int numeroDeJunio = 6;
    private int numeroDeJulio = 7;
    private int numeroDeAgosto = 8;
    private int numeroDeSeptiembre = 9;
    private int numeroDeOctubre = 10;
    private int numeroDeNoviembre = 11;
    private int numeroDeDiciembre = 12;
    public String fechaDeManeraLiteral(int day,int month,int year){
           if(day > maxDias){
            return  new String ("dia inexsistente");
        }
        if(month == numeroDeEnero){
             return day + " de " + enero + " de " + year;
        }
        if(month == numeroDeFebrero){
             return day + " de " + febrero + " de " + year;
        } 
        if(month == numeroDeMarzo){
             return day + " de " + marzo + " de " + year;
        } 
        if(month == numeroDeAbril){
             return day + " de " + abril + " de" + year;
        } 
        if(month == numeroDeMayo){
             return day + " de " + mayo + " de " + year;
        } 
        if(month == numeroDeJunio){
             return day + " de " + junio + " de " + year;
        } 
        if(month == numeroDeJulio){
             return day + " de " + julio + " de" + year;
        } 
        if(month == numeroDeAgosto){
             return day + " de " + agosto + " de" + year;
        } 
        if(month == numeroDeSeptiembre){
             return day + " de " + septiembre + " de " + year;
        } 
        if(month == numeroDeOctubre){
             return day + " de " + octubre + " de" + year;
        } 
        if(month == numeroDeNoviembre){
             return day + " de " + noviembre + " de " + year;
        } 
        if(month == numeroDeDiciembre){
             return day + " de " + diciembre + " de " + year;
        } 
        return mesNoExiste;
    }
}