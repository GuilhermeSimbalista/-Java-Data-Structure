package Aula_04_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ExemploListasBolas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Bola> listaBolas = new ArrayList<Bola>();
		Bola bola = new Bola();
		bola.setCor("Azul");
		bola.setTamanho("M5");
		listaBolas.add(bola);
		bola = new Bola();
		bola.setCor("Amarela");
		bola.setTamanho("M2");
		listaBolas.add(bola);
		
		
		for (int i = 0; i < listaBolas.size(); i++) {
			Bola tempBola = listaBolas.get(i);
			System.out.println("Bola - Cor: " + tempBola.getCor() + " - Tam: " + tempBola.getTamanho());
		}
		
		
	}

}
