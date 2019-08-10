package Desafio1176;

import java.text.DecimalFormat;
import java.util.Locale;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static final int arrayTamanho = 100;

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		long primeiro = 0, segundo = 1, next = 0;
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++, primeiro = 0, segundo = 1) {
			long n = sc.nextLong();
			n = n + 1;
			for (int j = 0; j < n; j++) {
				if(j <= 1) {
					next = j;					
				}else {
					next = primeiro + segundo;
					primeiro = segundo;
					segundo = next;
				}
			}
			System.out.println(String.format("Fib(%d) = %d", n-1, next));
		}
		
		sc.close();
	}
}