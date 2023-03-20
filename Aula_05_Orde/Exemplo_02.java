package Aula_05;

public class Exemplo_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[50000];
			for (int i = 0; i < vetor.length; i++) {
				for (int j = 0; j < vetor.length -1; j++) {
					int rnd = (int) ( 1 + Math.random() * 50000);
				vetor[i] = rnd;
				
				if (vetor[i] == vetor[j] && i != j) {
				}
				}
			}
			for (int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i]);
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