package Desafio1094;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final String mensagemTotalTemplate = "Total: %d cobaias\nTotal de coelhos: %d\nTotal de ratos: %d\nTotal de sapos: %d";
	
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		int nCasos = sc.nextInt();
		int	totalCobaias = 0,
			totalCoelhos = 0,
			totalRatos = 0,
			totalSapos = 0;
		
		for(int i = 0; i < nCasos; i++) {
			int quantia = sc.nextInt();
			String tipo = sc.next();
			totalCobaias += quantia;
			if(tipo.equalsIgnoreCase("R")) {
				totalRatos += quantia;
			}else if(tipo.equalsIgnoreCase("S")) {
				totalSapos += quantia;
			}else if(tipo.equalsIgnoreCase("C")) {
				totalCoelhos += quantia;
			}
		}
		
		System.out.println(String.format(mensagemTotalTemplate, totalCobaias, totalCoelhos, totalRatos, totalSapos));
		
		double[] percentualCobaias = new double[3]; 
		
		percentualCobaias[0] = (totalCoelhos * 100.00) / totalCobaias;
		percentualCobaias[1] = (totalRatos * 100.00) / totalCobaias;
		percentualCobaias[2] = (totalSapos * 100.00) / totalCobaias;
		
		System.out.println("Percentual de coelhos: " + df.format(percentualCobaias[0]) + " %");
		System.out.println("Percentual de ratos: " + df.format(percentualCobaias[1]) + " %");
		System.out.println("Percentual de sapos: " + df.format(percentualCobaias[2]) + " %");
		
		sc.close();
	}
}
