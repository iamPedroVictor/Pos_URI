package Desafio1015;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.0000");
		
		String[]	pontoA = sc.nextLine().split(" "),
					pontoB = sc.nextLine().split(" ");
		
		double distanciaPontos = CalcularDistanciaEntrePontos(pontoA, pontoB);
		
		System.out.println(df.format(distanciaPontos));
		sc.close();
				
	}
	
	public static double CalcularDistanciaEntrePontos(String[] ponto1, String[] ponto2) {
		return Math.sqrt(Produto(ponto1[0], ponto2[0]) + Produto(ponto1[1], ponto2[1]));
	}
	
	public static double Produto(String PontoA, String PontoB) {		
		return Math.pow( Double.parseDouble(PontoB) - Double.parseDouble(PontoA) , 2);
	}

}
