package Trabalho4;
/**
 * @author Marcos Paulo de Castro
 */

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BibliotecaCliente 
{
/*
 * Classe do processo do cliente esta por sua vez deverá ser iniciada após o serviço 
 * do servidor estar levantado, esta classe inicia o Menu da Biblioteca, possibilitando 
 * que o usuário informe as opções e os parâmetros desejados.
 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			Biblioteca b = (Biblioteca) Naming.lookup("rmi://localhost:1199/BibliotecaService");
				
			String opcao = "";
			while(!opcao.equalsIgnoreCase("Fim"))
			{
				opcao = JOptionPane.showInputDialog("Entre com a opcao desejada:\n1 - Inserir Livro: \n2 - Consultar Livro:\n3 - Remover livro:\n4 - Listar Livro:\n5 - Alterar Livro:\nFim - Para Sair:");
				
				if(opcao.equals("1"))
				{
					String id = JOptionPane.showInputDialog("Digite o codigo do Livro:");
					String nomeLivro = JOptionPane.showInputDialog("Digite o nome do Livro:");
					String editoraLivro = JOptionPane.showInputDialog("Digite a editora do Livro:");
					String autorLivro = JOptionPane.showInputDialog("Digite o autor do Livro:");
					String anoLivro = JOptionPane.showInputDialog("Digite o ano do Livro:");
					
					Livro livro = new Livro(Long.parseLong(id), nomeLivro, editoraLivro, autorLivro, anoLivro);
					b.mInserirLivro(livro);
					JOptionPane.showConfirmDialog(null, "Livro inserido com sucesso.");
				}
				else if(opcao.equals("2"))
				{
					String idLivro = JOptionPane.showInputDialog("Digite o Id do Livro para consultar:");
					Livro livro = b.mConsultarLivro(Long.parseLong(idLivro));
					if (livro != null) 
					{
						JOptionPane.showMessageDialog(null, livro.getNome());
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Livro não encontrado!");
					}
				}
				else if(opcao.equals("3"))
				{
					String id = JOptionPane.showInputDialog("Digite o Id do Livro para remover:");
					b.mRemoverLivro(Long.parseLong(id));
					JOptionPane.showConfirmDialog(null, "Livro removido com sucesso.");
				}
				else if(opcao.equals("4"))
				{
					ArrayList<Livro> livros = new ArrayList<Livro>();
					
					livros = b.mListarLivro();
					
					for(int i = 0; i < livros.size(); i++)
					{
						JOptionPane.showMessageDialog(null, livros.get(i).toString());
					}
				}
				else if(opcao.equals("5"))
				{
					String id = JOptionPane.showInputDialog("Digite o Id do Livro para alterar: ");				
					String nomeLivro = JOptionPane.showInputDialog("Digite o nome do Livro para alterar:");
					String editoraLivro = JOptionPane.showInputDialog("Digite a editora do Livro para alterar:");
					String autorLivro = JOptionPane.showInputDialog("Digite o autor do Livro para alterar:");
					String anoLivro = JOptionPane.showInputDialog("Digite o ano do Livro para alterar:");
					
					Livro livro = new Livro(Long.parseLong(id), nomeLivro, editoraLivro, autorLivro, anoLivro);
					b.mAlterarLivro(livro);
					JOptionPane.showConfirmDialog(null, "Livro alterado com sucesso.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Opção Inválida, tente novamente!");
				}
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Tente novamente", "Erro", 0);
		}
		System.out.println("Biblioteca fechada!");
	}
}
