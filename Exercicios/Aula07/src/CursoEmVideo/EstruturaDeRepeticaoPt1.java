package CursoEmVideo;

public class EstruturaDeRepeticaoPt1 {

	public static void main(String[] args) {
		int cc = 0;
		while (cc<10) {
			cc++;
			if (cc == 2 || cc == 3){
				continue; //não ira mostrar o numero 5 e 7
			}
			if (cc == 7) {
				break;
			}
			System.out.println("Cambalhota " + cc);
			
		}
		
		System.out.println("----------------------");
		

	}

}
