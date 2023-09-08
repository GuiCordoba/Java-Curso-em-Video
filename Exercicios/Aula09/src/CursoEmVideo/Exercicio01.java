package CursoEmVideo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i, n1, n2, n3 =0;
		
		System.out.println("Insira o valor de inicio: ");
		n1 = teclado.nextInt();
		System.out.println("Insira o valor de termino: ");
		n2 = teclado.nextInt();
		System.out.println("Insira o valor do passo: ");
		n3 = teclado.nextInt();
		
		if(n1<n2) {
			for(i=n1; i<=n2; i+=n3) {
				System.out.println(i);
			}
		}
		else {
			for(i=n1; i>=n2; i-=n3) {
				System.out.println(i);
			}
		}
		
		
	}

}
