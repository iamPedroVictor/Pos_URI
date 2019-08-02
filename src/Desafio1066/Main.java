package Desafio1066;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int[] valoresInteiros = new int[] {
				sc.nextInt(),
				sc.nextInt(),
				sc.nextInt(),
				sc.nextInt(),
				sc.nextInt()
		};
		
		int quantidadeDePares = 0,
			quantidadeDeImpares = 0,
			quantidadeDePositivos = 0,
			quantidadeDeNegativos = 0;
		
		
		for (int i = 0; i < valoresInteiros.length; i++) {
			boolean isPar = valoresInteiros[i] % 2 == 0;
			if(isPar) {
				quantidadeDePares++;
			}else {
				quantidadeDeImpares++;
			}
			boolean isPositivo = valoresInteiros[i] > 0;
			boolean isNulo = valoresInteiros[i] == 0;
			if(isPositivo) {
				quantidadeDePositivos++;
			}else if(!isPositivo && !isNulo ) {
				quantidadeDeNegativos++;
			}
		}
		
		System.out.println(String.format("%d valor(es) par(es)", quantidadeDePares));
		System.out.println(String.format("%d valor(es) impar(es)", quantidadeDeImpares));
		System.out.println(String.format("%d valor(es) positivo(s)", quantidadeDePositivos));
		System.out.println(String.format("%d valor(es) negativo(s)", quantidadeDeNegativos));
		
		sc.close();
	}
}
