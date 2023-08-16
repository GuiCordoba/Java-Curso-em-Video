package CursoEmVideo;

import java.util.Scanner;

public class EstruturasCondicionaisPt1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/*
		//Condição SImples
		System.out.println("Primeira nota: ");
		float n1 = teclado.nextFloat();
		System.out.println("Segunda nota: ");
		float n2 = teclado.nextFloat();
		float m = (n1+n2) / 2;
		System.out.println("Sua media foi: " + m);
		if (m > 9) {
			System.out.println("Parabens pela nota!");
		}
		
		
		//Condição Composta
		System.out.println("Ano de nascimento: ");
		int nasc = teclado.nextInt();
		int idade = 2023 - nasc;
		System.out.println("Sua idade e " + idade);
		if (idade >= 18) {
			System.out.println("Voce e maior de idade!");
		} else {
			System.out.println("Voce e menor de idade!");
		}*/
		
		System.out.println("Informe um valor: ");
		float n = teclado.nextFloat();
		if (n % 2 == 0) {
			System.out.println("Numero par!");
		} else {
			System.out.println("Numero impar!");
		}
		
		
	}

}
