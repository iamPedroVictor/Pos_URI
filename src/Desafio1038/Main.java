package Desafio1038;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.00");
		
		String[] dataLine = sc.nextLine().split(" ");
		sc.close();
		
		double total = CalcularTotal(Integer.parseInt(dataLine[0]), Integer.parseInt(dataLine[1]));
		
		System.out.println("Total: R$ " + df.format(total));
		
	}
	
	public static double CalcularTotal(int codigo, int quantidade) {
		Lanche[] lanches = new Lanche[] {
				new Lanche(1, 4.00),
				new Lanche(2, 4.50),
				new Lanche(3, 5.00),
				new Lanche(4, 2.00),
				new Lanche(5, 1.50)
		};
		
		for(Lanche lanche : lanches) {
			if(lanche.equals(codigo)) {
				return lanche.Total(quantidade);
			}
		}
		
		return 0.0;
	}

}

class Lanche{
	private int codigo;
	private double preco;
	
	public Lanche(int id, double preco) {
		this.codigo = id;
		this.preco = preco;
	}
	
	public double Total(int quantidade) {
		return (quantidade * this.preco);
	}

	
	public boolean equals(int lancheCodigo) {
		// TODO Auto-generated method stub
		return (this.codigo == lancheCodigo);
	}
	
}