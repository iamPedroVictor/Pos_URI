package Desafio1150;

import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Z = 0;
		do {
			Z = sc.nextInt();
		} while (Z <= X);
		
		int count = 1;
		int soma = X;
		
		while(soma < Z) {
			soma += (X + count);
			count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}