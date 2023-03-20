package Aula_03_Matriz;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] matriz = new String[5][5];
		
		for (int linha = 0; linha < 5; linha++) {
			
					matriz[linha][0] = JOptionPane.showInputDialog("Digite seu nome: ");
					matriz[linha][1] = JOptionPane.showInputDialog("Digite sua idade");
					matriz[linha][2] = JOptionPane.showInputDialog("Digite sua cidade");
					matriz[linha][3] = JOptionPane.showInputDialog("Digite seu estado");
					matriz[linha][4] = JOptionPane.showInputDialog("Digite seu bairro");

					
					
			}
			
				for (int linha = 0; linha <5; linha++) {
					for (int coluna = 0; coluna <5; coluna ++) {
						System.out.println(matriz[linha][coluna]);
					}
				}
		}
			

	}

