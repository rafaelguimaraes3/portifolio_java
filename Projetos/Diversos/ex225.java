import java.util.Scanner;

public class ex225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float cq = 4.00f;// 1
		float xsalada = 4.50f;// 2
		float xbacon = 5.00f;// 3
		float torrada = 2.00f;// 4
		float refri = 1.50f;// 5
		float valor1, valor2, quant1, quant2;

		System.out.println("Digite o código do primeiro produto: ");
		int cod1 = sc.nextInt();
		if (cod1 == 1) {
			valor1 = cq;
		} else if (cod1 == 2) {
			valor1 = xsalada;
		} else if (cod1 == 3) {
			valor1 = xbacon;
		} else if (cod1 == 4) {
			valor1 = torrada;
		} else if (cod1 == 5) {
			valor1 = refri;
		} else
			valor1 = 0;

		System.out.println("Quantidade: ");
		quant1 = sc.nextFloat();

		System.out.printf("Total: R$ %.2f %n", (quant1 * valor1));

		System.out.println("Digite o código do segundo produto: ");
		int cod2 = sc.nextInt();
		if (cod2 == 1) {
			valor2 = cq;
		} else if (cod2 == 2) {
			valor2 = xsalada;
		} else if (cod2 == 3) {
			valor2 = xbacon;
		} else if (cod2 == 4) {
			valor2 = torrada;
		} else if (cod2 == 5) {
			valor2 = refri;
		} else
			valor2 = 0;

		System.out.println("Quantidade: ");
		quant2 = sc.nextFloat();

		System.out.printf("Total: R$ %.2f %n", (quant2 * valor2));
		System.out.println("---------------------------");
		System.out.printf("Total Geral: R$ %.2f %n", (quant1 * valor1) + (quant2 * valor2));

		sc.close();

	}

}
