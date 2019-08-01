package Desafio1013;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] dataInput = sc.nextLine().split(" ");
		
		int	valor1 = Integer.parseInt(dataInput[0]),
			valor2 = Integer.parseInt(dataInput[1]),
			valor3 = Integer.parseInt(dataInput[2]);
		
		int maiorValor = MaiorAB(MaiorAB(valor1, valor2),valor3);
		
		System.out.println(maiorValor + " eh o maior");
		sc.close();
		
	}
	
	public static int MaiorAB(int ValorA, int ValorB) {
		return (ValorA + ValorB + Math.abs(ValorA - ValorB))/2;
	}

}
