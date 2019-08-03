package Desafio1149;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] dataLine = sc.nextLine().split(" ");
		int A = Integer.parseInt(dataLine[0]);
		int N = Integer.parseInt(dataLine[dataLine.length-1]);
		
		int soma = 0;
		
		for (int i = 0; i <= N - 1; i++) {
			soma += (A + i);
		}
		System.out.println(soma);
		sc.close();
	}
}
