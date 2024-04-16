package ar.edu.unju.fi.ejercicio9;

import ar.edu.unju.fi.ejercicio9.model.Producto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // creamos los tres objetos Producto
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del Producto " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());
            System.out.print("Descuento (%): ");
            int descuento = Integer.parseInt(scanner.nextLine());

            // objeto Producto
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            producto.setPrecio(precio);
            producto.setDescuento(descuento);

            // mostramo los datos del Producto y el resultado del cálculo del descuento
            System.out.println("Datos del Producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: " + producto.calcularDescuento());
            System.out.println();
        }

        scanner.close();
    }
}