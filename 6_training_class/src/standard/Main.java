package standard;

import java.util.Scanner;

import numbers.Valor;

public class Main {

	public static void main(String[] args) {
		
		Valor x;
		Scanner sc = new Scanner(System.in);
		
		
		x = new Valor();

		System.out.println("nº dos valores");
		System.out.print("valor 1= ");
		x.a = sc.nextInt();
		System.out.print("\n valor 2= ");
		x.b = sc.nextInt();
		
		int Soma = x.somaDosValores();
		
		System.out.println("numero do valor 1: " + x.a + " --- nº do valor 2: " + x.b );
		System.out.println("somando o numero dos 2 valores, temos = " + Soma);
		
		sc.close();
	}

}
