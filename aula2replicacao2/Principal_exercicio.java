package aula2exercicio;

public class Principal {
	
	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.anoPublicacao =2025;
		l1.titulo = "João e Maria";
		l1.numPag = 255;
		l1.autor = "João";
		l1.devolver();
		
		Tese t1 = new Tese();
		t1.anoPublicacao = 2007;
		t1.titulo = "História do Direito";
		t1.cursoOrigem = "Direito";
		t1.autor = "João";
		t1.emprestar();
		
		Revista r1 = new Revista();
		r1.anoPublicacao = 2006;
		r1.titulo = "Maria e João";
		r1.edicao = 13;
		r1.mesPublicacao = "Março";
		r1.devolver();
		
				
	}

}
