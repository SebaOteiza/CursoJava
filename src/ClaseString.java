
public class ClaseString {
    public static void main(String[] args) {
        
        String nombre = "Sebastian";
        System.out.println(nombre.charAt(4)); //lo que hace el metodo CHARAT() es poder acceder a cada indice que queramos de la cadena de String

           //LENGTH
           
           System.out.println(nombre.length());//devuelve la  cantidad de caracteres 
        
           //iterar la caneda de caracteres
           for(int i =0; i < nombre.length(); i++){
               System.out.println(nombre.charAt(i));
           }
           
           System.out.println(nombre.substring(0, 4));
           //ME VA A MOSTRAR LOS CARACTERES QUE YO DEFINÍ EN LOS ()
                 
           //CONVERTIR LA CADENA DE CARACTERES A SOLO MINUSCULAS
           System.out.println(nombre.toLowerCase());
           
           //CONVERTIR LA CADENA DE CARACTERES A SOLO MAYUSCULAS
           System.out.println(nombre.toUpperCase());     

           //se supone que las cadenas de caracteres son inmutables pero con el metodo REPLACE podemos modificar uno de sus caracteres
           
           nombre = "S e b a s t i a n";
           System.out.println(nombre.replace(" ", "-")); 
           //AQUI QUIERO REEMPLAZAR LOS ESPACIOS ENTRE CARACTERES POR GUIONES
           
           //EQUALS compara dos valores de cadena de caracteres y ver si son iguales o n, esto retorna un valor Booleano true o false
           System.out.println("Hola" == "Hola"); //en este caso devuelve true
           System.out.println("hola".equals("Hola"));//ESTA ES LA FORMA QUE SE RECOMIENDA PARA COMPARAR STRING
           
           //CONSTRUCTOR DE STRINGBUILDER
           
           StringBuilder nuevo = new StringBuilder();//CREA UN OBJETO VACIO AL QUE LE PUEDO AGREGAR UN OBJETO
           //le podemos aplicar un metodo
           
           System.out.println(nuevo);
           
           nuevo.append("Hola mundo maldito ");//ALMACENA CADENA DE CARACTERES 
           nuevo.append("Hace calor");
           System.out.println(nuevo);
           
           //TO STRING
           
           System.out.println(nuevo.toString());
           //MUESTRA LA INFO COMPLETA DEL OBJETO
           
           
           
           
           
           
    }

}
