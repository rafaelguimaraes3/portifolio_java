import java.util.Scanner;

public class ex221 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero:");
		int numero = sc.nextInt();

		if (numero >= 0)
			System.out.println("POSITIVO");
		else
			System.out.println("NEGATIVO");

		sc.close();

	}

}
