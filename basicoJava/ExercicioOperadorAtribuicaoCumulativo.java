import java.util.Locale;
import java.util.Scanner;

public class ExercicioOperadorAtribuicaoCumulativo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		double conta = 50.0;
		
		System.out.println("Informe o consumo em minutos para o cálculo da conta");
		int minutos = sc.nextInt();
		
	//espaço entre entrada e saída de dados:
		System.out.println("");

		if (minutos > 100) {
			//conta = conta + (minutos - 100) * 2;
			conta += (minutos - 100) * 2;
		} 
		
		System.out.printf("O valor a ser pago é = R$ %.2f ", conta);

		sc.close();

	}

}
