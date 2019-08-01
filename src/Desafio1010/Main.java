package Desafio1010;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat();
		
		df.applyPattern("0.00");
		
		String peca1 = sc.nextLine();
		String peca2 = sc.nextLine();
		
		double totalPagar = CalcularTotal(peca1, peca2);;
		sc.close();
		System.out.println("VALOR A PAGAR: R$ " + df.format(totalPagar));
		
	}
	
	public static double CalcularTotal(String objeto1, String objeto2) {
		String[] peca1 = objeto1.split(" ");
		String[] peca2 = objeto2.split(" ");
		
		double total = (Integer.parseInt(peca1[1]) * Double.parseDouble(peca1[2])) + (Integer.parseInt(peca2[1]) * Double.parseDouble(peca2[2]));
		return total;
	}
}
