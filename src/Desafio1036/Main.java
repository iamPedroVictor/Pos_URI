package Desafio1036;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.00000");
		
		String[] dataLine = sc.nextLine().split(" ");
		sc.close();
		
		double	A = Double.parseDouble(dataLine[0]),
				B = Double.parseDouble(dataLine[1]),
				C = Double.parseDouble(dataLine[2]);
		double[] raizes = Bhaskara(A, B, C);
		
		if(A != 0 && Delta(A,B,C) > 0) {			
			System.out.println("R1 = " + df.format(raizes[0]));
			System.out.println("R2 = " + df.format(raizes[1]));
		}else {
			System.out.println("Impossivel calcular");
		}

	}
	
	public static double Delta(double a, double b, double c) {
		double pow = Math.pow(b, 2);
		return pow - 4*a*c;
	}
	
	public static double[] Bhaskara(double a, double b, double c) {
		double raizA = (-b + Math.sqrt(Delta(a,b,c))) / (2*a);
		double raizB = (-b - Math.sqrt(Delta(a,b,c))) / (2*a);
		
		return new double[] {raizA,raizB};
	}
}
