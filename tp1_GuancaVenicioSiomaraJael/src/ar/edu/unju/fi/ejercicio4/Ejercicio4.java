package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // se solicita al usuario que ingrese un número que esté dentro del rango [0,10]
        int numero;
        do {
            System.out.print("Ingrese un número entre 0 y 10: ");
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 10);

        // calcula el factorial del número utilizando un bucle while
        int factorial = 1;
        int contador = 1;
        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }

        // muestra el resultado por consola
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        // cerramos el scanner para evitar fugas
        scanner.close();
    }
}