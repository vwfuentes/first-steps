public class Semaforo{
        private int location;
    private int colorRojo=1;
    private int colorAmarillo=2;
    private int colorVerde=0;
    public String cambiarDeColor(int numero){
        String res = new String("color rojo");
        
        int residuo=numero%3;
        if(residuo == colorRojo){
            res = new String("colorRojo");
        }else{
            if(residuo == colorAmarillo ){
                res = new String("colorAmarillo");
            }else{
                if(residuo == colorVerde ){
                    res = new String("colorVerde");
                }    
            }    
        }
        return res;
    }  
}