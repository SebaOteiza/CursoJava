import java.util.Scanner;

//VAMOS A CREAR UNA PEQUELA APLICACION QUE DETECTE SI EL NUMERO INGRESADO POR TECLADO ES PAR O INPAR
public class Espar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un Número:  ");
        int n = leer.nextInt();
        
      //PRIMERO VAMOS A DETECTAR SI EL NUMERO INGRESADO ES 0 O NO
      
      if(n != 0){ //SI EL NUMERO CAPTURADO ES DIFERENTE A 0 VA A PASAR AL IF DE ABAJO Y TOMARA OTRA CONDICION
          if(n > 0){ //si el numero ingresado es mayor que 0 entonces es un numero positivo, SI ES MAYPR TOMARÁ EL IF SIGUIENTE
              if(n % 2 == 0){//ACÁ DIRÁ SI EL NUMERO ES PAR O IMPAR
                  System.out.printf("El numero %d es PAR POSITIVO\n", n);
              }else{
                  System.out.printf("El numero %d es IMPAR POSITIVO\n", n);
                  
              }
          }else{
               if(n % 2 == 0){
                  System.out.printf("El numero %d es PAR NEGATIVO\n", n);
               }else{
                   System.out.printf("EL numero %d es IMPAR NEGATIVO\n", n);
               }
          }
               
          //SI EL NUMERO ES INGRESADO ES IGUAL A 0 NO EJECUTA NADA DE LO DE ARRIBA Y PASA AL ELSE DE ABAJO
      }else{
          System.out.printf("El numero %d es NEUTRO\n", n);
      }
    }
}
