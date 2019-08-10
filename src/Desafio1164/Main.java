package Desafio1164;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
	
		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			int soma = 0;
			for(int j = 1; j < y; j++) {
				if(y % j == 0) {
					soma += j;
				}
			}
			if(soma == y) {
				System.out.println(y + " eh perfeito");
			}else {
				System.out.println(y + " nao eh perfeito");
			}
		}
		
		sc.close();
	}
}