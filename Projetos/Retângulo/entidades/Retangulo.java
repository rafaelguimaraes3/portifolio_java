package entidades;

public class Retangulo {

	public double base, altura;

	public double area() {

		return base * altura;
	}

	public double perimetro() {

		return (base + altura) * 2;

	}

	public double diagonal() {

		return Math.sqrt((base * base) + (altura * altura));

	}
}
