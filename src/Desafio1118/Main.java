package Desafio1118;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int validadas = 0;
		int continuar = 0;
		double[] notasValidas = new double[2];
		
		do {
			validadas = 0;
			while(validadas < 2) {
				 double notaAvaliacao = sc.nextDouble();
				 if(notaAvaliacao < 0.0 || notaAvaliacao > 10.0) {
					 System.out.println("nota invalida");
					 continue;
				 }
				 notasValidas[validadas] = notaAvaliacao;
				 validadas++;
			}
			double media = (notasValidas[0] + notasValidas[1]) / 2;
			System.out.println("media = " + df.format(media));
			continuar = 0;
			while(continuar < 1 || continuar > 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				continuar = sc.nextInt();
			}
			
		} while (continuar != 2);
		
		sc.close();
	}
}