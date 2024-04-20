package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creamos el array para almacenar 5 elementos
        String[] nombres = new String[5];

        // dentro del for al usuario le pedimos que ingrese los 5 nombres
        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // mostramos los valores/nombres guardados en el array
        System.out.println("\nLos nombres guardados son:");
        int index = 0;
        while (index < nombres.length) {
            System.out.println("Nombre " + (index + 1) + ": " + nombres[index]);
            index++;
        }

        // mostramos el tamaño que le asignamos al array
        System.out.println("\nTamaño del array: " + nombres.length);

        // solicitamos al usuario que ingrese el valor que desea eliminar
        byte indiceEliminar;
        do {
            System.out.print("\nIndique la posición del nombre a eliminar: ");
            indiceEliminar = scanner.nextByte();
        } while (indiceEliminar < 1 || indiceEliminar > 5);

        // eliminación del elemento del arreglo
        int indice = indiceEliminar - 1;
        if (indice >= 0 && indice < nombres.length) {
            for (int i = indice; i < nombres.length - 1; i++) {
                nombres[i] = nombres[i + 1];
            }
            nombres[nombres.length - 1] = ""; // espacio en blanco 
        }

        // mostramos el arreglo luego de realizar la eliminación
        System.out.println("\nNuevo orden " + indice + ":");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        scanner.close();
    }
}