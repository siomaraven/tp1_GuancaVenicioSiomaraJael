package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicitamos al usuario que ingrese un número entero dentro del rango [5, 10]
        int size;
        do {
            System.out.print("Ingrese una cantidad de valores de tipo entero entre entre 5 y 10: ");
            size = scanner.nextInt();
        } while (size < 5 || size > 10);

        // creamos el array de tipo String con el tamaño que ingresó el usuario
        String[] nombres = new String[size];

        // solicitamos al usuario que ingrese nombres de personas para el array
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
            nombres[i] = scanner.next();
        }

        // mostramos el valor de cada posición del primerao al último
        System.out.println("\nNombres ordenados de su primera posición hacia la última ingresada):");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        // mostramos el contenido comenzando de la última posición hasta la primera
        System.out.println("Nombres ordenados de su última posición a la primera:");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}