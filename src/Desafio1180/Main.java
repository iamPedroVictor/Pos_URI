package Desafio1180;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int menorValor = 0,
				posicao = 0;
		
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		
		for (int i = 0; i < X.length; i++) {
			if(X[i] < menorValor) {
				menorValor = X[i];
				posicao = i;
			}
		}
		
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Posicao: " + posicao);
		
		sc.close();
	}
}