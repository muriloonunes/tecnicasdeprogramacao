package aula4.exercicio2;

import java.util.Scanner;

public class aula4 {
	void tabuada (int x) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(x*i);
		}
	}
	
	public static void main(String[] args) {
		aula4 a = new aula4();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de x:");
		int x = ler.nextInt();
		System.out.println("");
		
		a.tabuada(x);
	}
}
