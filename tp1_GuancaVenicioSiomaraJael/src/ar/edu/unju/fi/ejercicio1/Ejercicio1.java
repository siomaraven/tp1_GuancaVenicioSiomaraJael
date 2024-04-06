package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // declaración de variables que se usarán para realizar la suma y otra para contar los números ingresados
		int sum = 0;
        int count = 0;

        System.out.println("Ingrese 5 valores para obtener el promedio final: ");

        // bucle while para asegurar que se ingresen los 5 números solicitados
        while (count < 5) {
            System.out.print("Número " + (count + 1) + ": ");
            if (teclado.hasNextInt()) { //hasNextInt verifica con true o false si el valor ingresado es un entero válido
                int num = teclado.nextInt();
                sum += num; // += suma y asignación
                count++;
            } else {
                System.out.println("Error, número entero no válido.");
                teclado.next(); // limpia el buffer del scanner para mejor fluides del programa
            }
        }

        // cálculo del promedio
        double promedio = (double) sum / 5; //conversión de sum de tipo entero a sum de tipo double

        // muestra el resultado por la consola
        System.out.println("El promedio final de los números ingresados es: " + promedio);

        // fin y cierre del escáner
        teclado.close();
	}

}
