package programaImposto;

public class Calculo {

	public double salarioBruto, taxaDesconto, percentual; 
		
	public double salliquido() {
		return (salarioBruto - taxaDesconto);
		}
	public double salac() {
		return (salarioBruto - taxaDesconto)+((salarioBruto*percentual)/100);
		
	}
}

