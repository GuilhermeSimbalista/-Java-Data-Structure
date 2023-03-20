package Aula_07;

public class ExemploInsertoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {23, 12, 2, 3, 4, 9, 1, 20, 5, 7, 8, 6, 10 } ;

		show(array);
		System.out.println("Ordenar");
		insertSort(array);
		show(array);
	}
	
	public static void insertSort(int[] array) {
		
		int i = 0, j = 0, key = 0;
		
		for (i = 1; i<array.length; i++ ) {
			key = array[i];
			j = i - 1;
			while ( j >= 0 && array[j] > key) {
				array[ j + 1 ] = array[j];
				j = j - 1;
			}
			array[ j + 1] = key;
		}
	}
	
	private static void show(int[] array) {
		for (int i : array) {
			System.out.println("Valor : " + i);
		}
	}

}
