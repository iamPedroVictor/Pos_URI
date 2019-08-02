package Desafio1047;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	private static final int umDiaEmHoras = 24;
	private static final int umaHoraEmMinutos = 60;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] dataLine = sc.nextLine().split(" ");
		
		int horaInicial = Integer.parseInt(dataLine[0]),
				minutoInicial = Integer.parseInt(dataLine[1]),
				horaFinal = Integer.parseInt(dataLine[2]),
				minutoFinal = Integer.parseInt(dataLine[3]);	
		
		int[] duracaoDoJogo = CalcularDuracaoJogo(horaInicial, minutoInicial, horaFinal, minutoFinal);
		
		System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracaoDoJogo[0], duracaoDoJogo[1]));
		sc.close();
	}

	private static int[] CalcularDuracaoJogo(int horaInicial, int minutoInicial, int horaFinal, int minutoFinal) {
		int[] duracaoDoJogo = new int[2];
		if(horaInicial == minutoFinal && horaFinal == minutoFinal && minutoFinal == minutoInicial) {
			duracaoDoJogo[1] = minutoInicial - minutoFinal;
			duracaoDoJogo[0] = umDiaEmHoras + horaInicial - horaFinal;
		}else if(horaInicial == horaFinal && minutoFinal > minutoInicial) {
			duracaoDoJogo[1] = minutoFinal - minutoInicial;
			duracaoDoJogo[0] = horaInicial - horaFinal;
		}else if(horaInicial == horaFinal && minutoInicial > minutoFinal) {
			duracaoDoJogo[1] = umaHoraEmMinutos - minutoInicial + minutoFinal;
			duracaoDoJogo[0] = umDiaEmHoras - horaInicial + horaFinal - 1;
		}else if(minutoInicial == minutoFinal && horaInicial < horaFinal) {
			duracaoDoJogo[1] = 0;
			duracaoDoJogo[0] = horaFinal - horaInicial;
		}else if(minutoInicial == minutoFinal && horaInicial > horaFinal) {
			duracaoDoJogo[1] = 0;
			duracaoDoJogo[0] = umDiaEmHoras - horaInicial + horaFinal;
		}else if(horaFinal > horaInicial && minutoFinal > minutoInicial) {
			duracaoDoJogo[1] = minutoFinal - minutoInicial;
			duracaoDoJogo[0] = horaFinal - horaInicial;
		}else if(horaInicial < horaFinal && minutoInicial > minutoFinal) {
			duracaoDoJogo[1] = umaHoraEmMinutos - minutoInicial + minutoFinal;
			duracaoDoJogo[0] = horaFinal - horaInicial - 1;
		}else if(horaInicial > horaFinal && minutoInicial < minutoFinal) {
			duracaoDoJogo[1] = minutoFinal - minutoInicial;
			duracaoDoJogo[0] = umDiaEmHoras - horaInicial - 1 + horaFinal;
		}else if(horaInicial > horaFinal && minutoInicial > minutoFinal) {
			duracaoDoJogo[1] = umaHoraEmMinutos + minutoFinal - minutoInicial;
			duracaoDoJogo[0] = umDiaEmHoras + horaFinal - horaInicial - 1;
		}
		return duracaoDoJogo;
	}
}
