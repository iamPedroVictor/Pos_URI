package Desafio1071;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int[] valoresInput = new int[]{
				sc.nextInt(),
				sc.nextInt()
		}; 
		valoresInput = OrdenarValores(valoresInput);		
		int somaImpares = SomarImpares(valoresInput[0], valoresInput[1]);		
		System.out.println(somaImpares);
		sc.close();
	}

	private static int[] OrdenarValores(int[] valoresInput) {
		int[] valoresOrdenados = new int[valoresInput.length];
		if(valoresInput[0] > valoresInput[1]) {
			valoresOrdenados[0] = valoresInput[1];
			valoresOrdenados[1] = valoresInput[0];
		}else {
			return valoresInput;
		}
		return valoresOrdenados;
	}

	private static int SomarImpares(int valorX, int valorY) {
		int totalImpares = 0;
		for(int i = valorX + 1; i < valorY; i++) {
			boolean isImpar = i % 2 != 0;
			if(isImpar) {
				totalImpares += i;
			}
		}
		return totalImpares;
	}
}
