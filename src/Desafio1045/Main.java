package Desafio1045;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		String[] dataLine = sc.nextLine().split(" ");
		double[] numerosOrdenados = OrdenarNumeros(dataLine);
				
		double	A = numerosOrdenados[0],
				B = numerosOrdenados[1],
				C = numerosOrdenados[2];
		
		String trianguloTipo = VerificarTrianguloTipo(A, B, C);
		
		System.out.println(trianguloTipo);

		if((A == B) && (B == C)) {
			System.out.println("TRIANGULO EQUILATERO");
		}else if((A == B && A != C) || (B == C && B != A) || (C == A && C != B)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		sc.close();
	}

	private static String VerificarTrianguloTipo(double A, double B, double C) {
		String trianguloTipo = "";
		if(A >= (B + C)) {
			trianguloTipo = "NAO FORMA TRIANGULO";
		}else if(AoQuadrado(A) == (AoQuadrado(B) + AoQuadrado(C))) {
			trianguloTipo = "TRIANGULO RETANGULO";
		}else if(AoQuadrado(A) > (AoQuadrado(B) + AoQuadrado(C))) {
			trianguloTipo = "TRIANGULO OBTUSANGULO";
		}else if(AoQuadrado(A) < (AoQuadrado(B) + AoQuadrado(C))) {
			trianguloTipo = "TRIANGULO ACUTANGULO";
		}
		return trianguloTipo;
	}

	private static double AoQuadrado(double numero) {
		return Math.pow(numero, 2);
	}

	private static double[] OrdenarNumeros(String[] dataLine) {
		double[] numerosOrdenados = new double[] {
				Double.parseDouble(dataLine[0]),
				Double.parseDouble(dataLine[1]),
				Double.parseDouble(dataLine[2])
		};
		boolean trocou = false;
		do {
			for(int i = 0; i < numerosOrdenados.length - 1; i++) {
				if(numerosOrdenados[i] < numerosOrdenados[i+1]) {
					double aux = numerosOrdenados[i];
					numerosOrdenados[i] = numerosOrdenados[i+1];
					numerosOrdenados[i+1] = aux;
					trocou = true;
				}else {
					trocou = false;
				}
			}
		} while (trocou);
		return numerosOrdenados;
	}
}
