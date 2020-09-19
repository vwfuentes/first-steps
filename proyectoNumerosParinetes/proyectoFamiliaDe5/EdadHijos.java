public class EdadHijos{
    private String nombreDeJuan = new String("Juan");
    private String nombreDeValeria = new String("Valeria") ; 
    private String nombreDeJesus = new String("Jesus");
    private int edadDeJuan = 9 ;
    private int edadDeValeria = 12 ;
    private int edadDeJesus = 3;
    public int edadHijos(String nombre){


        
        return getEdad(nombre);
    }
    
    private int getEdad(String nombre){
        if(nombre.equals(nombreDeJuan)){
            return edadDeJuan;
        }
        if(nombre.equals(nombreDeValeria)){
            return edadDeValeria;
        }
        if(nombre.equals(nombreDeJesus)){
            return edadDeJesus;
        }
        return -1;
    }    
    private String getNombreHijoMayor(){
        int edadDeHijoMayor = 0 ;
        String nombreDeHijoMayor = new String("");
        
        if(edadDeJuan > edadDeValeria){
            edadDeHijoMayor = edadDeJuan;
            nombreDeHijoMayor = nombreDeJuan;
        }else{
            edadDeHijoMayor = edadDeValeria;
            nombreDeHijoMayor = nombreDeValeria;
        }
        
        if(edadDeHijoMayor > edadDeJesus){
            edadDeHijoMayor = edadDeHijoMayor;
            nombreDeHijoMayor = nombreDeJuan;
        }else{
            edadDeHijoMayor = edadDeJesus;            
            nombreDeHijoMayor = nombreDeJesus;
        }
        
        return nombreDeHijoMayor; 
    }    
}
