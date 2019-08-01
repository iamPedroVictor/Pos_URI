package Desafio1017;

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
		int consumoMedioCarroKmPorL = 12;
		int tempoGastoViagemEmHoras = sc.nextInt(),
				velocidadeMediaEmKmH = sc.nextInt();
		
		double distanciaViagemKm = CalcularKmPecorridoNaViagem(tempoGastoViagemEmHoras, velocidadeMediaEmKmH);
		double gasolinaGastaNaViagem = CalcularGasolinaGasta(distanciaViagemKm, consumoMedioCarroKmPorL);
		System.out.println(df.format(gasolinaGastaNaViagem));
		sc.close();
		
	}
	
	public static double CalcularKmPecorridoNaViagem(int horasViagem, int velocidadeMedia) {
		int kmPecorrido = velocidadeMedia * horasViagem;
		return kmPecorrido;
	}
	
	public static double CalcularGasolinaGasta(double distanciaKm, double consumoMedio) {
		return distanciaKm / consumoMedio;
	}

}
