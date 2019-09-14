import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números que deseja somar:");
		int n = sc.nextInt();

		int soma = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Valor #" + i + ": ");
			int x = sc.nextInt();
			soma += x;

		}
		System.out.println("A soma é: " + soma);
		sc.close();
	}

}
