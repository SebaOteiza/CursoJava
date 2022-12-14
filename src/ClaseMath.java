

public class ClaseMath {
    public static void main(String[] args) {
        System.out.println(Math.PI); //valor de pi
        System.out.println(Math.E);//valor de euler
        
        System.out.println(Math.pow(4, 2));//4 elevado a 2, esto es para resolver potencias
        
        //numeros random o aleatorios
        System.out.println(Math.random());//genera un numero aleatorio entre 0 y 1 que son humeros decimales
        
        //si lo quiero de numeros entre 0 y 100
        int numerosRandom = (int)(Math.random()*101);//para convertir el numero decimal en entero debo poner el (int) antes del Math.random
        System.out.println(numerosRandom);//me genera un numero aleatorio enetre 0 y 100 en decimales
        
        System.out.println(Math.sqrt(64)); //SQRT ES PARA SACAR LA RAIZ DE UN MUMERO
        //si quiero ese numero en entero, (int)(math.sqrt(64)));
        
        System.out.println(Math.max(7, 9)); //me muestra el numero mayor, el maximo
        System.out.println(Math.min(7, 9));//muestra el numero menor, el minimo
        
        System.out.println(Math.round(99.9));//LO QUE DEVUELVE ESTO ES UN REDONDEO, un numero decimal lo va a redondear a entero
        //este es bueno para trabajar por ejemplo con monedas 
        
        double moneda =(double)Math.round(3.4289 * 100d)/100;
        System.out.println(moneda);//me va a redondear al segundo decimal 
        //es un numero decimal con dos decimales 
        //multiplicar por 100d esto significa que los ceros son los decimales que queremos conservar
        //si escribo 1000d/1000 me va a conservar 3 decimales
        
        
    }

}
