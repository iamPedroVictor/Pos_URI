package Desafio1079;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final int PesoValor1 = 2;
	private static final int PesoValor2 = 3;
	private static final int PesoValor3 = 5;

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		int casos = Integer.parseInt(sc.nextLine());
		double[] medias = new double[casos];
		
		for(int i = 0; i < casos; i++) {
			String[] s = sc.nextLine().split(" ");
			double[] valores = ConfigurarValores(s);
			
			CalcularMedias(medias, i, valores);
		}
		
		ImprimirMedias(df, medias);		
				
		sc.close();
	}

	private static double[] ConfigurarValores(String[] string) {
		double[] valores = new double[3];
		valores[0] = Double.parseDouble(string[0]);
		valores[1] = Double.parseDouble(string[1]);
		valores[2] = Double.parseDouble(string[2]);
		return valores;
	}

	private static void CalcularMedias(double[] arrayResultado, int posicao, double[] arrayValores) {
		arrayResultado[posicao] = ((arrayValores[0] * PesoValor1)
				+ (arrayValores[1] * PesoValor2)
				+ (arrayValores[2] * PesoValor3))
				/ (PesoValor1 + PesoValor2 + PesoValor3);
	}

	private static void ImprimirMedias(DecimalFormat df, double[] medias) {
		for(double media : medias) {
			System.out.println(df.format(media));
		}
	}
}
