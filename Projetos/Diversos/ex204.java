import java.util.Scanner;

public class ex204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario;

		System.out.println("Digite o n�mero do funcion�rio: ");
		int num = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.println("Digite o valor da hora do funcion�rio: ");
		double valorHora = sc.nextDouble();

		salario = valorHora * horas;

		System.out.println("N�mero = " + num);
		System.out.printf("Sal�rio = R$ %.2f%n", salario);

		sc.close();

	}

}
