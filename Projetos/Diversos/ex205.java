import java.util.Scanner;

public class ex205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorTotal1, valorTotal2, totalCompra;

		System.out.println("digite o c�digo: ");
		int codigo1 = sc.nextInt();
		System.out.println("digite a quantidade: ");
		int quantidade1 = sc.nextInt();
		System.out.println("Digite o pre�o unit�rio");
		double precoUnt1 = sc.nextDouble();

		valorTotal1 = quantidade1 * precoUnt1;

		System.out.println("digite o c�digo: ");
		int codigo2 = sc.nextInt();
		System.out.println("digite a quantidade: ");
		int quantidade2 = sc.nextInt();
		System.out.println("Digite o pre�o unit�rio");
		double precoUnt2 = sc.nextDouble();

		valorTotal2 = quantidade2 * precoUnt2;

		totalCompra = valorTotal1 + valorTotal2;

		System.out.printf("O valor da compra � R$ = R$ %.2f%n", totalCompra);

		sc.close();

	}

}
