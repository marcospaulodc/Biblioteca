package Trabalho4;
/**
 * @author Marcos Paulo de Castro
 */

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class BibliotecaImpl extends UnicastRemoteObject implements Biblioteca
{
/*
 * Classe que implementa o servi�o, contendo os m�todos que ser�o
 * instanciados e executados no servidor de aplica��o.
 */
	
	private ArrayList<Livro> livros = new  ArrayList<Livro>();
	
	public BibliotecaImpl() throws java.rmi.RemoteException
	{
		super();
	}
	
	//M�todo para inserir um livro
	public void mInserirLivro(Livro livro) throws java.rmi.RemoteException
	{
		this.livros.add(livro);
	}
	
	//M�todo para consultar um livro
	public Livro mConsultarLivro(long id) throws java.rmi.RemoteException
	{
		for (int i = 0; i < livros.size(); i++)
		{
			if (livros.get(i).getId() == id)
			{
				return livros.get(i);
			}			
		}
		return null;
	}
	
	//M�todo para remover um livro
	public void mRemoverLivro(long id) throws java.rmi.RemoteException
	{
		for (int i = 0; i < livros.size(); i++)
		{
			if (livros.get(i).getId() == id)
			{
				livros.remove(i);
			}
		}
	}
	
	//M�todo para listar um livro
	public ArrayList<Livro> mListarLivro() throws java.rmi.RemoteException
	{
		return this.livros;
	}
	
	//M�todo para alterar um livro
	public void mAlterarLivro(Livro livro) throws java.rmi.RemoteException
	{
		for (int i = 0; i < livros.size(); i++)
		{
			if (livros.get(i).getId() == livro.getId())
			{
				livros.set(i, livro);
			}
		}
	}
}
