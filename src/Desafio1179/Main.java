package Desafio1179;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] par = new int[5];
		int[] impar = new int[5];
		int[] posicoes = new int[] {0,0};
		for(int i = 0; i < 15; i++) {
			int n = sc.nextInt();
			if(n % 2 == 0) {
				par[posicoes[0]] = n;
				posicoes[0]++;
			}else {
				impar[posicoes[1]] = n;
				posicoes[1]++;
			}
			
			if(posicoes[0] == 5) {
				ImprimirVetor(par, posicoes[0]);
				posicoes[0] = 0;
			}else if(posicoes[1] == 5) {
				ImprimirVetor(impar, posicoes[1]);
				posicoes[1] = 0;
			}			
		}
		ImprimirVetor(impar, posicoes[1]);
		ImprimirVetor(par, posicoes[0]);
		
		sc.close();
	}
	
	public static void ImprimirVetor(int[] vetor, int posicao) {
		String message = vetor[0] % 2 == 0 ? "par[" : "impar[";
		for (int i = 0; i < posicao; i++) {
			System.out.println(message + i + "] = " + vetor[i]);
		}
	}
}
