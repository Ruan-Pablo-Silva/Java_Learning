package desafio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*teste de la�o de repeti��o simples
		 * 
		 * o contador ir� pedir 5 n�meros, ao final ele contar� quantos pares e impares h�.
		 */
		
		
		int n = sc.nextInt();
		int counter = 1;
		int intervalo1 = 0, intervalo2 = 0;
		
		while(counter <= 5 ) {
			
			if ( n < 11 &&  n > -1 && counter == 5) {
				intervalo1++;
				counter++;
				
			
			}else if(n < 11 &&  n > -1) {
				intervalo1++;
				counter++;
				
				n = sc.nextInt();
			}else if ( n > 10 && counter == 5) {
				intervalo2++;
				counter++;
				
			}else if ( n > 10 ) {
				intervalo2++;
				counter++;
				n = sc.nextInt();
				
			}else{
				System.out.print("N�O DIGITE N� NEGATIVO ");
				n = sc.nextInt();				
			}
		}

		System.out.printf("a quantidade de n�s pares �: %d \n a quantidade de n�s impares �: %d" , intervalo1, intervalo2 );
		
	}

}
