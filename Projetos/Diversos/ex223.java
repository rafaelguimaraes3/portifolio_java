import java.util.Scanner;

public class ex223 {

	public static void main(String[] args) {
		int c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");

		int a = sc.nextInt();

		System.out.println("Digite o segundo valor: ");

		int b = sc.nextInt();

		if (a > b)
			c = a % b;
		else
			c = b % a;

		if (c == 0)
			System.out.println("São múltiplos");
		else
			System.out.println("Não múltiplos");

		sc.close();
	}

}
