/*
Programa que toma un dia de la semana (lunes-viernes) y te dice cuantos minutos faltan para el fin de semana (viernes 15:00)
*/
//Se debe importar la clase scanner para la entrada de datos
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        //Solicita al usuario el dia
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana (Lunes - Viernes): ");
        String diaSemana = scanner.nextLine();

        System.out.print("Ingrese la hora formato 24 hrs (hh:mm)");
        String horaString = scanner.nextLine();
//Se divide en dos partes horaString mediante .split dividiendo la cadena en un arreglo
        String[] horaSplit = horaString.split(":");
//se convierten las subcadenas horaSplit[0]y horaSplit[1] mediante el metodo parseInt. Para almacenarse asi en hora y minutos
        int hora = Integer.parseInt(horaSplit[0]);
        int minutos = Integer.parseInt(horaSplit[1]);
//se utiliza el switch para determinar el dia de la semana
        int diaNumero;
        switch (diaSemana) {
            case "Lunes":
                diaNumero = 1;
                break;
            case "Martes":
                diaNumero = 2;
                break;
            case "Miércoles":
                diaNumero = 3;
                break;
            case "Jueves":
                diaNumero = 4;
                break;
            default: // Viernes
                diaNumero = 5;
                break;
        }
//aqui se calculan los minutos faltantes hasta el fin de semana almacenandose en "minutos faltantes"
        int minutosFaltantes = (5 - diaNumero) * 24 * 60 + (15 - hora) * 60 - minutos;
        System.out.println("Minutos faltantes para el fin de semana: " + minutosFaltantes);
    }
}
