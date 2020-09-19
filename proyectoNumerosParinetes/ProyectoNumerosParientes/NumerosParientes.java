public class NumerosParientes{
    private int numeroParientes = 0;
    private int numeroCero = 0;
    private int  residuo = 0;
    public String verificarNumero(int numero1,int numero2){
        String resultado = new String("estos numeros son parientes");
        String resultado2 = new String("estos numeros no son parientes");
        int cociente = numero1 % numero2;
        residuo = 1;

        if(cociente > numeroCero){
            resultado = new String ("estos numeros no son parientes");                            
        }else{            
            resultado = new String ("estos numeros son parientes");
        }
        return resultado;
    }     
}        
