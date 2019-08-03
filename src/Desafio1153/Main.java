package Desafio1153;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int baseValor = sc.nextInt();
		int resultado = 1;
		for (int i = baseValor; i >= 1 ; i--) {
			resultado *= i;
		}
		System.out.println(resultado);
		
		sc.close();
	}	
}
