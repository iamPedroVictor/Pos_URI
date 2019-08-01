package Desafio1011;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.000");
		
		double raio = sc.nextDouble();
		double volumeEsfera = CalcularRaioEsfera(raio);
		
		System.out.println("VOLUME = " + df.format(volumeEsfera));
		sc.close();
		
	}
	
	public static double CalcularRaioEsfera(double raio) {
		double pi = 3.14159;
		
		return ((4.0/3) * pi * Math.pow(raio, 3));
	}

}
