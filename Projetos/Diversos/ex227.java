import java.util.Scanner;

public class ex227 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de X:");
		float x = sc.nextFloat();
		System.out.println("Digite o valor de Y:");
		float y = sc.nextFloat();

		if (x > 0 && y > 0)
			System.out.println("Q1");
		else if (x > 0 && y < 0)
			System.out.println("Q4");
		else if (x < 0 && y > 0)
			System.out.println("Q2");
		else if (x < 0 && y < 0)
			System.out.println("Q3");
		else
			System.out.println("Origem");

		sc.close();
	}

}
