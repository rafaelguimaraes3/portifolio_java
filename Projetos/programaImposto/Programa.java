package programaImposto;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculo cal;
		cal = new Calculo();
		
		System.out.print("Digite o nome do funcion�rio: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o sal�rio bruto: ");
		cal.salarioBruto = sc.nextDouble();
		
		System.out.print("Digite o desconto do sal�rio: ");
		cal.taxaDesconto = sc.nextDouble();
		
		System.out.print("Sal�rio l�quido: " + nome +", R$ " + cal.salliquido());
		System.out.println("");
		
		System.out.print("Digite o percentual de reajuste do sal�rio: ");
		cal.percentual =  sc.nextDouble();
		
		System.out.printf(nome+ ", R$ "+ cal.salac());
		
		
		sc.close();

	}

}
