package Desafio1046;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final int umDiaEmHoras = 24;

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] dataLine = sc.nextLine().split(" ");
		int	horaInicial = Integer.parseInt(dataLine[0]),
				horaFinal = Integer.parseInt(dataLine[1]);
		int duracaoJogoHoras = 0;
		if(horaInicial == horaFinal) {
			duracaoJogoHoras = umDiaEmHoras;
		}else if(horaInicial < horaFinal) {
			duracaoJogoHoras = horaFinal - horaInicial;
		}else if(horaInicial > horaFinal) {
			duracaoJogoHoras = (umDiaEmHoras - horaInicial) + horaFinal;
		}
		
		System.out.println(String.format("O JOGO DUROU %d HORA(S)", duracaoJogoHoras));
		
		sc.close();
	}
}
