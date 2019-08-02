package Desafio1050;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoDDD = sc.nextInt();
		
		Cidade[] tabelaCidades = new Cidade[] {
				new Cidade("Brasilia", 61),
				new Cidade("Salvador", 71),
				new Cidade("Sao Paulo", 11),
				new Cidade("Rio de Janeiro", 21),
				new Cidade("Juiz de Fora", 32),
				new Cidade("Campinas", 19),
				new Cidade("Vitoria", 27),
				new Cidade("Belo Horizonte", 31),
		};
		
		String mensagem = AcharCidade(codigoDDD, tabelaCidades);
		System.out.println(mensagem);
		sc.close();
	}

	private static String AcharCidade(int codigoDDD, Cidade[] tabelaCidades) {
		for(Cidade cidade : tabelaCidades) {
			if(cidade.CompararDDD(codigoDDD)) {
				return cidade.getNome();
			}
		}
		return "DDD nao cadastrado";
	}
}

class Cidade{
	private String nome;
	private int dddCodigo;
	
	public Cidade(String nome, int codigo) {
		this.nome = nome;
		this.dddCodigo = codigo;
	}
	public boolean CompararDDD(int codigo) {
		return this.dddCodigo == codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
}
