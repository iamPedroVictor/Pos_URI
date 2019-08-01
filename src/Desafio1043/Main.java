package Desafio1043;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.0");
		
		String[] dataLine = sc.nextLine().split(" ");
		double	A = Double.parseDouble(dataLine[0]),
				B= Double.parseDouble(dataLine[1]),
				C = Double.parseDouble(dataLine[2]);
		
		boolean isRetangulo = VerificarTriangulo(A, B, C);
		
		if(isRetangulo) {
			double perimetroTriangulo = A + B + C;
			System.out.println("Perimetro = " + perimetroTriangulo);
		}else{
			double areaTrapezio = ((A + B) / 2) * C;
			System.out.println("Area = " + areaTrapezio);
		}
		sc.close();
	}

	private static boolean VerificarTriangulo(double A, double B, double C) {
		if(VerificarLadoTriangulo(A, B, C) &&
			VerificarLadoTriangulo(B, A, C) &&
			VerificarLadoTriangulo(C, A, B)	) {
			return true;
		}
		return false;
	}

	private static boolean VerificarLadoTriangulo(double a, double b, double c) {
		boolean isMenorQueSomaDasMedidas = (a < b + c);
		boolean isMaiorQueValorAbsolutoDaDiferença = (Math.abs(b - c) < a);
		return (isMenorQueSomaDasMedidas && isMaiorQueValorAbsolutoDaDiferença);
	}

}
