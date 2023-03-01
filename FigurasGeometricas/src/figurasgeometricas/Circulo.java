package figurasgeometricas;

public class Circulo {
    private double radio;

    public Circulo() {
        this.radio = 1;
    }

    public Circulo(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("Error: El radio debe ser positivo. Se asignará un valor de 1.");
            this.radio = 1;
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("Error: El radio debe ser positivo. No se ha modificado el valor.");
        }
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }
}


