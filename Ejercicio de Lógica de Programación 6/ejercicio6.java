 //se importa la clase scanner para poder ingresar datos en consola
/*
    -Clase Scanner
    -se ingresa texto
    -se debe invertir texto
    -StringBuilder crea un objeto que facilita la manipulacion del texto
*/
import java.util.Scanner;

public class ejercicio6 {
	
	
	public static String textoInv(String texto) {
		
	    StringBuilder sb = new StringBuilder(texto); 
	    
	    return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingresa una palabra o frase: ");
	    
	    String texto = scanner.nextLine();

	    String textoInvertido = textoInv(texto);

	    System.out.println("Texto invertido: " + textoInvertido);
	  }
	
	}//fin del main