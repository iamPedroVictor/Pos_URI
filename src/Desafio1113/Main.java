package Desafio1113;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int[] paresLido = new int[] {
				sc.nextInt(),
				sc.nextInt()
		};
		boolean iguais = false;
		
		while(!iguais) {
			if(paresLido[0] < paresLido[1]) {
				System.out.println("Crescente");
			}else {
				System.out.println("Decrescente");
			}
			paresLido = new int[] {
					sc.nextInt(),
					sc.nextInt()
			};
			
			iguais = (paresLido[0] == paresLido[1]);
		}
		sc.close();
	}
}
