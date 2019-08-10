package Desafio1182;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	private static final int MatrixTamanho = 12;

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double a = 0.0;
		double[][] M = new double[MatrixTamanho][MatrixTamanho];
		String operacao = "";
		
		int colunaEscolhida = sc.nextInt();
		operacao = sc.next();
		
		for (int linha = 0; linha < MatrixTamanho; linha++) {
			for (int coluna = 0; coluna < MatrixTamanho; coluna++) {
				double valor = sc.nextDouble();
				M[linha][coluna] = valor;
				
				if(coluna == colunaEscolhida) {
					a += M[linha][coluna];
				}
			}
		}
		
		if(operacao.equalsIgnoreCase("S")) {
			System.out.println(df.format(a));
		}else if(operacao.equalsIgnoreCase("M")) {
			double media = a/MatrixTamanho;
			System.out.println(df.format(media));
		}
		
		sc.close();
	}
}