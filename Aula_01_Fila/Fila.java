package Aula01;

public class Fila {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fila[] = new String[9];
		
		//preencher a fila com o valor vazio [Queue]
		for (int x = 0; x < 9; x++) {
			fila[x] = new String(" ");
			
		//preencher filas com valor sequencial [Enqueue]
		}
			for (int x = 0; x < 9; x++) {
				fila[x] = String.valueOf (x+1);
		
		}	
		
		//Dequeue desempilhar
			
		//isEmpty - verificar se fila esta vazia
			int i = 0;
			for (int x = 0; x < 9; x++, i++) {
		    if (i == 0) {
		    	System.out.println("Fila esta vazia");
		    	
		    }
				
			
				
			}
			
		//isFull - verificar se fila esta cheia
			int i = 0;
			for (int x = 0; x<9; x++, i++) {
				if (i == 10) {
					System.out.println("Fila esta cheia");
					
				}
			}
		//clear - limpar fila
			
			
		//exibir fila
		for (int x = 0; x < 9; x++) {
		System.out.println(fila[x]);
		}
		 System.out.println("Hello Word!!!");
		 
		

	}

}
