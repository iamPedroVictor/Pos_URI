package Desafio1131;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int continuar = 0;
		int grenais = 0;
		int[] placar = new int[] {0,0,0};
		
		do {
			int interGol = sc.nextInt();
			int gremioGol = sc.nextInt();
			grenais++;
			if(interGol > gremioGol) {
				placar[0]++;
			}else if(gremioGol > interGol) {
				placar[1]++;
			}else if(gremioGol == interGol) {
				placar[2]++;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			continuar = sc.nextInt();
		} while (continuar == 1);
		
		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + placar[0]);
		System.out.println("Gremio:" + placar[1]);
		System.out.println("Empates:" + placar[2]);
		if(placar[0] > placar[1]) {
			System.out.println("Inter venceu mais");
		}else if(placar[1] > placar[0]) {
			System.out.println("Gremio venceu mais");
		}else if(placar[0] == placar[1]) {
			System.out.println("Nao houve vencedor");
		}
		sc.close();
	}
}
