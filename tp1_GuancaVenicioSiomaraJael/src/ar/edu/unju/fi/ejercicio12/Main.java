package ar.edu.unju.fi.ejercicio12;

import ar.edu.unju.fi.ejercicio12.model.*;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicitamos al usuario el ingreso de los datos de la persona
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (formato: dd/mm/aaaa):");
        String fechaNacimientoStr = scanner.nextLine();

        // a fecha de nacimienot lo hacemos un objeto Calendar
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Restar 1 al mes porque en Calendar los meses van de 0 a 11
        int anio = Integer.parseInt(partesFecha[2]);

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio, mes, dia);

        // instancia de persona con los datos ingresados
        Persona persona = new Persona(nombre, fechaNacimiento);

        // mostramos los datos y resultados
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + fechaNacimientoStr);
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
        System.out.println("Estación del año: " + persona.determinarEstacion());

        scanner.close();
    }
}
