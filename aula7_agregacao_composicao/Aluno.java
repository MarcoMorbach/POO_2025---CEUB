package aula7_agregacao_composicao;

public class Aluno {
	
	private String nome;
	private String ra;
	private Endereco end;
	
	public Aluno() { // Construtor para o primeiro Main
		
	}
	public Aluno(String nome, Endereco end) {//Construtor com parametros para a composição
		this.nome = nome;
		this.end = end;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	
}
