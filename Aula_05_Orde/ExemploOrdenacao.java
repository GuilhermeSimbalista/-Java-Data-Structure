
package Aula_05;

public class ExemploOrdenacao {
	public static void main(String[] args) {
		
		int[] vetor = new int[] {3,4,1,2,5};
		
		for (int i = 0; i < vetor.length; i++) {
		System.out.println("Valor: " + vetor[i]);
		}
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length -1; j++)
			if (vetor[j] > vetor[j + 1]) {
				int aux = vetor[j];
				vetor[j] = vetor[j + 1];
				vetor[j+1] = aux;
				
			}
		}
	
		System.out.println("Vetor Ordenado:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Valor: " +vetor[i]); 
		}
	}
	}

