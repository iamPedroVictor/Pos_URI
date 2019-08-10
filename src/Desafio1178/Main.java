package Desafio1178;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final int vetorTamanho = 100;

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double[] vetor = new double[vetorTamanho];
		
		vetor[0] = sc.nextDouble();
		
		
		for(int i = 1; i < vetor.length; i++) {
			vetor[i] = vetor[i-1] / 2;
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("N[" + i + "] = " + df.format(vetor[i]));
		}
		
		sc.close();
	}
}
