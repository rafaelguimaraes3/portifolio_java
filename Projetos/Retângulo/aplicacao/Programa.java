package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Retangulo ret;
		ret = new Retangulo();

		System.out.println("Digite a base e a altura do ret�ngulo: ");
		ret.base = sc.nextDouble();
		ret.altura = sc.nextDouble();

		System.out.printf("�rea = %.2f%n", ret.area());
		System.out.printf("Per�metro = %.2f%n", ret.perimetro());
		System.out.printf("Diagonal = %.2f%n", ret.diagonal());

		sc.close();
	}
}
