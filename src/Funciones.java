
public class Funciones {
    public static void main(String[] args) {
        
        //INVOCANDO LA FUNCION EN EL METODO MAIN
        
        //LOS DATOS INGRESADOS EN LOS PARENTESIS A LA HORA DE INVOCAR UNA FUNCION SE LLAMAN ARGUMENTOS
       // saludar("Sebastian", 34);
        //sumar(10, 40); //A ESTOS SE LE LLAMAN ARGUMENTOS
        
        System.out.println(sumaEnteros(45, 50));
        System.out.println(sumaDecimales(4.5, 4.5));
        
        cuentaRegresiva(15);
        System.out.println(factorial(5));
        System.out.println(sumar(4,8,9,6));//ARGUMENTOS INDEFINIDOS 
        }
     
    //DEFINIENDO FUNCIONES
    
    //PARAMETROS Y ARGUMENTOS
    //PARAMETROS SE LLAMAN LOS DATOS EN LOS PARENTESIS DE LA FUNCION
    
    
    //EJEMPLO DE VARAARGS VARIABLE ARGUMENTOS
    
      static int sumar(int... numeros){//cuando son indefinidos los que vamos a recibir
          int suma = 0;
          for(int num : numeros){
              suma += num;
          }
       return suma;
        
    }
    
    static int sumaEnteros(int a, int b){
        return a + b;
    }
    
    static int factorial(int numero){
        if(numero >1){
            numero = numero * factorial(numero - 1);
        }
        return  numero;
    }
    
    //funcion recursiva
    static void cuentaRegresiva(int numero){
        numero --; //operador decremento para realizar en este ejemplo una cuenta regresiva
    if(numero > 0){
        System.out.println(numero);
        cuentaRegresiva(numero); //ESTA MISMA FUNCION SE EJECUTARÁ ASÍ MISMA
    }else{
        System.out.println("Llego hasta 0");
    }
    }
    
    
  
        
        static double sumaDecimales(double a, double b){
            return a + b;

    }
}
     
    /*
    static void saludar(String nombre, int edad){
        System.out.printf("Hola %s tu edad es %d \n", nombre, edad);
    }
    */


 
       /* //LLAMAR FUNCION
        saludar("Sebastian");
        
        //LLAMAR METODO
        
        Main s = new Main();
    }
        //definicion de una funcion
    
   static void saludar (String nombre){
       System.out.println("Hola"+ nombre+" Desde la funcion");
   }
           
   //definicion de un metodo
   
   public void myMetodo(String saludo){
       System.out.println(saludo);
   }
*/
