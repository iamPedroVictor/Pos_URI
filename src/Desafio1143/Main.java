package Desafio1143;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int linhas = sc.nextInt();
		
		for (int i = 1; i <= linhas; i++) {
			System.out.println(i+ " " + i * i + " " + i * i * i);
		}
		
		sc.close();
	}
}
