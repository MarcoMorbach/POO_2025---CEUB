package aula6_encapsulamento;

public class Main {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.setModelo("Pulse");
		c1.setAno(2025);
		c1.setMarca("Fiat");
		
		Carro c2 = new Carro();
		c2.setAno(2025);
		c2.setMarca("WV");
		c2.setModelo("Gol");
		
		Moto m1 = new Moto();
		m1.setAno(2025);
		m1.setMarca("Tag Heuer");
		m1.setModelo("moto");
		
		System.out.println(c1.getModelo());
		System.out.println(c2.getModelo());
	}

}
