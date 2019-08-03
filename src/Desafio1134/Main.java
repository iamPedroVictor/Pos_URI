package Desafio1134;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] votosCombustivelTipo = new int[3];
		
		int voto = sc.nextInt();
		
		while(voto != 4) {
			if(voto == 1) {
				votosCombustivelTipo[0]++;
			}else if(voto == 2) {
				votosCombustivelTipo[1]++;
			}else if(voto == 3) {
				votosCombustivelTipo[2]++;
			}
			voto = sc.nextInt();
		}
		System.out.println("Muito obrigado".toUpperCase());
		System.out.println("Alcool: " + votosCombustivelTipo[0]);
		System.out.println("Gasolina: " + votosCombustivelTipo[1]);
		System.out.println("Diesel: " + votosCombustivelTipo[2]);
		sc.close();
	}
}
