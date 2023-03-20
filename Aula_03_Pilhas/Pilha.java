package Aula_03_Pilhas;

import javax.swing.JOptionPane;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] pilha = new int[10];
		int posicao = -1;	
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" + "\n "+ "1 - Inserir valor " + "\n" + "2 - isEmpty"
		+"\n"+ "3 - Mostrar ultimo valor" + "\n" + "4 - Desempilhar" + "\n" + "5 - Empilhar"));
			
		switch (opcao) {
		
		case 1:
			for(int x = 0; x < 10; x++) {
				pilha[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +x+ " Valor:"));
				posicao++;
			}
			break;
			
		case 2: 
			if (posicao < 1 ) {
				JOptionPane.showMessageDialog(null, "Pilha esta vazia");
			}else {
				JOptionPane.showMessageDialog(null, "Pilha nao esta vazia");
			}
			break;
			
		
		case 3:  //Mostrar ultimo valor
			if (pilha[posicao] < 1) {
				JOptionPane.showMessageDialog(null, "Pilha Vazia");
			}else {
			
				JOptionPane.showMessageDialog(null, "Ultimo Valor é: " + pilha[posicao]);
				
			}
			
			break;
		case 4: //Desempilhar
			String mens = "";
			for(int x = 0; x < 10; x++) { 
				if (pilha[x] < 1) {
					JOptionPane.showMessageDialog(null, "Pilha Vazia");
				}else {
					mens += " " + pilha[posicao--];
					
				}
			}
			JOptionPane.showMessageDialog(null, mens);
			break;
			
		case 5: //Empilhar
			for(int x = 0; x < 10 ; x++) {
				if (posicao < pilha.length ) {
					mens += " " + pilha[++posicao];
					JOptionPane.showMessageDialog(null, pilha[++posicao]);
			 
			}
			}
			break;
		}
		} while (opcao != 0);
	}
}
			
				
			
				
			
		
		
		

	


