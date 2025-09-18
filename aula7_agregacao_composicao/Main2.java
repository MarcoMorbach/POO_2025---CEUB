package aula7_agregacao_composicao;

public class Main2 {
	
	public static void main(String[] args) {
		
		Endereco e2 = new Endereco();
		e2.setCep("1414141");
		e2.setLogradouro("Quadra 310");
		e2.setNumero(1);
		
		String nome = "Marco";
		
		Aluno a2 = new Aluno(nome, e2);
		
		System.out.println(a2.getNome() + "-" + a2.getEnd().getCep());
		
	}

}
