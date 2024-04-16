package ar.edu.unju.fi.ejercicio6;

import ar.edu.unju.fi.ejercicio6.model.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creación de objeto utilizando el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Datos de la Persona 1:");
        persona1.mostrarDatos();
        System.out.println();

        // creación de objeto utilizando el constructor parametrizado
        System.out.println("Ingrese los datos de la Persona 2:");
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Provincia: ");
        String provincia = scanner.nextLine();

        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        System.out.println("Datos de la Persona 2:");
        persona2.mostrarDatos();
        System.out.println();

        // creación de objeto utilizando el constructor que inicializa dni, nombre y fecha de nacimiento
        System.out.println("Ingrese los datos de la Persona 3:");
        System.out.print("DNI: ");
        dni = scanner.nextLine();
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        fechaNacimiento = LocalDate.parse(scanner.nextLine());

        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        System.out.println("Datos de la Persona 3:");
        persona3.mostrarDatos();

        scanner.close();
    }
}
