import java.util.Locale;
import java.util.Scanner;

public class EstruturaSwitchCaseJava {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String dia;

		System.out.println("Informe um número de 1 a 7 para representar o dia da semana");
		int numeroSemana = sc.nextInt();

		switch (numeroSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Qurta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido!!!";
			break;
		}
		
		System.out.println("Dia da semana = " + dia);

		sc.close();
	}

}
