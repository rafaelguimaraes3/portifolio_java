package programaImposto;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculo cal;
		cal = new Calculo();
		
		System.out.print("Digite o nome do funcionário: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o salário bruto: ");
		cal.salarioBruto = sc.nextDouble();
		
		System.out.print("Digite o desconto do salário: ");
		cal.taxaDesconto = sc.nextDouble();
		
		System.out.print("Salário líquido: " + nome +", R$ " + cal.salliquido());
		System.out.println("");
		
		System.out.print("Digite o percentual de reajuste do salário: ");
		cal.percentual =  sc.nextDouble();
		
		System.out.printf(nome+ ", R$ "+ cal.salac());
		
		
		sc.close();

	}

}
