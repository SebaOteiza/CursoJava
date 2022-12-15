
import java.util.Scanner;


public class Palindro {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String cadena = leer.nextLine();
        
        
        if(esPalindromo(cadena)){
                 System.out.println("======================");
            System.out.println("Es Palindromo");
                 System.out.println("======================");
        }else{
                 System.out.println("======================");
            System.out.println("No es Palindromo");
                 System.out.println("======================");
        }
        
    }
    //funcion
    static boolean esPalindromo(String cadena){
        
        cadena = cadena.replace("", ""); //le quitamos los espacios a las palabras
        cadena = cadena.toLowerCase(); //en minuscula
        
        StringBuilder cadenaInvertida = new StringBuilder(); //crea un espacio vacio
        
        for(int i = cadena.length()-1; i >=0; i--){
            cadenaInvertida.append(cadena.charAt(i));//llena el espacio vacio que generó stringBuilder
            
            
        }
            return  cadena.equals(cadenaInvertida.toString());
    }
    
}

    


