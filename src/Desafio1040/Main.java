package Desafio1040;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(".0");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		
		String[] dataLine = sc.nextLine().split(" ");
		
		float	N1 = Float.parseFloat(dataLine[0]),
				N2 = Float.parseFloat(dataLine[1]),
				N3 = Float.parseFloat(dataLine[2]),
				N4 = Float.parseFloat(dataLine[3]);
		float media = CalcularMedia(N1, N2, N3, N4);
		
		System.out.println("Media: " + df.format(media));
		ClassificarNota(sc, df, media);
		sc.close();
	}

	private static void ClassificarNota(Scanner sc, DecimalFormat df, float media) {
		if(media >= 7.0f) {
			System.out.println("Aluno aprovado.");
		}else if(media < 5.0f) {
			System.out.println("Aluno reprovado.");
		}else {
			RealizarExame(sc, df, media);
		}
	}

	private static void RealizarExame(Scanner sc, DecimalFormat df, float media) {
		System.out.println("Aluno em exame.");
		float notaDoExame = sc.nextFloat();
		System.out.println("Nota do exame: " + df.format(notaDoExame));
		float mediaFinal = (notaDoExame + media)/2f;
		if(mediaFinal >= 5.0f) {
			System.out.println("Aluno aprovado.");
		}else {
			System.out.println("Aluno reprovado.");
		}
		System.out.println("Media final: " + df.format(mediaFinal));
	}

	private static float CalcularMedia(float N1, float N2, float N3, float N4) {
		return ((N1 * 2.0f) + (N2 * 3.0f) + (N3 * 4.0f) + (N4 * 1.0f))/ 10f;
	}
}
