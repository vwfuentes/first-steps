public class VerificacionDeNumeros{
    private int numero1 = 0;
    private int numero2 = 0;
    private int numero3 = 0;
    public String respuestaDeNumeroPosteado(int numero){
        int[] digitos = separarEnDigitos(numero);
        int numero1 = digitos[0];
        int numero2 = digitos[1];
        int numero3 = digitos[2];

        String enCrecimiento = new String("Son numeros en crecimiento");
        String respuestaMala = new String("No son numeros en crecimiento");

        String respuesta = respuestaMala;

        if(numero1 < numero2){
            if(numero2 < numero3){
                respuesta = enCrecimiento;
            }
        }
        return respuesta;
    }

    public static int[] separarEnDigitos(int numero) {//123
        System.out.println("Valor inicial: " + numero);
        int numDigitos = ("" + numero).length();//"victor".lenght() => 6 //"123".lenght() =>  3
        int[] digitos = new int[numDigitos];//[ ?, ?, ?, ?, ?, ?, ?]         
        int posicion = numDigitos - 1;//1234567
        while(numero > 0)  {
            int digito = numero % 10;
            digitos[posicion] = digito;

            posicion --;

            numero =  numero / 10;
            System.out.println("cociente: " + numero);
            System.out.println("residuo: " + digito);
            System.out.println("------------------");

        }
        // entero + otroEntero = sumar (operador de suma)
        // entero + "cadena" = concatenacion (operador de concatenacion)
        imprimirDigitos(digitos);

        return digitos;
     }

    private static void imprimirDigitos(int[] digitos) {
        String cadena = new String("");
        for(int posicion = 0; posicion < digitos.length; posicion++) {
            cadena = cadena + digitos[posicion] + ", ";             
        }
        System.out.println(cadena);
    }
} 

