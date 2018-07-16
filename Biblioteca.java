package Trabalho4;
/**
 * @author Marcos Paulo de Castro
 */

import java.util.ArrayList;

public interface Biblioteca extends java.rmi.Remote
{
/*
 * Interface para definição do serviço.
 */

	public void mInserirLivro(Livro livro) throws java.rmi.RemoteException;
	
	public Livro mConsultarLivro(long id) throws java.rmi.RemoteException;
		
	public void mRemoverLivro(long id) throws java.rmi.RemoteException;
	
	public ArrayList<Livro> mListarLivro() throws java.rmi.RemoteException;
	
	public void mAlterarLivro(Livro livro) throws java.rmi.RemoteException;
}
