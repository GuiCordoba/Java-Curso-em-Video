package CursoEmVideo;

import java.util.Scanner;

public class EstruturasCondicionaisPt2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		/*System.out.println("Insira seu ano de nascimento:");
		int nasc = t.nextInt();
		int idade = 2023 - nasc;
		if (idade < 16) {
			System.out.println("Não precisa votar!");
		} else {
			if ((idade >= 16 && idade < 18) || (idade >= 70)) {
				System.out.println("Nao e obrigatorio votar!");
			} else {
				System.out.println("E obrigatorio votar!");
			}
		}*/
		
		System.out.println("Insira o numero de pernas: ");
		int pernas = t.nextInt();
		String tipo;
		System.out.println("Isso e um(a): ");
		switch (pernas) {
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bipede";
			break;
		case 3:
			tipo = "Tripe";
			break;
		case 4:
			tipo = "Quadrupede";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
		}
		System.out.println(tipo);

	}

}
