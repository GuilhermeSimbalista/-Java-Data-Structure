package Aula06;

public class Ordenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {28,7,15,12,9,3,4,1,2,5};
		
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Valor: " + arr[i]);
		}
		selectionSort(arr);
	}
		
		public static void selectionSort(int[] arr) {
			
			for (int i = 0; i < arr.length - 1; i++) {
				int indice = i;
				for(int j = i + 1; j< arr.length; j++) {
					if(arr[j] < arr[indice]) {
						indice = j; //procurando o menor indice
					}
				}
				int menorNumero = arr[indice];
				arr[indice] = arr[i];
				arr[i] = menorNumero;
			}
			System.out.println(" ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Valor: " + arr[i]);
		}
	}
}


