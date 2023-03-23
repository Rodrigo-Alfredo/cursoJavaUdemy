import java.util.Locale;

public class SaidaJava {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("O primeiro programa do curso da Udemy!!!");
		
		double x = 10.35785;
		
		System.out.println(x);
		System.out.printf("%.2f%n" , x);
		// printf = imprimir formatado;
		//para alterar o padrão númerico do português para o inglês (printf):
		//importar a biblioteca Locale do java.util;
		//Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n" , x);
		// concatenar vários elementos em um mesmo comando de escrita:
		/* Marcadores:
		 * %f = ponto flutuante; %d = inteiro;
		 * %s = texto; %n ou \n = quebra de linha;
		 */
		String nome = " Maria ";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
		
	}

}
