package Aula06;

public class OrdenacaoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {28,7,15,12,9,3,4,1,2,5};
		int tamanho = arr.length;
		int temp = 0;
		System.out.println("Ordenando Array usando a Técnica ");
		for (int i = 0; i < tamanho; i++) {
			for (int j = i + 1; j < tamanho; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Agora o Array apos a Ordenação");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
