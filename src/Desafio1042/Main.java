package Desafio1042;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] dataLine = sc.nextLine().split(" ");
		int[] numerosInteiros = new int[] {
				Integer.parseInt(dataLine[0]),
				Integer.parseInt(dataLine[1]),
				Integer.parseInt(dataLine[2])
		};
		SortNumber(numerosInteiros);
		
		ImprimirTela(dataLine, numerosInteiros);
		
		sc.close();
	}

	private static void ImprimirTela(String[] dataLine, int[] numerosInteiros) {
		for(int numero : numerosInteiros) {
			System.out.println(numero);
		}
		System.out.println("");
		for(String numeroOriginal : dataLine) {
			System.out.println(numeroOriginal);
		}
	}

	private static void SortNumber(int[] numerosInteiros) {
		boolean trocou = true;
		while(trocou) {
			for (int i = 0; i < numerosInteiros.length - 1; i++) {
				if(numerosInteiros[i] > numerosInteiros[i+1]) {
					int aux = numerosInteiros[i];
					numerosInteiros[i] = numerosInteiros[i+1];
					numerosInteiros[i+1] = aux;
					trocou = true;
				}else {
					trocou = false;
				}
			}
		}
	}
}
