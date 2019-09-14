import java.util.Scanner;

public class ex204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario;

		System.out.println("Digite o número do funcionário: ");
		int num = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.println("Digite o valor da hora do funcionário: ");
		double valorHora = sc.nextDouble();

		salario = valorHora * horas;

		System.out.println("Número = " + num);
		System.out.printf("Salário = R$ %.2f%n", salario);

		sc.close();

	}

}
