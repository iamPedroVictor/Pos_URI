package Desafio1073;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0");
		
		int valorBase = sc.nextInt();
		
		ImprimirQuadradoPares(df, valorBase);
		sc.close();
	}

	private static void ImprimirQuadradoPares(DecimalFormat df, int valorBase) {
		for(int i = 1; i <= valorBase; i++) {
			boolean isPar = i % 2 == 0;
			if(isPar) {
				System.out.println(String.format("%d^2 = %s", i, df.format(Math.pow(i, 2))));
			}
		}
	}
}
