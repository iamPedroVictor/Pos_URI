package Desafio1146;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x != 0) {
			for(int i = 1; i <= x; i++) {
				if(i == x) {
					System.out.println(i);
				}else {
					System.out.print(i + " ");
				}
			}
			x = sc.nextInt();
		}
		
		sc.close();
	}
}