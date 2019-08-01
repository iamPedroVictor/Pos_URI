package Desafio1018;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valorReais = sc.nextInt();
		String[] quantidadeDeNotas = DecomporEmNotas(valorReais);
		
		System.out.println(valorReais);
		for(String notas : quantidadeDeNotas) {
			System.out.println(notas);
		}
		sc.close();
	}
	
	public static String[] DecomporEmNotas(int valor) {
		
		int notasDe100 = valor / 100;
		valor -= notasDe100 * 100;
		int notasDe50 = valor/50;
		valor -= notasDe50 * 50;
		int notasDe20 = valor/20;
		valor -= notasDe20 * 20;
		int notasDe10 = valor/10;
		valor -= notasDe10 * 10;
		int notasDe5 = valor/5;
		valor -= notasDe5 * 5;
		int notasDe2 = valor/2;
		valor -= notasDe2 * 2;
		int notasDe1 = valor;
		
		return new String[]{
				notasDe100 + " nota(s) de R$ 100,00",
				notasDe50 + " nota(s) de R$ 50,00",
				notasDe20 + " nota(s) de R$ 20,00",
				notasDe10 + " nota(s) de R$ 10,00",
				notasDe5 + " nota(s) de R$ 5,00",
				notasDe2 + " nota(s) de R$ 2,00",
				notasDe1 + " nota(s) de R$ 1,00"
		};
	}
	

}
