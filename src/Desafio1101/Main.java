package Desafio1101;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean numeroNuloNegativo = false;
		int[] parLido = new int[] {
				sc.nextInt(),
				sc.nextInt()
		};
		
		while(!numeroNuloNegativo) {
			if(parLido[0] > parLido[1]) {
				int temp = parLido[1];
				parLido[1] = parLido[0];
				parLido[0] = temp;
			}
			int soma = 0;
			for(int inicio = parLido[0]; inicio <= parLido[1]; inicio++) {
				System.out.print(inicio + " ");
				soma += inicio;
			}
			System.out.println("Sum=" + soma);
			parLido = new int[] {
					sc.nextInt(),
					sc.nextInt()
			};
			numeroNuloNegativo = (parLido[0] <= 0) || (parLido[1] <= 0);			
		}
		
		sc.close();
	}
}
