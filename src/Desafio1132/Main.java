package Desafio1132;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int		valorX = sc.nextInt(),
				valorY = sc.nextInt();
		
		if(valorX > valorY) {
			int temp = valorX;
			valorX = valorY;
			valorY = temp;
		}
		
		int soma = 0;
		
		for(int i = valorX; i <= valorY; i++) {
			if(i % 13 != 0) {
				soma+=i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
