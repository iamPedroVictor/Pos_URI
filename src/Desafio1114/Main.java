package Desafio1114;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean senhaConfere = false;
		while(!senhaConfere) {
			String senhaDigitada = sc.nextLine();
			if(senhaDigitada.equalsIgnoreCase("2002")) {
				senhaConfere = true;
			}else {
				System.out.println("Senha Invalida");
			}
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}
}
