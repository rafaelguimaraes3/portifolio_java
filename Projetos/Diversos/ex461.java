import java.util.Scanner;

public class ex461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senhapadrao = 2200;

		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();

		while (senha != senhapadrao) {
			System.out.println("Senha Inválida!");
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido!");

		sc.close();

	}

}
