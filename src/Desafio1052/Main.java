package Desafio1052;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final String[] mesesLista = new String[] {
			"January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"
	}; 

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int mesNumero = sc.nextInt();
		
		System.out.println(mesesLista[mesNumero-1]);
		
		sc.close();
	}
}
