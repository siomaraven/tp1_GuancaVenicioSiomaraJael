package ar.edu.unju.fi.ejercicio7;

import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // solicitamos los datos para un nuevo empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el legajo del empleado:");
        int legajo = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el salario del empleado:");
        double salario = Double.parseDouble(scanner.nextLine());

        // creamos el objeto Empleado utilizando el constructor parametrizado
        Empleado empleado = new Empleado(nombre, legajo, salario);

        // mostramps los datos del empleado antes del aumento
        System.out.println("Datos del empleado antes del aumento:");
        empleado.mostrarDatos();

        // el aumento al salario del empleado
        empleado.darAumento();

        // datos del empleado después del aumento
        System.out.println("Datos del empleado después del aumento:");
        empleado.mostrarDatos();

        scanner.close();
    }
}