package Exercicio_salario;

public class Principal {
	
	public static void main(String[] args) {
		
		CLT clt1 = new CLT();
		clt1.cpf = "132132131";
		clt1.nome = "Diego";
		clt1.salarioBase = 2500;
		clt1.calcularSalario();
		
		PJ pj1 = new PJ();
		pj1.cpf = "31313131";
		pj1.nome = "Matheus";
		pj1.salarioBase = 1000;
		pj1.calcularSalario();
		
		Comissionado cm1 = new Comissionado();
		cm1.cpf = "532525";
		cm1.nome = "Marco";
		cm1.salarioBase = 20000;
		cm1.comissao = 1000;
		cm1.calcularSalario();
		
		System.out.println(clt1.calcularSalario());
		System.out.println(pj1.calcularSalario());
		System.out.println(cm1.calcularSalario());
		
			
		
	}

}
