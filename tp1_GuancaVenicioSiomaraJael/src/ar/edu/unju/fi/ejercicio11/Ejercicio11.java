package ar.edu.unju.fi.ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int i = 2;
        int j = 40;

        for (; j >= 0; j -= 1, i += 1) {
            System.out.print((i * j) + " ");
        }
    }
}