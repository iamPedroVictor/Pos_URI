package Desafio1175;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[20];
		for(int i = 0; i < 20; i++) {
			vetor[i] = sc.nextInt();
		}
		
		int inicio = -1, fim = 20;
		
		while(inicio != 9 && fim != 10) {
			inicio++;
			fim--;
			int temp = vetor[fim];
			vetor[fim] = vetor[inicio];
			vetor[inicio] = temp;
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(String.format("N[%d] = %d", i, vetor[i]));
		}
		
		sc.close();
	}
}