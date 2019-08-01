package Desafio1041;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String[] dataLine = sc.nextLine().split(" ");
		double	pontoX = Double.parseDouble(dataLine[0]),
				pontoY = Double.parseDouble(dataLine[1]);
		
		String mensagem = RetornarQuadrante(pontoX, pontoY);
		sc.close();
		System.out.println(mensagem);

	}

	private static String RetornarQuadrante(double pontoX, double pontoY) {
		String mensagem = "Origem";
		mensagem = EncontrarQuadrante(pontoX, pontoY);
		mensagem = EncontrarEixo(pontoX, pontoY);
		return mensagem;
	}

	private static String EncontrarEixo(double pontoX, double pontoY) {
		String msg = "";
		if(pontoX == 0.0 && pontoY != 0.0) {
			msg = "Eixo Y";
		}else if(pontoX != 0.0 && pontoY == 0.0) {
			msg = "Eixo X";
		}
		return msg;
	}

	private static String EncontrarQuadrante(double pontoX, double pontoY) {
		String msg = "";
		if(pontoX > 0 && pontoY > 0) {
			msg = "Q1";
		}else if(pontoX > 0 && pontoY < 0) {
			msg = "Q4";
		}else if(pontoX < 0 && pontoY > 0) {
			msg = "Q2";
		}else if(pontoX < 0 && pontoY < 0) {
			msg = "Q3";
		}else if(pontoX == 0.0 && pontoY == 0.0) {
			msg = "Origem";
		}
		return msg;
	}
}
