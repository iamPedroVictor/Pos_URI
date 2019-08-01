package Desafio1044;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] dataLine = sc.nextLine().split(" ");
		int		valorA = Integer.parseInt(dataLine[0]),
				valorB = Integer.parseInt(dataLine[1]);
		boolean isMultiplo = VerificarMultiplos(valorA, valorB);
		ImprimirResposta(isMultiplo);
		sc.close();
	}

	private static void ImprimirResposta(boolean isMultiplo) {
		if(isMultiplo) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
	}

	private static boolean VerificarMultiplos(int valorA, int valorB) {
		boolean isMultiplo = false;
		if(valorA > valorB) {
			isMultiplo = (valorA % valorB == 0);
		}else {
			isMultiplo = (valorB % valorA == 0);
		}
		return isMultiplo;
	}
}
