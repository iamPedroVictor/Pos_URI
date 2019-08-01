package Desafio1014;

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
		
		int X = sc.nextInt(); //Distancia Total Pecorrida Km
		double Y = sc.nextDouble(); //Total Combustivel Gasto
		
		double consumoMedio = ConsumoMedio(X, Y);
		
		System.out.println(df.format(consumoMedio) + " km/l");
		sc.close();
		
	}
	
	public static double ConsumoMedio(int distanciaPecorrida, double combustivelGasto) {
		return distanciaPecorrida/combustivelGasto;
	}

}
