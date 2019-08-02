package Desafio1070;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int valorBase = sc.nextInt();
		int contador = 0;
		
		while(contador < 6) {
			valorBase++;
			if(valorBase % 2 != 0) {
				System.out.println(valorBase);
				contador++;
			}			
		}
		sc.close();
	}
}
