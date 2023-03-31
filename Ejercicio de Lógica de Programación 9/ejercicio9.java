/*
-Crear un diccionario que contenga al menos 20 palabras con su traduccion en ingles
-almacenar estas palabras en un objeto HashMap
-importar las clases Scanner para solicitar al usuario ingresar la palabra y HashMap para almacenar las palabras
-si la palabra no esta en el diccionario arrojar mensaje
*/

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Se crea el objeto "HashMap" bajo el nombre de "diccionario", este almacenara un par de palabras en el cual la primera sera una cadena en español y la segunda cadena en ingles
        HashMap<String, String> diccionario = new HashMap<String, String>();
        // Agregamos nuestras 20 palabras en Español con su Traduccion en Ingles mediante el metodo 'put'
        diccionario.put("escuela", "school"); //1
        diccionario.put("bebé", "baby"); //2
        diccionario.put("bebida", "drink"); //3
        diccionario.put("comida", "food"); //4
        diccionario.put("diseño", "design"); //5
        diccionario.put("tecnología", "technology"); //6
        diccionario.put("película", "movie"); //7
        diccionario.put("café", "coffee"); //8
        diccionario.put("leer", "read"); //9
        diccionario.put("trabajo", "work"); //10
        diccionario.put("educación", "education"); //11
        diccionario.put("bailar", "dance"); //12
        diccionario.put("casa", "home"); //13
        diccionario.put("pasear", "walk"); //14
        diccionario.put("dinero", "money"); //15
        diccionario.put("correr", "run"); //16
        diccionario.put("estudiar", "study"); //17
        diccionario.put("nadar", "swim"); //18
        diccionario.put("viajar", "travel"); //19
        diccionario.put("cocinar", "cook"); //20
        
        // Se crea el objeto "Scanner" para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Se solicita al usuario ingresar una palabra en español
        System.out.print("Ingrese una palabra en español para ser traducida: ");
        String palabra = scanner.nextLine();
        // Se busca la palabra en el diccionario y se muestra su traduccion, en caso de que esta no este incluida en el diccionario, se menciona que no se encunetra en el diccionario
        if (diccionario.containsKey(palabra)) {
            System.out.println("La traducción de '" + palabra + "' es '" + diccionario.get(palabra) + "'");
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }       
    }//Cierre del main
}//cierre de la clase