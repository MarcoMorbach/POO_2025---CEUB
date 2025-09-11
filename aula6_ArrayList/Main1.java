package aual6_arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//CRUD - CREATE(add); READ(get); UPDATE(set); DELETE(remove)
		// .clear() - Remove todos os elementos da lista	.size() - Tamanho da ArrayList
		
		ArrayList<String> disciplinas = new ArrayList<String>();
		
		disciplinas.add("Calculo");
		disciplinas.add("Programação");
		disciplinas.add("Eletrônica");
		disciplinas.add("Algebra");

		System.out.println(disciplinas);
		
		System.out.println(disciplinas.get(2));
		
		disciplinas.set(3, "BD1");
		System.out.println(disciplinas);
		
		//disciplinas.remove(1);
		//System.out.println(disciplinas);
		
		for(int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i));
		}
	}

}
