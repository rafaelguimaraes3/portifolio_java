import java.util.Scanner;

public class ex203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite A: ");
		int a = sc.nextInt();
		System.out.println("Digite B: ");
		int b = sc.nextInt();
		System.out.println("Digite C: ");
		int c = sc.nextInt();
		System.out.println("Digite D: ");
		int d = sc.nextInt();

		System.out.print("DIFERENÇA = ");
		System.out.println((a * b) - (c * d));

		sc.close();
	}

}
