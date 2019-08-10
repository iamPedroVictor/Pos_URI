package Desafio1160;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int T, PA, PB, cont = 0;
		
		double G1, G2;
		
		T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			PA = sc.nextInt();
			PB = sc.nextInt();
			G1 = sc.nextDouble();
			G2 = sc.nextDouble();
			
			while(PA <= PB) {
				PA += (PA * G1 / 100);
				PB += (PB * G2 / 100);
				cont++;
				if(cont > 100) {
					System.out.println("Mais de 1 seculo.");
					PA = 2;
					PB = 1;
				}
				
			}
			
			if(cont <= 100) {
				System.out.println(String.format("%d anos.", cont));
			}
			cont = 0;
		}	
		
		sc.close();
	}
}