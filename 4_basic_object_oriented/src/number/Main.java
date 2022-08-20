package number;


import java.util.Locale;
import java.util.Scanner;

import Somador.Calculator;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Calculator calculator = new Calculator();
		Calculator a, b;
		
		a = new Calculator();
		b = new Calculator();
		
		System.out.println("digite dois valores para somarmos. \n Valor 1: ");
		calculator.n1 = sc.nextInt();
		calculator.n2 = sc.nextInt();
		
		int soma = calculator.somar();
		int subtrair = a.subtrair();
		
		System.out.println("soma a " + soma + "\n" + "a subtração é: " + subtrair);
		
		System.out.println("os valores de b serão? ");
		b.n1 = sc.nextInt();
		b.n2 = sc.nextInt();
		
		System.out.println("valores = " + b.n1 + " " + b.n2);
		

	}

}
