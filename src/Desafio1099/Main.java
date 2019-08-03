package Desafio1099;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valorN = sc.nextInt();		
		for (int i = 0; i < valorN; i++) {
			int valorX = sc.nextInt();
			int valorY = sc.nextInt();
			int somaImpares = 0;
 
			if(valorX > valorY) {
				int temp = valorY;
				valorY = valorX;
				valorX = temp;
			}
			for(int y = valorX+1; y < valorY; y++) {
				if(y % 2 != 0) 
					somaImpares += y;
			}
			System.out.println(somaImpares);
		}
		sc.close();
	}
}
