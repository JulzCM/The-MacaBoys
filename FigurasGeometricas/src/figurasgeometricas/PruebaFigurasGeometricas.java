package figurasgeometricas;

import java.util.Scanner;

public class PruebaFigurasGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir datos para el triángulo
        System.out.println("Ingrese el valor del lado 1 del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado 2 del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado 3 del triángulo: ");
        double lado3 = scanner.nextDouble();
        
        // Crear objeto Triangulo con los datos ingresados
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        // Mostrar resultados del triángulo
        System.out.println("El triángulo es de tipo: " + triangulo.getTipo());
        System.out.println("El perímetro del triángulo es: " + triangulo.getPerimetro());
        System.out.println("El área del triángulo es: " + triangulo.getArea());
        System.out.println("");
        
        // Pedir datos para el círculo
        System.out.println("Ingrese el valor del radio del círculo: ");
        double radio = scanner.nextDouble();
        
        // Crear objeto Circulo con el radio ingresado
        Circulo circulo = new Circulo(radio);
        
        // Mostrar resultados del círculo
        System.out.println("El área del círculo es: " + circulo.getArea());
        System.out.println("La circunferencia del círculo es: " + circulo.getPerimetro());
        System.out.println("");
        
        // Pedir datos para el rectángulo
        System.out.println("Ingrese el valor de la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        
        // Crear objeto Rectangulo con la base y altura ingresados
        Rectangulo rectangulo = new Rectangulo(base, altura);
        
        // Mostrar resultados del rectángulo
        System.out.println("El perímetro del rectángulo es: " + rectangulo.getPerimetro());
        System.out.println("El área del rectángulo es: " + rectangulo.getArea());
        System.out.println("Valor booleano: " + rectangulo.isCuadrado());
    }
}