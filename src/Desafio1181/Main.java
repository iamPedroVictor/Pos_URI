package Desafio1181;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final int n = 12;

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		int L = sc.nextInt();
		String T = sc.next();
		double acum = 0.0;
		
		double[][] M = new double[n][n];
		
		for(int linha = 0; linha < n; linha++) {
			for(int coluna = 0; coluna < n; coluna++) {
				double slot = sc.nextDouble();
				M[linha][coluna] = slot;
				if(linha == L)
					acum += M[linha][coluna];
			}
		}
		
		if(T.equalsIgnoreCase("S")) {
			System.out.println(df.format(acum));
		}else if(T.equalsIgnoreCase("M")) {
			acum = acum/n;
			System.out.println(df.format(acum));
		}
		
		
		sc.close();
	}
}