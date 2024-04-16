package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
    private int precio;
    private double area;
    private boolean ingredientesEspeciales;
    
    // constantes
    private static final int ADICIONAL_INGREDIENTES_ESPECIALES_20 = 500;
    private static final int ADICIONAL_INGREDIENTES_ESPECIALES_30 = 750;
    private static final int ADICIONAL_INGREDIENTES_ESPECIALES_40 = 1000;
    
    // constructor por defecto
    public Pizza() {
    }
    
    // getters y setters
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }
    
    // método para calcular el precio de la pizza
    public void calcularPrecio() {
        switch (diametro) {
            case 20:
                precio = 4500;
                if (ingredientesEspeciales)
                    precio += ADICIONAL_INGREDIENTES_ESPECIALES_20;
                break;
            case 30:
                precio = 4800;
                if (ingredientesEspeciales)
                    precio += ADICIONAL_INGREDIENTES_ESPECIALES_30;
                break;
            case 40:
                precio = 5500;
                if (ingredientesEspeciales)
                    precio += ADICIONAL_INGREDIENTES_ESPECIALES_40;
                break;
            default:
                System.out.println("Diámetro no válido.");
        }
    }
    
    // método para calcular el área de la pizza
    public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * radio * radio;
    }
}