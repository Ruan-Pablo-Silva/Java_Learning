package triangulo;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * teste de POO fazendo uma classe para calcular a �rea de 2 tri�ngulos e
		 * descobrir qual � o maior.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("digitar os 3 valores do triangulo 1: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		double result1 = x.calcular();

		System.out.println("digitar os 3 valores do triangulo 2: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double result2 = y.calcular();

		if (result1 > result2) {
			System.out.printf("triangulo 1 %.2f � maior: ", result1);

		} else {
			System.out.printf("triangulo 2 %.2f � maior", result2);
		}

	}

}
