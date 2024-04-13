package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // declaración de las variables que usaremos
        String nombrePais;
        int edadPersona;
        double alturaEdificio;
        double precioProducto;
        String numeroTelefono;
        double coseno;

        // aquí solicitaremos el ingreso de los datos
        System.out.println("Ingrese el nombre de un país:");
        nombrePais = scanner.nextLine();

        System.out.println("Ingrese la edad de una persona:");
        edadPersona = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la altura de un edificio:");
        alturaEdificio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese el precio de un producto de supermercado:");
        precioProducto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese el número de teléfono:");
        numeroTelefono = scanner.nextLine();

        coseno = Math.cos(0.5);
        
        // exponemos por pantalla los datos ingresados
        System.out.println("Datos ingresados son: ");
        System.out.println("Nombre del país: " + nombrePais);
        System.out.println("Edad de la persona: " + edadPersona);
        System.out.println("Altura del edificio: " + alturaEdificio);
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Cálculo de coseno de 0.5: " + coseno);
        
        scanner.close();

	}

}
