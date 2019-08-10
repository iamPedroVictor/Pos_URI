package Desafio1177;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		if(t >= 2 && t <= 50) {
			for (int i = 0; i < 100; i++) {
				System.out.println(String.format("N[%d] = %d", i, i%t));
			}
		}
		sc.close();
	}
}
