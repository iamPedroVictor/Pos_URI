package Desafio1133;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valorX = sc.nextInt(),
				valorY = sc.nextInt();
		
		if(valorX > valorY) {
			int temp = valorX;
			valorX = valorY;
			valorY = temp;
		}
		
		for(int i = valorX + 1; i < valorY; i++) {
			if(i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
