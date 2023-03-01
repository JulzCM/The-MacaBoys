package figurasgeometricas;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    public Rectangulo(double base, double altura) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Error: La base debe ser positiva. Se asignará un valor de 1.");
            this.base = 1;
        }
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Error: La altura debe ser positiva. Se asignará un valor de 1.");
            this.altura = 1;
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Error: La base debe ser positiva. No se ha modificado el valor.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Error: La altura debe ser positiva. No se ha modificado el valor.");
        }
    }

    public double getPerimetro() {
        return 2 * base + 2 * altura;
    }

    public double getArea() {
        return base * altura;
    }

    public boolean isCuadrado() {
        return base == altura;
    }
}
