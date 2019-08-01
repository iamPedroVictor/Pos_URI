package Desafio1012;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.000");
		
		double	A = sc.nextDouble(),
				B = sc.nextDouble(),
				C = sc.nextDouble();
		
		double trianguloArea = CalcularAreaTriangulo(A, C);
		double circuloArea = CalcularAreaCirculo(C);
		double trapezioArea = CalcularAreaTrapezio(A, B, C);
		double quadradoArea = CalcularAreaQuadrado(B);
		double retanguloArea = CalcularAreaRetangulo(A, B);
		
		System.out.println("TRIANGULO: " + df.format(trianguloArea));
		System.out.println("CIRCULO: " + df.format(circuloArea));
		System.out.println("TRAPEZIO: " + df.format(trapezioArea));
		System.out.println("QUADRADO: " + df.format(quadradoArea));
		System.out.println("RETANGULO: " + df.format(retanguloArea));
		sc.close();
		
		
	}
	
	public static double CalcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	
	public static double CalcularAreaCirculo(double raio) {
		double pi = 3.14159;
		return pi * Math.pow(raio, 2);
	}
	
	public static double CalcularAreaTrapezio(double baseA, double baseB, double altura) {
		return ((baseA + baseB) * altura) /2;
	}
	
	public static double CalcularAreaQuadrado(double lado) {
		return Math.pow(lado,2);
	}
	
	public static double CalcularAreaRetangulo(double ladoA, double ladoB) {
		return ladoA * ladoB;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
