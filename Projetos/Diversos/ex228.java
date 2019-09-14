import java.util.Scanner;

public class ex228 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salário: ");
		float salario = sc.nextFloat();
		float imposto;

		if (salario <= 2000.0) {
			imposto = (float) 0.0;
		} else if (salario <= 3000.0) {
			imposto = (float) ((salario - 2000.0) * 0.08);
		} else if (salario <= 4500.0) {
			imposto = (float) ((salario - 3000.0) * 0.18 + 1000.0 * 0.08);
		} else {
			imposto = (float) ((salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08);
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);

		}

		sc.close();
	}
}
