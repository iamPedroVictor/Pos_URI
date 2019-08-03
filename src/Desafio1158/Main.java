package Desafio1158;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int quantidadeCasos = sc.nextInt();
		
		for(int i = 0; i < quantidadeCasos; i++) {
			int valorX = sc.nextInt();
			int valorY = sc.nextInt();
			int soma = 0;
			int yValido = 0;
			while(yValido != valorY) {
				if(valorX % 2 != 0) {
					soma += valorX;
					yValido++;
				}
				valorX++;
			}
			System.out.println(soma);
		}
		sc.close();
	}
}
