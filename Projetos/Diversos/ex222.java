import java.util.Scanner;

public class ex222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero");

		int numero = sc.nextInt();

		if (numero % 2 == 0)
			System.out.println("PAR");
		else
			System.out.println("�MPAR");

		sc.close();

	}

}
