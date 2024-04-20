package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicitamos al usuario que ingrese un número entero de rango entre 3, 10
        int size;
        do {
            System.out.print("Ingrese cantidad de numéros de tipo entero que se encuentre entre 3 y 10: ");
            size = scanner.nextInt();
        } while (size < 3 || size > 10);

        // creamos el array de tipo entero con el tamaño ingresado por el usuario
        int[] numeros = new int[size];

        // solicitamos al usuario que ingrese valores para el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // mostramos el valor de cada posición del array
        System.out.println("\nValores almacenados en el array:");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
            suma += numeros[i];
        }

        // mostramos la suma de todos los valores del array
        System.out.println("La suma de todos los valores es: " + suma);

        scanner.close();
    }
}
