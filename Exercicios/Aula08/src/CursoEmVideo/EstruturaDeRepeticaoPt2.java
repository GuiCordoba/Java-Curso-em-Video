package CursoEmVideo;

import java.util.Scanner;

public class EstruturaDeRepeticaoPt2 {
	
	public static void main(String[] args) {
		int n, s = 0;
		String resp;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Insira um valor: ");
			n = teclado.nextInt();
			s += n;
			System.out.println("Deseja continuar [S/N]? ");
			resp = teclado.next();
			
		}while(resp.equals("S"));
		
		System.out.println("A soma dos valores digitados foram: " + s);

	}
}


