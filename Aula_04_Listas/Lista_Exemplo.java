package Aula_04_Listas;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Lista_Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String remove = "";
		
		System.out.println("Inicio da lista");
		List listaSimples = new ArrayList(); //Criação da lista
		listaSimples.add("Aula3");
		listaSimples.add("Aula4");  //Itens Adicionados 
		listaSimples.add("Joaozinho");
		listaSimples.add("Pedrinho");
		listaSimples.add("Iguinho");
		listaSimples.add("Jorginho");
		
		for(int i = 0; i < listaSimples.size(); i++) {
			System.out.println("Valor " + listaSimples.get(i) + " - Indice: " +i);
		}
		
		// Remover item da lista 
		
		remove = JOptionPane.showInputDialog("Deseja Remover Qual objeto? ");
		
		System.out.println("\n");
		
		for (int i = 0; i < listaSimples.size(); i++) {
			listaSimples.remove(remove);
			
			System.out.println("Valor " + listaSimples.get(i) + " - Indice: " +i);
			
			
		}
		
		System.out.println("Fim da lista");

	}

}
