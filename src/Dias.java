import java.util.Scanner;

//APLICACION UTILIZANDO SWITCH

public class Dias {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.print("Ingrese un numero de la semana: \t");
        int dia = leer.nextInt();
        
        String nombreDia = null;
        
        switch (dia) {
            case 1:
                nombreDia ="Domingo";
                break;
            case 2: 
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miercoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sabado";
                break;
                
                //EL VALOR DE LOS CASOS NO PUEDEN SER IGUALES 
                default:
                    System.out.println("El numero ingresado es incorrecto");
        }
        
        System.out.println("El día es: "+ nombreDia);
    }
    
}
