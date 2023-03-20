package Aula_04_ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;



class ArrayLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayList = new ArrayList();

		System.out.println("Inicio do ArrayList");
		
		arrayList.add("Casa");
		arrayList.add("Trabalho");
		arrayList.add("Escola");
		arrayList.add("Festa");
		
		for (Object object : arrayList) {
			System.out.println("Valor: " + object.toString());
		}
		
		String remove = JOptionPane.showInputDialog("Digite Oque deseja remover ");
		
		arrayList.remove(remove);
		
		for (Object object : arrayList) {
			
			System.out.println("Valor: " + object.toString());
		}
		
		System.out.println("Fim do ArrayList");
	}
		
	}


