package Desafio1008;
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
		
		int funcionario_numero, horas_trabalhadas;
		double valor_hora;
		
		funcionario_numero = sc.nextInt();
		horas_trabalhadas = sc.nextInt();
		valor_hora = sc.nextDouble();
		
		double salario = horas_trabalhadas * valor_hora;
		
		System.out.println("NUMBER = " + funcionario_numero);
		System.out.println("SALARY = U$ " + df.format(salario));
		sc.close();
	}

}