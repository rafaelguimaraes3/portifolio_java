import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero:");
		int num1 = sc.nextInt();
		System.out.println("Digite o segunto n�mero");
		int num2 = sc.nextInt();

		System.out.print("O resultado da soma �: ");
		System.out.print((num1 + num2));

		sc.close();

	}

}
