package exerci;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("diga coordenadas X e Y ");

		/* la�o de repeti��o onde mostrar� em qual quandrante
		 * do plano cartesiano estamos digitando 2 n�meros.
		 */
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Q1");
				
				System.out.println("diga coordenadas X e Y ");
				 x = sc.nextInt();
				 y = sc.nextInt();
			}
			else if ( x < 0 && y > 0) {
				System.out.println("Q4");
				
				System.out.println("Diga as coordenadas X e Y ");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else if (x < 0 && y < 0) {
				System.out.println("Q3");
				System.out.println("diga cordenadas X e Y");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else if(x > 0 && y < 0) {
				System.out.println("Q2");
				System.out.println("diga coordenadas x e y");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else {
				System.out.println("valor eixo");
				
			}
				
		}
		System.out.println("desafio feito");

	}
}
