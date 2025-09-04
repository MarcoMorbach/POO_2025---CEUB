package aula5exercicio

public class Principal {
	
	public static void main(String[] args) {
		
		CLT cl1 = new CLT();
		cl1.nome = "João";
		cl1.cpf = "111111";
		cl1.salarioBase = 1000;
		cl1.calcularSalario();
		
		PJ pj1 = new PJ();
		pj1.nome = "Fernando";
		pj1.cpf = "31313131";
		pj1.salarioBase = 10000;
		pj1.calcularSalario();
		
		Comissionado c1 = Comissionado();
		c1.nome = "Mario";
		c1.cpf = "41414214";
		c1.salarioBase = 20000;
		c1.calcularSalario();
	}
	

}
