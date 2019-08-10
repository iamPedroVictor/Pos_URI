package Desafio1173;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int[] vetor = new int[10];
		vetor[0] = x;
		for (int i = 1; i < vetor.length; i++) {
			vetor[i] = vetor[i - 1] * 2; 
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("N[" + i +"] = " + vetor[i]);
		}
		sc.close();
	}
}
