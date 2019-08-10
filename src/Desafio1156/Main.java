package Desafio1156;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double a, b = 1, c, S = 0;
		for (a = 1; a <= 39; a += 2) {
			c = a/b;
			S += c;
			b *= 2;
		}
		
		System.out.println(df.format(S));
		
		sc.close();
	}
}