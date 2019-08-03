package Desafio1116;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		int quantidadePares = sc.nextInt();
		for(int i = 0; i < quantidadePares; i++) {
			int[] par = new int[] {
					sc.nextInt(),
					sc.nextInt()
			};
			
			if(par[1] == 0) {
				System.out.println("divisao impossivel");
			}else {
				double resultado = (double)par[0]/par[1];
				System.out.println(df.format(resultado));
			}
		}
		sc.close();
	}
}
