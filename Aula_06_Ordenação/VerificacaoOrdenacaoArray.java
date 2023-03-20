package Aula06;

public class VerificacaoOrdenacaoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[50000];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int rnd = (int) (1 + Math.random() * 50000);
				arr[i] = rnd;

				if (arr[i] == arr[j] && i != j) {
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		int tamanho = arr.length;
		int temp = 0;
		long startTime = System.nanoTime();
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
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Verificar tempo para ordenação " + duration);
	}
}