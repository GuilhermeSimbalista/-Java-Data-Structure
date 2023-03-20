package Aula_04_Vetor;

import java.util.Vector;

public class Vetorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inicio do vetor ");
		
		Vector vector = new Vector();
		vector.add("Carl");
		vector.add("Patrick");
		vector.add("Sandy");
		vector.add("Rock");
		
		for (Object object : vector) {
			System.out.println("Valor " + object.toString());
			
		}
		
		System.out.println("Fim do vetor ");
	}

}
