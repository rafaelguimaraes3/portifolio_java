import java.util.Scanner;

public class ex206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float triangulo, circulo, trapezio, quadrado, retangulo;
		float pi = 3.14159f;

		System.out.println("Digite o primeiro valor");
		float a = sc.nextFloat();
		System.out.println("Digite o segundo valor");
		float b = sc.nextFloat();
		System.out.println("Digite o terceiro valor");
		float c = sc.nextFloat();

		triangulo = (a * c) / 2;
		circulo = pi * (c * c);
		trapezio = (a + b) / 2 * c;
		quadrado = b * b;
		retangulo = a * b;

		System.out.printf("Triângulo = %.3f%n", triangulo);
		System.out.printf("Círculo = %.3f%n", circulo);
		System.out.printf("Trapézio = %.3f%n", trapezio);
		System.out.printf("Quadrado = %.3f%n", quadrado);
		System.out.printf("Retângulo = %.3f%n", retangulo);

		sc.close();

	}

}
