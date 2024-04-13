package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // solicita al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // verifica si el número ingresado es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
            int resultado = numero * 3;
            System.out.println("El triple del número es: " + resultado);
        } else {
            // si es impar mostrará el doble del número
            System.out.println("El número ingresado es impar.");
            int resultado = numero * 2;
            System.out.println("El doble del número es: " + resultado);
        }
        
        // se cierra el scanner para evitar fugas
        scanner.close();
    }
}