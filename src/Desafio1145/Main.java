package Desafio1145;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int valorX = sc.nextInt();
		int valorY = sc.nextInt();
		
		int count = 0;
		int i = 0;
		while(i < valorY) {
			i++;
			count++;
			System.out.print(i);
			if(count == valorX) {
				count = 0;
				System.out.println("");
			}else {
				System.out.print(" ");
			}
		}
		
		sc.close();
	}
}
