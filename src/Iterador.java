//EJEMPLO CON ITERADORes, while, for,  FOR EACH

public class Iterador {
    public static void main(String[] args) {
        
        String [] nombres = {"Alex", "Sebastian", "Juan", "Maria", "Pedro"};
        //ARRAY DE TIPO STRING
        
        //AHORA VAMOS A ITERAR EL ARRAY
        
        //WHILE
        int c = 0;
            while(c < nombres.length){ //C SEA MENOR A 5 (NUMERO DE ELEMENTOS DEL ARRAY)
                System.out.println(nombres[c]);
                c++;
            }
            
            //FOR
            for(int i = 0; i < nombres.length; i++){
                System.out.println(nombres[i]);
            }
            
            //FOR EACH, ESTE ESTA IMPLEMENTADO PARA ITERAR ARRAYS
            for(String dato : nombres){ //EL FOR EACH ES MAS SENCILLO Y USA MENOS CODIGO, SOLO ESCRIBO EL TIPO DE DATOS Y EL NOMBRE DE LARRAY DEL QUE QUIERO OBTENERLOS 
                System.out.println(dato);
            }
        
    }
    
}
