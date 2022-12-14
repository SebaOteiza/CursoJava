import java.util.Scanner;

public class PrecioVenta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //LE PIDO AL USUARIO QUE INGRESE EL VALOR DE VENTA DESDE TECLADO
        System.out.print("Ingrese valor de Venta: ");
        double vv = leer.nextDouble(); //vv valor venta
        
        //TENIENDO EL VALOR DE VENTA, SACAMOS EL IGV
        //IGV 18%
        double igv = vv * 0.18; //VALOR DE VENTA VV * 0.18
        double pv = vv + igv;
        
        System.out.println("Valor de Venta: "+vv);
        System.out.println("IGV: "+igv);
        System.out.println("Precio de Venta:  "+pv);
        
    }
    
}
