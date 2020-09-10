public class Dispositivo{
    public Cancion cancion1;
    public Cancion cancion2;
    public Cancion cancion3;
    
    public Dispositivo(Cancion cancion1, Cancion cancion2, Cancion cancion3){  
        this.cancion1=cancion1;
        this.cancion2=cancion2;
        this.cancion3=cancion3;
    }
    
    public boolean reproducirCancion(Cancion cancion){
        String nombreCancion = cancion.darNombre();
        System.out.println("reproduciendo la cancion: " + nombreCancion);
        return true;
    }
    public boolean detenerCancion(Cancion cancion){
        String nombreCancion = cancion.darNombre();
        System.out.println("se detuvo la cancion: " + nombreCancion);
        return true;
    }
    public boolean cambiarCancion(Cancion cancion){
        String nombreCancion = cancion.darNombre();
        System.out.println("reproduciendo la nueva cancion: " + nombreCancion);
        return true;
    }
    public String[] mostrarCanciones(){
        
        System.out.println("nombre de la cancion: " + cancion1.darNombre());
        System.out.println("nombre de la cancion: " + cancion2.darNombre());
        System.out.println("nombre de la cancion: " + cancion3.darNombre());
        
        String[] response = new String[3];
        response[0] = cancion1.darNombre();
        response[1] = cancion2.darNombre();
        response[2] = cancion3.darNombre();
        
        return response;
    }
  
}    