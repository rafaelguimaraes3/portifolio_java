import java.util.Scanner;

public class ex201 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;

		System.out.println("Digite o valor do raio do c�rculo: ");
		double area = sc.nextDouble();

		System.out.print("O resultado ser�: ");
		System.out.println(pi * (area * area));

		sc.close();

	}

}
