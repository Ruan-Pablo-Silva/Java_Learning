import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//condicional para averiguar se ir� pagar imposto de renda
		
		double salario = sc.nextDouble();
		
		if (salario >= 0.00 && salario <= 2000.00) {
			System.out.println("isento do imposto de renda");			
		}
		else if (salario >= 2000.01 && salario <= 3000.00) {
			System.out.println(" haver� uma pequena taxa de imposto de renda");
			
		}
		
		
	}

}
