package Desafio1059;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0)
				continue;
			System.out.println(i);
		}
		sc.close();
	}
}
