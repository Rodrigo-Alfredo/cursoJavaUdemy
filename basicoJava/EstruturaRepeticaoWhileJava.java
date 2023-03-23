import java.util.Scanner;

public class EstruturaRepeticaoWhileJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int soma= 0;
		
		while (numero != 0) {
			soma += numero;
			numero = sc.nextInt();
			
		}
		
		System.out.println("Você digitou o númeral 0");
		System.out.println("A soma dos numeros digitados é = " + soma);
		
		sc.close();

	}

}
