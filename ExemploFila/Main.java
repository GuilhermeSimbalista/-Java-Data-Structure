package ExemploFila;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] valores = new int [10];
		int total = 0;
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a Opção" + "\n "+ "1 - Inserir valor " + "\n" + "2 - Remover valores"
		+"\n"+ "3 - Verificar se esta vazia" + "\n" + "4 - Verificar se esta cheia" + "\n" + "5 - Visualizar fila"));
			
		switch (opcao) {
		
		case 1:
		// Inserir valores 
		
		for (int x = 0; x < 10; x++) {			
				valores[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+x+" numero"));	
					total ++;
		}break;
		
		// remover valores
		case 2:
			
		int remov = 0;		
		remov = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que deseja remover: "));
		
		for (int x = 0; x < 10; x++) {
			if (valores[x] == remov) {
				valores[remov] = 0;
				
			}
		}			
		total --;		
			JOptionPane.showMessageDialog(null, "Valor Removido");
				for (int x = 0; x < 10; x++) {
					System.out.println("Os valores são: " + valores[x]);	
			}break;
		
		// isEmpty	
		case 3:
			if (total <= 0) {
				JOptionPane.showMessageDialog(null, "A fila esta vazia");
			} else { 
				JOptionPane.showMessageDialog(null, "A fila nao esta vazia");
			}break;
		
		// isFull
		case 4:
			if (total >= 10) {
				JOptionPane.showMessageDialog(null, "A fila esta cheia");
			} else {
				JOptionPane.showMessageDialog(null, "A fila nao esta cheia");	
			}break;
		
		// Visualizar fila 	
		case 5:
			for (int x = 0; x < 10; x++) {
				System.out.println(x + "º Posiçao " + "valores: " + valores[x]);
			}break;	
			
		}
		} while (opcao != 0);
		}
	}
