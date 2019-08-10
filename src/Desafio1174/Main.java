package Desafio1174;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	private static final int arrayTamanho = 100;

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double[] A = new double[arrayTamanho];
		for(int i = 0; i < arrayTamanho; i++) {
			A[i] = sc.nextDouble();
		}
		for (int i = 0; i < A.length; i++) {
			if(A[i] <= 10) {
				System.out.println(String.format("A[%d] = ", i) + df.format(A[i]) );
			}
		}
		sc.close();
	}
}