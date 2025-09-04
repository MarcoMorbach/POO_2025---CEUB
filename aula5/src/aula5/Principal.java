package aula5;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.marca = "Fiat";
		c1.modelo = "Pulse";
		c1.ano = "2025";
		c1.temArcondicionado = true;
		c1.ligar(false);
		
		Moto m1 = new Moto();
		m1.marca = "Honda";
		m1.modelo = "123";
		m1.ano = "2025";
		m1.temBau = true;
		m1.ligar(true);	
		
	}

}
