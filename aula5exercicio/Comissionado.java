package aula5exercicio

public class Comissionado extends Funcionario {
	public double comissao;
	
	public double calcularSalario() {
		return salarioBase + comissao;
		
	}
	

}
