package ar.edu.unju.fi.ejercicio10;

import ar.edu.unju.fi.ejercicio10.model.Pizza;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // ingreso de los datos de 3 pizzas
        for (int i = 1; i <= 3; i++) {
            System.out.println("** Pizza " + i + " **");
            Pizza pizza = new Pizza();
            System.out.print("Ingrese el diámetro de la pizza (20, 30 o 40): ");
            int diametro = scanner.nextInt();
            // validamos el diámetro
            if (diametro != 20 && diametro != 30 && diametro != 40) {
                System.out.println("Diámetro no válido.");
                continue;
            }
            pizza.setDiametro(diametro);
            System.out.print("¿Lleva ingredientes especiales? (si/no): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();
            pizza.setIngredientesEspeciales(ingredientesEspeciales);

            // cálculo de precio y área
            pizza.calcularPrecio();
            pizza.calcularArea();

            // mostramos los detalles de la pizza
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
        }
        scanner.close();
    }
}