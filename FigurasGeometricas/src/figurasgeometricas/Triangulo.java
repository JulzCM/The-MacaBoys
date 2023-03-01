package figurasgeometricas;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo() {
        lado1 = 1;
        lado2 = 1;
        lado3 = 1;
    }
    
    public Triangulo(double l1, double l2, double l3) {
        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("Error: los lados deben ser positivos. Se asignará 1.");
            lado1 = 1;
            lado2 = 1;
            lado3 = 1;
        } else {
            lado1 = l1;
            lado2 = l2;
            lado3 = l3;
        }
    }
    
    public double getLado1() {
        return lado1;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    public void setLado1(double l1) {
        if (l1 > 0) {
            lado1 = l1;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se ha modificado.");
        }
    }
    
    public void setLado2(double l2) {
        if (l2 > 0) {
            lado2 = l2;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se ha modificado.");
        }
    }
    
    public void setLado3(double l3) {
        if (l3 > 0) {
            lado3 = l3;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se ha modificado.");
        }
    }
    
    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public double getArea() {
        double p = getPerimetro() / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }
    
    public String getTipo() {
        if (lado1 == lado2 && lado1 == lado3) {
            return "Equilatero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isóseles";
        } else {
            return "Escaleno";
        }
    }
}


