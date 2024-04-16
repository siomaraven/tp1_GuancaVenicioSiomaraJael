package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

    // constructor por defecto
    public CalculadoraEspecial() {
    }

    // getter y setter para el atributo 'n'
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // método para calcular la sumatoria
    public long calcularSumatoria() {
        long sumatoria = 0;
        for (int y = 1; y <= n; y++) {
            sumatoria += y * (y + 1) * (y * ((y + 1) / 2)) * (y * ((y + 1) / 2));
        }
        return sumatoria;
    }

    // método para calcular la productoria
    public long calcularProductoria() {
        long productoria = 1;
        for (int y = 1; y <= n; y++) {
            productoria *= y * (y + 4);
        }
        return productoria;
    }
}

