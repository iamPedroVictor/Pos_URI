package Desafio1048;

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
	
		double salario = sc.nextDouble();
		double novoSalario = 0;
		double reajusteSalarial = 0;
		int percentualDeAjuste = 0;
		
		if(salario >= 0.00 && salario <= 400.00) {
			percentualDeAjuste = 15;
			reajusteSalarial = salario * (percentualDeAjuste/100.00);
			novoSalario = salario + reajusteSalarial;
		}else if(salario >= 400.01 && salario <= 800.00) {
			percentualDeAjuste = 12;
			reajusteSalarial =  salario * (percentualDeAjuste/100.00);
			novoSalario = salario + reajusteSalarial;
		}else if(salario >= 800.01 && salario <= 1200.00) {
			percentualDeAjuste = 10;
			reajusteSalarial = salario * (percentualDeAjuste/100.00);
			novoSalario = salario + reajusteSalarial;
		}else if(salario >= 1200.01 && salario <= 2000.00) {
			percentualDeAjuste = 7;
			reajusteSalarial = salario * (percentualDeAjuste/100.00);
			novoSalario = salario + reajusteSalarial;
		}else if(salario >= 2000.01) {
			percentualDeAjuste = 4;
			reajusteSalarial = salario * (percentualDeAjuste/100.00);
			novoSalario = salario + reajusteSalarial;
		}
		
		System.out.println("Novo salario: " + df.format(novoSalario));
		System.out.println("Reajuste ganho: " + df.format(reajusteSalarial));
		System.out.println("Em percentual: " + percentualDeAjuste + " %");
		
		sc.close();
	}
}