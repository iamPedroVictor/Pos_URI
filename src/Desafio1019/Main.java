package Desafio1019;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoDuracaoSegundos = sc.nextInt();
		sc.close();
		String stringHoraMinutoSegundo = ConverterHoraMinutoSegundo(tempoDuracaoSegundos);
		System.out.println(stringHoraMinutoSegundo);
		
	}

	private static String ConverterHoraMinutoSegundo(int tempoDuracaoSegundos) {
		// TODO Auto-generated method stub
		int horasEmSegundos = 3600;
		int minutosEmSegundos = 60;
		
		int horas = tempoDuracaoSegundos / horasEmSegundos;
		int minutos = (tempoDuracaoSegundos - (horas * horasEmSegundos)) / minutosEmSegundos;
		int segundos = (int)tempoDuracaoSegundos % minutosEmSegundos;
		return horas + ":" + minutos + ":" + segundos;
	}

}
