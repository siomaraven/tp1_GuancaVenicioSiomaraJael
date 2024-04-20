package ar.edu.unju.fi.ejercicio18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();
        
        //paises precargados
        paises.add(new Pais(1, "Argentina"));
        paises.add(new Pais(2, "Canada"));
        paises.add(new Pais(3, "Italia"));
        
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos de un país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // salto de linea
            
            try {
                switch (opcion) {
                    case 1:
                        altaDestinoTuristico(destinos, paises, scanner);
                        break;
                    case 2:
                        mostrarTodosLosDestinos(destinos);
                        break;
                    case 3:
                        modificarPaisDestinoTuristico(destinos, paises, scanner);
                        break;
                    case 4:
                        destinos.clear();
                        System.out.println("ArrayList de destinos turísticos limpiado correctamente.");
                        break;
                    case 5:
                        eliminarDestinoTuristico(destinos, scanner);
                        break;
                    case 6:
                        mostrarDestinosOrdenadosPorNombre(destinos);
                        break;
                    case 7:
                        mostrarTodosLosPaises(paises);
                        break;
                    case 8:
                        mostrarDestinosPorPais(destinos, scanner);
                        break;
                    case 9:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 9);

        scanner.close();
    }

	private static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
        System.out.println("\nAlta de destino turístico:");
        System.out.print("Ingrese el código del destino turístico: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del destino turístico: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del destino turístico: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el código del país del destino turístico: ");
        int codigoPais = scanner.nextInt();
        Pais paisAsociado = buscarPaisPorCodigo(paises, codigoPais);
        if (paisAsociado == null) {
            System.out.println("El país asociado al destino turístico no existe.");
            return;
        }
        scanner.nextLine();
        System.out.print("Ingrese la cantidad de días del destino turístico: ");
        int cantidadDias = scanner.nextInt();
        scanner.nextLine();

        DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, paisAsociado, cantidadDias);
        destinos.add(destino);
        System.out.println("Destino turístico agregado correctamente.");
    }

    private static void mostrarTodosLosDestinos(ArrayList<DestinoTuristico> destinos) {
        System.out.println("\nMostrar todos los destinos turísticos:");
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
        } else {
            for (DestinoTuristico destino : destinos) {
                System.out.println(destino.getCodigo() + " - " + destino.getNombre() +
                        " (" + destino.getPais().getNombre() + "), Precio: " +
                        destino.getPrecio() + ", Cantidad de días: " + destino.getCantidadDias());
            }
        }
    }

    private static void modificarPaisDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
        System.out.println("\nModificar el país de un destino turístico:");
        System.out.print("Ingrese el código del destino turístico: ");
        int codigoDestino = scanner.nextInt();
        scanner.nextLine();

        DestinoTuristico destino = buscarDestinoPorCodigo(destinos, codigoDestino);
        if (destino == null) {
            System.out.println("El destino turístico no existe.");
            return;
        }

        System.out.println("Países disponibles:");
        mostrarTodosLosPaises(paises);
        System.out.print("Ingrese el nuevo código del país: ");
        int nuevoCodigoPais = scanner.nextInt();
        Pais nuevoPais = buscarPaisPorCodigo(paises, nuevoCodigoPais);
        if (nuevoPais == null) {
            System.out.println("El país seleccionado no existe.");
            return;
        }

        destino.setPais(nuevoPais);
        System.out.println("País modificado correctamente para el destino turístico.");
    }

    private static void eliminarDestinoTuristico(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
        System.out.println("\nEliminar un destino turístico:");
        System.out.print("Ingrese el código del destino turístico: ");
        int codigoDestino = scanner.nextInt();
        scanner.nextLine();

        Iterator<DestinoTuristico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo() == codigoDestino) {
                iterator.remove();
                System.out.println("Destino turístico eliminado correctamente.");
                return;
            }
        }
        System.out.println("El destino turístico no existe.");
    }

    private static void mostrarDestinosOrdenadosPorNombre(ArrayList<DestinoTuristico> destinos) {
        System.out.println("\nMostrar los destinos turísticos ordenados por nombre:");
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
        } else {
            Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));
            for (DestinoTuristico destino : destinos) {
                System.out.println(destino.getNombre() + " (" + destino.getPais().getNombre() + ")");
            }
        }
    }

    private static void mostrarTodosLosPaises(ArrayList<Pais> paises) {
        System.out.println("\nMostrar todos los países:");
        if (paises.isEmpty()) {
            System.out.println("No hay países para mostrar.");
        } else {
            for (Pais pais : paises) {
                System.out.println(pais.getCodigo() + " - " + pais.getNombre());
            }
        }
    }

    private static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
        System.out.println("\nMostrar los destinos turísticos de un país:");
        System.out.print("Ingrese el código del país: ");
        int codigoPais = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo() == codigoPais) {
                System.out.println(destino.getNombre());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay destinos turísticos para el país con código " + codigoPais);
        }
    }

    private static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, int codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo() == codigo) {
                return pais;
            }
        }
        return null;
    }

    private static DestinoTuristico buscarDestinoPorCodigo(ArrayList<DestinoTuristico> destinos, int codigo) {
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo() == codigo) {
                return destino;
            }
        }
        return null;
    }
}