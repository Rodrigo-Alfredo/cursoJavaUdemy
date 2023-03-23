
public class CastingJava {

	public static void main(String[] args) {
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a/b;
		System.out.println(resultado);
		
		//para o valor correto deve ser feito o casting;(conversão explicita de tipos de dados);
		
		resultado = (double) a/b;
		System.out.println(resultado);

	}

}
