import java.util.Scanner;

//programa para evaluar si la letra ingresada es vocal
public class Esvocal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        char c = leer.next().charAt(0);
        
        if(c == 'a' || c =='A'){ //SI ESTA CONDICION NO SE CUMPLE PASA A LA SIGUIENTE
            //POR EJEMPLO: INGRESO R, ESTA TOMARIA EL VALOR DE C(SCANNER) COMENZARÁ A EVALUAR CADA CONDICION
            //COMO R NO ES UNA VOCAL, LUEGO DE REVISAR TODAS LAS CONDICIONES, ARROJARÁ EL ULTIMO ELSE QUE DICTA QUE NO ES VOCAL
            System.out.printf("%s ES VOCAL\n", c);
        }else if(c == 'e' || c =='E'){
            System.out.printf("%s es vocal\n", c);
        }else if(c == 'i' || c =='I'){
            System.out.printf("%s es vocal\n", c);
        }else if(c == 'o' || c =='O'){
            System.out.printf("%s es vocal\n", c);
        }else if(c == 'u' || c =='U'){
            System.out.printf("%s es vocal\n", c);
        }else{
            System.out.printf("%s NO ES VOCAL\n", c); // SI NINGUNA DE LAS CONDICIONES SE CUMPLEN, PONEMOS EL ELSE 
        }
        
    }
}

