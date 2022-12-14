
public class Arreglos {
    public static void main(String[] args) {
        
        String nombres []; //LOS CORCHETES INDICAN QUE ES UN ARRAY
        
        //cantidad de datos a almacenar
        nombres = new String[3]; //le estoy diciendo que vamos a almacenar 3 datos de tipo string
        
        //asignar valores a esos datos 
        nombres[0] = "Sebastian";
        nombres[1] = "Kendra";
        nombres[2] = "Pan";
        // en los [] va el indice correspondiente a ese dato
        //cambios en el ejemplo**
        
        //mostrar uno de esos datos
        System.out.println(nombres[0]);
        
        //modificar un dato
        nombres[0] = "Antonio";
        System.out.println(nombres[0]);
        
        //longitud de un array
        
        System.out.println(nombres.length); //LENGHT PARA SABER CUANTOS DATOS CONTIENE UN ARRAY
        
        //INSTANCIAR UN ARRAY CON DATOS YA DEFINIDOS
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(array1[1]);
        
        System.out.println(array1.length);
        
        //OTRA FORMA DE DEFINIR UN ARRAY
        
        int[] array2 = new int[5];
        //tipo de dato, nombre array, cantidad de datos
    }
    
}
