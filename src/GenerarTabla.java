//UTILIZANDO MIENTRAS - WHILE 
import java.util.Scanner; //importar scanner porque ingresamos informacion desde teclado

public class GenerarTabla {
    public static void main(String[] args) { //metodo main
        
        Scanner leer = new Scanner(System.in); // objeto scanner (leer)
        System.out.println("Ingrese un numero entero: "); // pedimos que ingrese un numero entero
        int n = leer.nextInt();
        
        //utilizando ciclo WHILE
        
        int c =0; //C va a iniciar con un valor 0
        while(c <= 10){ //si c es menor o igual a 10
            System.out.printf("|%d x %d = %d\n",n, c,(n*c)); //ACA SE CREA LA CALCULADORA
            c++;
        }
    }
    
}
