import java.util.Scanner;

public class EstruturaCondicionalJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("informe a hora em número inteiro");
		hora = sc.nextInt();

		if (hora >= 0 && hora <= 12) {
			System.out.println("Bom dia!!!");
		} else {

			if (hora > 12 && hora <= 18) {
				System.out.println("Boa Tarde!!!");
			} else {
				System.out.println("Boa noite!!!");
			}
		}

		sc.close();

	}

}
