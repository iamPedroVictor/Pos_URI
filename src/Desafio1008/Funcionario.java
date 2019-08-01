package Desafio1008;

public class Funcionario{
	private double valorHora;
	private int funcionarioNumero, horasTrabalhadas;
	
	public Funcionario(int numero, double valorHora) {
		this.valorHora = valorHora;
		this.funcionarioNumero = numero;
	}
	
	public double CalcularSalario(int horasTrabalhadas) {
		return this.valorHora * horasTrabalhadas;
	}
	
	public int getNumero() {
		return this.funcionarioNumero;
	}
	
}

