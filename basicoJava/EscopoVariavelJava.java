import java.util.Locale;

public class EscopoVariavelJava {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Em java para usar a variável, a mesma deve ser inicializada;
		
		//double price = 400.00;
		
		/*if (price < 200.00) {
			double discount = price * 0.1;
		}
		
		System.out.println(discount);
		
		Como a variável (discount) foi criada dentro do If, a mesma não pode ser utilizada
		no escopo do método main. E após o uso dentro do escopo condicional, ou de controle
		a mesma é desalocada da memória. O ideal é inicializa-la no escopo do método main.
		Por exemplo: double discount = 0; Pois, desta forma, mesma que ela caia na negação do if, 
		ela foi inicializada anteriormente. Ou, a variável pode ser inicializada no comando Else. 
		*/

	}

}
