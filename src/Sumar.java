import java.util.Scanner;
public class Sumar {
    //EJMEPLO DE SUMA DE DOS NUMEROS ENTEROS
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primero número: ");
        var n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        var n2 = leer.nextInt();
        
        var r = n1+n2;
        
        System.out.printf("La Suma %d + %d = %d\n", n1, n2, r);
        //n1 se posiciona en el primer %d, n2 en el siguiente %d y el resultado r en el ultimo %d
        
    }
    
}
