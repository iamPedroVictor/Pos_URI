package Desafio1115;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int[] coordenadas = PegarCoordenadas(sc);
		
		boolean coordenadaNula = false;
		
		while(!coordenadaNula) {
			if(coordenadas[0] > 0 && coordenadas[1] > 0) {
				System.out.println("primeiro");
			}else if(coordenadas[0] > 0 && coordenadas[1] < 0) {
				System.out.println("quarto");
			}else if(coordenadas[0] < 0 && coordenadas[1] > 0) {
				System.out.println("segundo");
			}else if(coordenadas[0] < 0 && coordenadas[1] < 0) {
				System.out.println("terceiro");
			}
			coordenadas = PegarCoordenadas(sc);
			coordenadaNula = (coordenadas[0] == 0) || (coordenadas[1] == 0);
		}
		
		sc.close();
	}

	private static int[] PegarCoordenadas(Scanner sc) {
		int[] coordenadas;
		coordenadas = new int[] {
				sc.nextInt(),
				sc.nextInt()
		};
		return coordenadas;
	}
}
