package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creamos un array de 8 elementos para almacenar los números enteros
        int[] numeros = new int[8];

        // pedimos al usuario que ingrese valores para el array
        System.out.println("Ingrese 8 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // mostramos por consola el índice y el valor almacenado en esa posición
        System.out.println("\nValores almacenados en el array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}