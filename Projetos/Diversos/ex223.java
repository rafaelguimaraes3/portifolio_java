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
			System.out.println("S�o m�ltiplos");
		else
			System.out.println("N�o m�ltiplos");

		sc.close();
	}

}
