package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Retangulo ret;
		ret = new Retangulo();

		System.out.println("Digite a base e a altura do retângulo: ");
		ret.base = sc.nextDouble();
		ret.altura = sc.nextDouble();

		System.out.printf("Área = %.2f%n", ret.area());
		System.out.printf("Perímetro = %.2f%n", ret.perimetro());
		System.out.printf("Diagonal = %.2f%n", ret.diagonal());

		sc.close();
	}
}
