package Desafio1051;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.00");
	
		double valorSalario = sc.nextDouble();
		double valorImposto = 0;
		
		if(valorSalario <= 2000.0) {
			valorImposto = 0;
		}else if(valorSalario <= 3000.00) {
			valorImposto = (valorSalario - 2000.0) * 0.08;
		}else if(valorSalario <= 4500.0) {
			valorImposto = (valorSalario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}else{
			valorImposto = (valorSalario - 4500.0) * 0.28 + 1500.00 * 0.18 + 1000.0 * 0.08;
		}
		
		if(valorImposto == 0.0) {
			System.out.println("Isento");
		}else {
			System.out.println("R$ " + df.format(valorImposto));
		}
		
		sc.close();
	}
}
