package Desafio1155;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double a = 0;
		double result = 0;
		
		for (int i = 1; i <= 100; i++) {
			a = (double) 1/i;
			result += a;
		}
		
		System.out.println(df.format(result));
		
		sc.close();
	}
}