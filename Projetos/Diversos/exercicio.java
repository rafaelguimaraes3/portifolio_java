
public class exercicio {

	public static void main(String[] args) {

		String product1 = ("Computador");
		String product2 = ("Office desk");

		int age = 30;
		int cod = 5290;
		char gender = 'F';
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.233454;

		System.out.println("Produtos:");
		System.out.printf("%s tem o preço de $ %.2f%n", product1, preco1);
		System.out.printf("%s tem o preço de $ %.2f%n%n", product2, preco2);
		System.out.printf("record: %d de idade, com o código %d de gênero %c %n ", age, cod, gender);
		System.out.printf("preço decimal %.1f%n", measure);

	}

}
