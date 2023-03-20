package Aula_04_LinkedList;

import java.util.LinkedList;

public class Exemplo_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inicio da lista");
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("Lab1");
		linkedList.add("Lab2");
		linkedList.add("Lab3");
		linkedList.add("Lab4");
		linkedList.add("Lab5");
		
		for (Object object : linkedList) {
			System.out.println("Valor :" + object.toString());
		}
		
		System.out.println("Fim da lista");
		
	}

}
