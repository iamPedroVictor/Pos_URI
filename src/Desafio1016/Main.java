package Desafio1016;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distanciaKm = sc.nextInt();
		int tempoEmMinutosParaAtingirADistancia = CalcularTempoNecessarioDistancia(distanciaKm);
		
		System.out.println(tempoEmMinutosParaAtingirADistancia + " minutos");
		sc.close();
		
	}
	
	public static int CalcularTempoNecessarioDistancia(int distancia) {
		int		carroXVelocidade = 60,
				carroYVelocidade = 90;
		
		int kmPorMinuto = 60 / Math.abs(carroXVelocidade-carroYVelocidade);
		
		return kmPorMinuto * distancia;
	}

}
