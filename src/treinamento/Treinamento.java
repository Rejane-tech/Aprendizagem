package treinamento;
import java.util.Locale;

public class Treinamento {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
	    String produto2 = "Mesa";
		
		byte idade = 44;
		int codigo = 5290;
		char genero ='F';
		
		double preco1 = 2100.00;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, com preco de $ %2f%n ", produto1, preco1);
		System.out.printf("%s, com preco de $ %2f%n ", produto2, preco2);
		System.out.println();
		System.out.printf("Registro: %d anos de idade, codigo %d, genero:%c%n", idade, codigo, genero);
		System.out.println();
		System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
		System.out.printf("Arredondar (tres casas decimais) :%.3f%n", medida);
	    Locale.setDefault(Locale.US);
	    System.out.printf("US decimal: %.3f%n", medida);
	
	
	}
	
	
	

}

