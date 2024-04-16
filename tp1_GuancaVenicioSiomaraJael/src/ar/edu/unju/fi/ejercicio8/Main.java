package ar.edu.unju.fi.ejercicio8;

import ar.edu.unju.fi.ejercicio8.model.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicitamos al usuario que ingrese el valor de 'n'
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        // creamos el objeto de la clase CalculadoraEspecial
        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setN(n);

        // realizamos los calculos
        long sumatoria = calculadora.calcularSumatoria();
        long productoria = calculadora.calcularProductoria();

        // y mostramos los resultados por consola
        System.out.println("La sumatoria es: " + sumatoria);
        System.out.println("La productoria es: " + productoria);

        scanner.close();
    }
}