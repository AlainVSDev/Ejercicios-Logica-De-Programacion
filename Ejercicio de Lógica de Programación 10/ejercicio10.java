/*
    REQUERIMIENTOS
-Hcer un programa que funcione como un diccionario Español-Igles y poner aprueba los conocimientos del usuario
    -debera incuil 20 palabras en español con su traduccion 

-Se debera crear un objeto HashMap que almacene la palabra en Español y en Ingles
-se debaran importar las clases necesarias para hacer el "HashMap" y guardar las palabras, "Scanner" para solicitar la traduccion al usuario y "Random" para que tome 5 palabras del diccionario 


 */
 //se importan  las clases que ocuparemos para el programa
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) { 
    	
    	//Se crea el objeto "HashMap" bajo el nombre de "diccionario", este almacenara un par de balabras en el cual la primera sera una cadena en español y la segunda cadena en ingles
    	
        HashMap<String, String> diccionario = new HashMap<String, String>();
        
        //Agregamos nuestras 20 palabras en Español con su Traduccion en Ingles mediante el metodo 'put' 
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
       
        
        Object[] palabras = diccionario.keySet().toArray(); //mediante el metodo 'keyset()' su contienen las claves de las palabras en español en el arreglo Object[]
        
        int numPreguntas = 5; //definimos el # de preguntas que se le solicitara al usuario responder
        
        int numRespuestasCorrectas = 0;//iniciamos el contador de preguntas correctas en 0 
        
        Scanner scanner = new Scanner(System.in); //creamos el objeto Scanner para leer los datos ingresados por el usuario
        
        Random random = new Random(); //Random para sellecionar aleatoriamente las palabras del diccionario
        
        //Se inicia el ciclo for para las 5 traducciones del usuario
        for (int i = 0; i < numPreguntas; i++) {
        
        	String palabra = (String) palabras[random.nextInt(palabras.length)];//se selecciona de ofrma aleatoria las palabras a traducir del diccionario y se guardan en la variable 'palabra'
            
        	System.out.print("Traduce la palabra '" + palabra + "' en ingles: ");//se le solicita al usuario que tradusca la palabra
            
        	String respuesta = scanner.nextLine();
            
        	if (respuesta.equals(diccionario.get(palabra))) { //Se comprueba mediante.equals que la palabra ingresada por el usuario es la respuesta correcta
               
        		System.out.println("Tu respuesta es correcta");
                
        		numRespuestasCorrectas++;
            } else {//En caso de que el usuario falle, se le mostrara cual era la respuesta correcta trayendo la palabra con 'get()' usando la palabra como clave
                
            	System.out.println("Tu respuesta es incorrecta. La respuesta correcta es '" + diccionario.get(palabra) + "'");
            }
        }
        
        //finalmente se le muestra al usuario el numero de respuestas correctas 
        System.out.println("Total de respuestas correctas: " + numRespuestasCorrectas);
        
    }//Cierre del main
}//cierre de la clase