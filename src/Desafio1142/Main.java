package Desafio1142;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidadeLinhas = sc.nextInt(),
				count = 0;
		
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int y = 0; y < 3; y++) {
				count++;
				System.out.print(count + " ");
			}
			count++;
			System.out.print("PUM\n");
		}
		
		sc.close();
	}
}
