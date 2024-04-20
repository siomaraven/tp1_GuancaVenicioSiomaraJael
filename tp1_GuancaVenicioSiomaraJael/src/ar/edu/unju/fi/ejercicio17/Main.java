package ar.edu.unju.fi.ejercicio17;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // saltos de línea

            try {
                switch (opcion) {
                    case 1:
                        altaJugador(jugadores, scanner);
                        break;
                    case 2:
                        mostrarDatosJugador(jugadores, scanner);
                        break;
                    case 3:
                        mostrarJugadoresOrdenadosPorApellido(jugadores);
                        break;
                    case 4:
                        modificarDatosJugador(jugadores, scanner);
                        break;
                    case 5:
                        eliminarJugador(jugadores, scanner);
                        break;
                    case 6:
                        mostrarCantidadTotalJugadores(jugadores);
                        break;
                    case 7:
                        mostrarCantidadJugadoresNacionalidad(jugadores, scanner);
                        break;
                    case 8:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 8);

        scanner.close();
    }

    private static void altaJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("\nAlta de jugador:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Fecha de nacimiento (formato: dd/mm/aaaa): ");
        String fechaNacimientoStr = scanner.nextLine();
        System.out.print("Nacionalidad: ");
        String nacionalidad = scanner.nextLine();
        System.out.print("Estatura: ");
        double estatura = scanner.nextDouble();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Posición (delantero, medio, defensa, arquero): ");
        String posicion = scanner.nextLine();

        // convertimos la fecha de nacimiento a un objeto Calendar
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1;
        int anio = Integer.parseInt(partesFecha[2]);
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio, mes, dia);

        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
        jugadores.add(jugador);
        System.out.println("Jugador agregado correctamente.");
    }

    private static void mostrarDatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("\nMostrar los datos del jugador:");
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.nextLine();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                System.out.println("Nombre: " + jugador.getNombre());
                System.out.println("Apellido: " + jugador.getApellido());
                System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento().getTime());
                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                System.out.println("Estatura: " + jugador.getEstatura());
                System.out.println("Peso: " + jugador.getPeso());
                System.out.println("Posición: " + jugador.getPosicion());
                System.out.println("Edad: " + jugador.calcularEdad());
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    private static void mostrarJugadoresOrdenadosPorApellido(ArrayList<Jugador> jugadores) {
        System.out.println("\nMostrar todos los jugadores ordenados por apellido:");
        ArrayList<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        Collections.sort(jugadoresOrdenados, Comparator.comparing(Jugador::getApellido));
        for (Jugador jugador : jugadoresOrdenados) {
            System.out.println(jugador.getApellido() + ", " + jugador.getNombre());
        }
    }

    private static void modificarDatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("\nModificar los datos de un jugador:");
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.nextLine();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                System.out.println("Ingrese los nuevos datos para el jugador:");
                System.out.print("Nombre: ");
                jugador.setNombre(scanner.nextLine());
                System.out.print("Apellido: ");
                jugador.setApellido(scanner.nextLine());
                System.out.print("Fecha de nacimiento (formato: dd/mm/aaaa): ");
                String fechaNacimientoStr = scanner.nextLine();
                System.out.print("Nacionalidad: ");
                jugador.setNacionalidad(scanner.nextLine());
                System.out.print("Estatura: ");
                jugador.setEstatura(scanner.nextDouble());
                System.out.print("Peso: ");
                jugador.setPeso(scanner.nextDouble());
                scanner.nextLine();
                System.out.print("Posición (delantero, medio, defensa, arquero): ");
                jugador.setPosicion(scanner.nextLine());
                System.out.println("Datos modificados correctamente.");
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    private static void eliminarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("\nEliminar un jugador:");
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.nextLine();

        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                iterator.remove();
                System.out.println("Jugador eliminado correctamente.");
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
        System.out.println("\nMostrar la cantidad total de jugadores:");
        System.out.println("Cantidad total de jugadores: " + jugadores.size());
    }

    private static void mostrarCantidadJugadoresNacionalidad(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("\nMostrar la cantidad de jugadores que pertenecen a una nacionalidad:");
        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        int cantidad = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                cantidad++;
            }
        }
        System.out.println("Cantidad de jugadores de nacionalidad " + nacionalidad + ": " + cantidad);
    }
}