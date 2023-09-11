package CursoEmVideo;

import java.util.Arrays;

public class Exercicio03 {

	public static void main(String[] args) {
		int vet[] = {3, 7, 8, 1, 9, 4};
		for(int valor: vet) {
			System.out.print(valor + " ");
		}
		int v = Arrays.binarySearch(vet, 1); //Procura em qual posição se encontra o valor 1
		System.out.println();
		System.out.println("O valor foi encontrado na posicao " + v);

	}

}
