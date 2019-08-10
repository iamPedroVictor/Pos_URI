package Desafio1154;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int total = 0,
				count = 0;
		double media = 0;
		int idade = sc.nextInt(); 
		do {
			total += idade;
			count++;
			idade = sc.nextInt();
		} while (idade > 0);
		
		media = (double) total/count;
		System.out.println(df.format(media));
		
		sc.close();
	}
}