package Aula02;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Fila[] = new String [10];
		
		for (int x = 0; x < 10; x++) {
			Fila[x] = new String ("0");		
			
		}
		// Exibir fila
		for (int x = 0; x<10; x++) {
			System.out.println(x+ " Posição Valor:" + Fila[x]);
		}
		// Incrementar fila
		System.out.println("\n" + "Fila Incrementada" + "\n");
		
		
		for (int x = 0; x < 10; x++) {
			Fila[x] = String.valueOf(x);
			

	}
		for (int x = 0; x<10; x++) {
			System.out.println(x+ " Posição Valor:" + Fila[x]);
		}
		
		//Deletar - SobreEscrita
		
		Fila[1] = new String ("10");
		
		for (int x = 0; x<10; x++) {
			System.out.println(x+ " Posição Valor:" + Fila[x]);
		}
		
		//isEmpty
		int cont = 0;
		int isFull =0;
	
		for (int x = 0; x<10; x++) {
			if (Fila[x] {
				cont++;
			System.out.println("Fila possui posiçoes com valor zero");
			}
			}
			if (cont > 0) {
				System.out.println("Fila possui posiçoes com valores");
				
			}
		
			//isFull
			
			if (isFull == Fila.length) {
				System.out.println("Fila esta cheia");
				
			}else {
				System.out.println("Fila nao esta cheia");
			}
			
			
		}
		
		
	}


