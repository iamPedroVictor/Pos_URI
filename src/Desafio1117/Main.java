package Desafio1117;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int contadorNotasValidas = 0;
		double[] notasValidas = new double[2];
		
		while(contadorNotasValidas != 2) {
			double nota = sc.nextDouble();
			if(nota >= 0.0 && nota <= 10.0) {
				notasValidas[contadorNotasValidas] = nota;
				contadorNotasValidas++;
			}else {
				System.out.println("nota invalida");
			}
		}
		
		double media = (notasValidas[0] + notasValidas[1]) / 2;
		System.out.println("media = " + df.format(media));
		sc.close();
	}
}
