package CursoEmVideo;


import java.util.Arrays;

public class Exercicios02 {

	public static void main(String[] args) {
		double v[] = {3.5, 5.8, 3, -30, 1.2};
		Arrays.sort(v); //coloca os numeros em ordens
		for (double valor: v) {
			System.out.println(valor);
		}
	}

}
