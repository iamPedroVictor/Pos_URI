package Desafio1074;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final String nulo = "NULL";
	private static final String par = "EVEN";
	private static final String impar = "ODD";
	private static final String positivo = "POSITIVE";
	private static final String negativo = "NEGATIVE";

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int quantidadeInteiros = sc.nextInt();
		
		for(int i = 0; i < quantidadeInteiros; i++) {
			int valorInteiro = sc.nextInt();
			boolean valorZero = valorInteiro == 0;
			boolean isPar = valorInteiro % 2 == 0;
			boolean isPositivo = valorInteiro > 0;

			if(valorZero) {
				System.out.println(nulo);
				continue;				
			}
			VerificarParImpar(isPar);			
			System.out.print(" ");
			VerificarPositivoNegativo(isPositivo);
			System.out.println("");
		}
		sc.close();
	}

	private static void VerificarPositivoNegativo(boolean isPositivo) {
		if(isPositivo) {
			System.out.print(positivo);
		}else {
			System.out.print(negativo);
		}
	}

	private static void VerificarParImpar(boolean isPar) {
		if(isPar) {
			System.out.print(par);
		}else {
			System.out.print(impar);
		}
	}
}
