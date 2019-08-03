package Desafio1159;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valorX = sc.nextInt();
		
		while(valorX != 0) {
			int soma = 0;
			int paresConsecutivos = 0;
			
			while(paresConsecutivos != 5) {
				if(valorX % 2 == 0) {
					paresConsecutivos++;
					soma += valorX;
				}
				valorX++;
			}
			System.out.println(soma);
			valorX = sc.nextInt();
		}
		
		
		sc.close();
	}
}
