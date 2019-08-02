package Desafio1080;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int posicaoDoMaiorNumero = 0;
		int maiorNumero = 0;
		
		for(int i = 1; i <= 100; i++) {
			int valorX = sc.nextInt();
			if(valorX > maiorNumero) {
				posicaoDoMaiorNumero = i;
				maiorNumero = valorX;
			}
		}
		
		System.out.println(maiorNumero);
		System.out.println(posicaoDoMaiorNumero);
		
		sc.close();
	}
}
