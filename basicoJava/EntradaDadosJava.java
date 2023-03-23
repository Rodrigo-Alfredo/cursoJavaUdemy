import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosJava {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String x;
		int idade;
		char genero;

		System.out.println("Informe o nome:");
		x = sc.next();//nextLine = ler a linha toda e quebra a LINHA =  CUIDADO;
		System.out.println("Informe a idade");
		idade = sc.nextInt();
		System.out.println("Informe o peso");
		double peso = sc.nextDouble();

		System.out.println("Informe o sexo");
		genero = sc.next().charAt(0);// .charAt(0) = capturar a primeira letra da String.

		System.out.println("Dados Informados:");
		System.out.printf("Seu nome é %s, sua idade é %d, seu peso é %.2f seu gênero é %c", x, idade, peso, genero);

		sc.close();

	}

}
