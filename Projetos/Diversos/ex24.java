import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("Digite os 3 números: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > b || a > c) {
			System.out.printf("O maior é %d", a);
		} else if (b > a || b > c) {
			System.out.printf("O maior é %d", b);
		} else {
			System.out.printf("O maior é %d", c);
		}
		/* System.out.printf("%d %d %d" , a, b, c); */

		sc.close();

	}
}