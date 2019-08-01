package Desafio1021;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valorReais = sc.nextDouble();
		sc.close();
		String[] notasEMoedas = DecomporReais(valorReais);
		
		System.out.println("NOTAS:");
		for(String quantidadeMinima : notasEMoedas) {
			System.out.println(quantidadeMinima);
		}
	}


	private static String[] DecomporReais(double valorReais) {
		
		int notasDe100 =(int)(valorReais / 100);
		valorReais -= notasDe100 * 100;
		int notasDe50 = (int)(valorReais/50);
		valorReais -= notasDe50 * 50;
		int notasDe20 = (int)(valorReais/20);
		valorReais -= notasDe20 * 20;
		int notasDe10 = (int)(valorReais/10);
		valorReais -= notasDe10 * 10;
		int notasDe5 = (int)(valorReais/5);
		valorReais -= notasDe5 * 5;
		int notasDe2 = (int)(valorReais/2);
		valorReais -= notasDe2 * 2;
		
		int moedasDe1 = (int)(valorReais/1);
		valorReais -= moedasDe1;
		int moedasDe50 = (int)(valorReais/0.50);
		valorReais -= moedasDe50 * 0.50;
		int moedasDe25 = (int)(valorReais/0.25);
		valorReais -= moedasDe25 * 0.25;
		int moedasDe10 = (int)(valorReais/0.10);
		valorReais -= moedasDe10 * 0.10;
		int moedasDe05 = (int)(valorReais/0.05);
		valorReais -= moedasDe05 * 0.05;
		BigDecimal bd = new BigDecimal(valorReais).setScale(2, RoundingMode.HALF_EVEN);
		int moedasDe01 = (int)(bd.doubleValue()/0.01);
		
		return new String[]{
				notasDe100 + " nota(s) de R$ 100.00",
				notasDe50 + " nota(s) de R$ 50.00",
				notasDe20 + " nota(s) de R$ 20.00",
				notasDe10 + " nota(s) de R$ 10.00",
				notasDe5 + " nota(s) de R$ 5.00",
				notasDe2 + " nota(s) de R$ 2.00",
				"MOEDAS:",
				moedasDe1 + " moeda(s) de R$ 1.00",
				moedasDe50 + " moeda(s) de R$ 0.50",
				moedasDe25 + " moeda(s) de R$ 0.25",
				moedasDe10 + " moeda(s) de R$ 0.10",
				moedasDe05 + " moeda(s) de R$ 0.05",
				moedasDe01 + " moeda(s) de R$ 0.01",
		};
	}

}
