package Desafio1035;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] dataLine = sc.nextLine().split(" ");
		int 	A = Integer.parseInt(dataLine[0]),
				B = Integer.parseInt(dataLine[1]),
				C = Integer.parseInt(dataLine[2]),
				D = Integer.parseInt(dataLine[3]);
		sc.close();
		boolean isBMaiorC_DMaiorA = (B > C && D > A) ? true : false;
		boolean isCMaisDMaiorAMaisB = ((C + D) > (A + B)) ? true : false;
		boolean isCDPositivos = (C > 0 && D > 0) ? true : false;
		boolean isAPar = (A % 2 == 0) ? true : false;
		
		if(isBMaiorC_DMaiorA && isCMaisDMaiorAMaisB && isCDPositivos && isAPar) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
	}
}
