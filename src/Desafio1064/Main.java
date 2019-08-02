package Desafio1064;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.0");
	
		double[] valores = new double[] {
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble()
		};
		
		double totalPositivos = 0;
		
		int quantidadeValoresPositivos = 0;
		
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] < 0.0)
				continue;
			quantidadeValoresPositivos++;
			totalPositivos += valores[i];
		}
		
		System.out.println(String.format("%d valores positivos", quantidadeValoresPositivos));
		if(totalPositivos > 0) {
			System.out.println(df.format(totalPositivos/quantidadeValoresPositivos));
		}
		
		sc.close();
	}
}