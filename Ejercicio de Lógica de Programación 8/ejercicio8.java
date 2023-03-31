import java.util.Scanner;

public class Ejercicio8 {
    
	// Función para saber si un numero es primo o no
    public static boolean numPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        //Se declaran 3 variabls array almacena los numeros ingresados por el usuario, 'primos' almacena los numeros primos en la primera parte del array
        int[] array = new int[10];
        int[] primos = new int[10];
        int index = 0; //index para el segumiento de los numeros del array 'primos'
        
        // con el bucle for se solicitan al usuario que ingrese 10 numeros y los almacene en 'array'
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            array[i] = scanner.nextInt();
        }
        
        ////se verifica si en los numeros introducidos, hay numeros primos. En caso de que si, se almacenan en 'primos' y se incrementa el index
        for (int i = 0; i < 10; i++) {
            if (numPrimo(array[i])) {
                primos[index++] = array[i];
            }
        }
        
        //los numeros NO primos se mueven al final del array 'primos'
        for (int i = 0; i < 10; i++) {
            if (!numPrimo(array[i])) {
                primos[index++] = array[i];
            }
        }
        
        // su muestra el array 'primos' ordenando los numeros primos en las primeras posiciones
        System.out.println("NUevo Array ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.println("pos[" + i + "] = " + primos[i]);
        }
    }//Cierre main
    
}//Cierre la clase