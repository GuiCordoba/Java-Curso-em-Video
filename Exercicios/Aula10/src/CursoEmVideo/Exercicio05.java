package CursoEmVideo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int numAlunos = 5;
		double notaAlunos[] = new double[numAlunos];
		Scanner teclado = new Scanner(System.in);
		
		for (int c=0; c<numAlunos; c++) {
			System.out.println("Insira o valor do " + (c+1) + " aluno: ");
			notaAlunos[c] = teclado.nextDouble();
			
		}
		
		for (int c=0; c<numAlunos; c++) {
			System.out.println("O valor da nota do aluno " + (c+1) + " e : " + notaAlunos[c]);
		}

	}

}
