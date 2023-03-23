import java.util.Scanner;

public class OperacaoBitABitJavaTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int mask = 32; é sabido que este numeral tem o sexto bit verdadeiro.
		int mask = 0b00100000; //declaração binária caso tenha dúvida sobre o sexto bit.
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true");
		} else {
			System.out.println("6th bit is false");
		}
        
		/* testar com numeral 89, pois, o sexto bit é = 0
		 testar com o numeral 113, pois, o sexto bit é = 1.
		 
		 Este teste tem a finalidade de testar se o sexto bit de um endereço
		 de rede é 1. Compara-se o bit da máscara desejada com outro mascara
		 com endereço binário para verificação. 
		*/
		
	}

}
