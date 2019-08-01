package Desafio1009;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		String vendendorNome;
		double salarioFixo, totalVendas;
		
		df.applyPattern("0.00");
		
		vendendorNome = sc.nextLine();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		
		double salarioFinal = CalcularSalario(salarioFixo, totalVendas);

		System.out.println("TOTAL = R$ " + df.format(salarioFinal));
		sc.close();
	}
	
	public static double CalcularSalario(double salarioFixo, double totalVendas) {
		double comissaoPorcentagem = 0.15;
		
		return salarioFixo + (comissaoPorcentagem * totalVendas);
	}
	

}
