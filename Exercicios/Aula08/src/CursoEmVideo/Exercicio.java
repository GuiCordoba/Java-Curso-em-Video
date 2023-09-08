package CursoEmVideo;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		float n, m, s = 0;
		int par = 0, impar = 0, c = 0;
	;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Insira um valor: ");
			n = teclado.nextFloat();
			if (n % 2 == 0) {
				par ++;
			}
			else {
				impar ++;
			}
			c++;
			s += n;

			
		}while (n != 0);
		m = s / c;
		System.out.println("Total de valores: " + c);
		System.out.println("Total de pares: " + par);
		System.out.println("Total de impares: " + impar);
		System.out.println("A soma dos numeros digitados e: " + s);
		System.out.println("Media : " + m);
		System.out.println(">> Programa Encerrado << ");
		
		
	}

}
