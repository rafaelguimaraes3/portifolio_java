import java.util.Scanner;

public class ex182 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Quantos banheiros: ");
		int wc = sc.nextInt();
		System.out.println("Qual salário: ");
		double salario = sc.nextDouble();
		System.out.println("Último nome; idade e altura:");
		String ultmnome = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();

		System.out.println(nome);
		System.out.println(wc);
		System.out.println(salario);
		System.out.println(ultmnome);
		System.out.println(idade);
		System.out.println(altura);

		sc.close();

	}

}
