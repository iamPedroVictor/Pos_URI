package Desafio1165;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int y = 0;
			int x = sc.nextInt();
			for (int j = 1; j <= x; j++) {
				if(x%j==0) {
					y++;
				}
			}
			if(y == 2) {
				System.out.println(String.format("%d eh primo", x));
			}else {
				System.out.println(String.format("%d nao eh primo", x));
			}
			
		}
		
		sc.close();
	}
}