package Aula_04_Atividade;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Aula_04_LinkedList.Bola;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Opções Inserir, Exibir, procurar e remover
		int opcao = 0;
		List <Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção: " + "\n" + "1 - Inserir dados " + "\n" + "2 - Exibir Dados " +
		"\n" + "3 - Procurar Dados" + "\n" + "4 - Remover Dados"));
			
			switch(opcao) {
			
			case 1: 
				pessoa.setNome(JOptionPane.showInputDialog("Digite o seu Nome:"));
				pessoa.setEndereco(JOptionPane.showInputDialog("Digite o seu Endereço:"));
				pessoa.setCidade(JOptionPane.showInputDialog("Digite a sua Cidade:"));
				pessoa.setTelefone(JOptionPane.showInputDialog("Digite o seu Telefone:"));
				pessoa.setEmail(JOptionPane.showInputDialog("Digite o seu Email"));
				listaPessoa.add(pessoa);
				
				break;
				
			case 2: 
				for (int i = 0; i < listaPessoa.size(); i++) {
					Pessoa tempPessoa = listaPessoa.get(i);
					
					System.out.println("Nome: " + tempPessoa.getNome() + " Endereço: " + tempPessoa.getEndereco() + " Cidade: " + tempPessoa.getCidade() + " Telefone: " + tempPessoa.getTelefone() + " Email: " + tempPessoa.getEmail());
				
				}
				break;
				
			case 3:
				String procurar = JOptionPane.showInputDialog("Digite o nome que deseja procurar: ");
				for (int i = 0; i < listaPessoa.size(); i++) {
				if  (pessoa.getNome().equalsIgnoreCase(procurar)) {
					System.out.println("Nome: " + pessoa.getNome() + "Endereço: " + pessoa.getEndereco() + "Cidade: " + pessoa.getCidade() + "Telefone: " + pessoa.getTelefone() + "Email: " + pessoa.getTelefone());
					
				}
				}
				
							
				break;
				
			case 4: 
				
				String remove = JOptionPane.showInputDialog("Digite qual deseja remover");
				for (int i = 0; i < listaPessoa.size(); i++) {
					//Pessoa pessoa = listaPessoa.get(i);
					if (pessoa.getNome().equalsIgnoreCase(remove)) {
						listaPessoa.remove(i);
						System.out.println(listaPessoa);
					}
				}
				
				
				break;
			}
		}while (opcao != 0 );
	}

}
