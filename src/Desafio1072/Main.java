package Desafio1072;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidadeDeValores = sc.nextInt();
		int dentro = 0, fora = 0;
		
		int[] valoresInteiros = new int[quantidadeDeValores];
		
		for(int i=0; i < quantidadeDeValores; i++) {
			valoresInteiros[i] = sc.nextInt();
		}
		
		for(int inteiro : valoresInteiros) {
			boolean dentroIntervalo10a20 = inteiro >= 10 && inteiro <= 20;
			if(dentroIntervalo10a20) {
				dentro++;
			}else {
				fora++;
			}
		}
		
		System.out.println(String.format("%d in", dentro));
		System.out.println(String.format("%d out", fora));
		
		sc.close();
	}
}
