package CursoEmVideo;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		float nota1 = 8.5f;
		String nome1 = "Guilherme";
		System.out.println("A nota e: " + nota1);
		System.out.printf("A nota de %s e: %.2f\n", nome1, nota1);
		System.out.format("A nota de %s e: %.2f\n", nome1, nota1);
		
		System.out.println("----------------------------");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome2 = teclado.nextLine();
		System.out.printf("Digite a nota do %s: ", nome2);
		float nota2 = teclado.nextFloat();
		
		System.out.format("A nota de %s e: %.2f\n", nome2, nota2);
	}

}
