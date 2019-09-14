import java.util.Scanner;

public class ex224 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial: ");
		int hinicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		int hfinal = sc.nextInt();

		int duracao;
		if (hinicial < hfinal) {
			duracao = hfinal - hinicial;
		} else {
			duracao = 24 - hinicial + hfinal;

		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}
}