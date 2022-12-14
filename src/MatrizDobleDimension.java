//EJEMPLO DE ARRAY DOBLE DIMENSION

public class MatrizDobleDimension {
    public static void main(String[] args) {
        
        int[][] x = new int [2][3];
        //Array llamado x que es bidimenensional y que tiene [2] filas y [3] columnas
        
        //para almacenar los datos
        
        //primera fila DEFINIR
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        
        //segunda fila ASIGNAR
         x[1][0] = 4;
         x[1][1] = 5;
         x[1][2] = 6;
         
         //ITERAR LOS DATOS, primero se debe iterar el array y luego los datos 
         
         for(int[] matrizInterna: x){
             for(int dato: matrizInterna){
                 System.out.println(dato);
             }
         }
    }
    
}
