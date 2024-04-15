package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // solicita al usuario que ingrese por consola un número entre 1 y 9
        System.out.println("Por favor, ingresa un número entero entre 1 y 9:");
        int numero = scanner.nextInt();
        
        // acá validamos que el número esté dentro del rango
        if (numero < 1 || numero > 9) {
            System.out.println("El número ingresado no está dentro del rango válido.");
            
        }
        
        // mostraMOS la tabla de multiplicar del número ingresado
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }
}