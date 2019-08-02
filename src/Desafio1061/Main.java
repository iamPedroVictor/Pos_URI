package Desafio1061;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final int posicaoDia = 0;
	private static final int posicaoHora = 1;
	private static final int posicaoMinuto = 2;
	private static final int posicaoSegundo = 3;

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] dataHoraInicio = new int[4];
		int[] dataHoraFim = new int[4];
		int[] dataHoraDuracao = new int[4];
		
		String s = sc.next();
		dataHoraInicio[posicaoDia] = sc.nextInt();
		dataHoraInicio[posicaoHora] = sc.nextInt();
		s = sc.next();
		dataHoraInicio[posicaoMinuto] = sc.nextInt();
		s = sc.next();
		dataHoraInicio[posicaoSegundo] = sc.nextInt();
		
		s = sc.next();
		dataHoraFim[posicaoDia] = sc.nextInt();
		dataHoraFim[posicaoHora] = sc.nextInt();
		s = sc.next();
		dataHoraFim[posicaoMinuto] = sc.nextInt();
		s = sc.next();
		dataHoraFim[posicaoSegundo] = sc.nextInt();
		
		int minutoEmSegundos = 60;
		int horaEmSegundos = minutoEmSegundos * minutoEmSegundos;
		int umDiaEmSegundos = 24 * horaEmSegundos;
		int inicioEvento = TransformaDiaParaSegundos(dataHoraInicio, umDiaEmSegundos) 
				+ TransformaParaSegundos(dataHoraInicio[posicaoHora], horaEmSegundos)
				+ TransformaParaSegundos(dataHoraInicio[posicaoMinuto], minutoEmSegundos)
				+ dataHoraInicio[posicaoSegundo];
		int finalEvento = TransformaDiaParaSegundos(dataHoraFim, umDiaEmSegundos)
				+ TransformaParaSegundos(dataHoraFim[posicaoHora], horaEmSegundos)
				+ TransformaParaSegundos(dataHoraFim[posicaoMinuto], minutoEmSegundos)
				+ dataHoraFim[posicaoSegundo];
		
		int duracao = finalEvento - inicioEvento;
		
		dataHoraDuracao[posicaoDia] = duracao/umDiaEmSegundos;
		int resto = duracao % umDiaEmSegundos;
		dataHoraDuracao[posicaoHora] = resto / horaEmSegundos;
		resto = resto % horaEmSegundos;
		dataHoraDuracao[posicaoMinuto] = resto / minutoEmSegundos;
		dataHoraDuracao[posicaoSegundo] = resto % minutoEmSegundos;
		
		System.out.println(String.format("%d dia(s)", dataHoraDuracao[posicaoDia]));
		System.out.println(String.format("%d hora(s)", dataHoraDuracao[posicaoHora]));
		System.out.println(String.format("%d minuto(s)", dataHoraDuracao[posicaoMinuto]));
		System.out.println(String.format("%d segundo(s)", dataHoraDuracao[posicaoSegundo]));
		
		sc.close();
		System.exit(0);
	}

	private static int TransformaParaSegundos(int tempo, int constanteSegundos) {
		return tempo * constanteSegundos;
	}

	private static int TransformaDiaParaSegundos(int[] dataHora, int umDiaEmSegundos) {
		return (dataHora[posicaoDia] - 1) * umDiaEmSegundos;
	}
}
