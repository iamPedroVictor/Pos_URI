package Desafio1172;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[10];
		
		for (int i = 0; i < X.length; i++) {
			X[i] = sc.nextInt();
		}
		
		for (int i = 0; i < X.length; i++) {
			if(X[i] == 0 || X[i] < 0) {
				X[i] = 1;
			}
		}
		
		for (int i = 0; i < X.length; i++) {
			System.out.println(String.format("X[%d] = %d", i, X[i]));
		}
		
		sc.close();
	}
}