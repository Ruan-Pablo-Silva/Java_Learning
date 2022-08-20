package Somador;

public class Calculator {
	public int n1;
	public int n2;
	
	public int somar() {
	int calcular = n1 + n2;
	return calcular;
	}
	
	public int subtrair() {
		int subtrair = n1 - n2;
		return subtrair;
	}

	public void addNumber(int n1 ) {
		this.n1 += n1; 
	}
}

