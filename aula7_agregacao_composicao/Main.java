package aula7_agregacao_composicao;

public class Main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("Marco");
		a1.setRa("41414141");
		
		Endereco e1 = new Endereco();
		e1.setLogradouro("Quadra 103");
		e1.setCep("31313131");
		e1.setNumero(3);
		
		a1.setEnd(e1); //Agregação: são atribuidas as caracteristicas do objeto e1
					   // para o objeto a1. RELAÇÂO INDEPENDENTE
		
		System.out.println(a1.getNome() + "-" + a1.getRa() + "-" + a1.getEnd().getCep());
		
		

	}

}
