package Desafio1037;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		sc.close();
		
		if(valor < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
		}else if(valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}else if(valor <= 50.00) {
			System.out.println("Intervalo (25,50]");
		}else if(valor <= 75.00) {
			System.out.println("Intervalo (50,75]");
		}else if(valor <= 100.00) {
			System.out.println("Intervalo (75,100]");
		}
	}
}
