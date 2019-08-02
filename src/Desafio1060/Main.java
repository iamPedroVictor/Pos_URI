package Desafio1060;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double[] valores = new double[] {
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble()
		};
		
		int quantidadeValoresPositivos = 0;
		
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] < 0.0)
				continue;
			quantidadeValoresPositivos++;
		}
		
		System.out.println(String.format("%d valores positivos", quantidadeValoresPositivos));
		
		sc.close();
	}
}
