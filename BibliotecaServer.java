package Trabalho4;
/**
 * @author Marcos Paulo de Castro
 */

import java.rmi.Naming;

public class BibliotecaServer 
{
/*
 * Classe que deverá ser executada inicialmente para levantar o serviço
 * do servidor de aplicação da biblioteca.
 */
	public BibliotecaServer()
	{
		try
		{
			java.rmi.registry.LocateRegistry.createRegistry(1199);
			
			Biblioteca b = new BibliotecaImpl();
			Naming.rebind("rmi://localhost:1199/BibliotecaService", b);
			System.out.println("--------------------------------------");
			System.out.println("--- Servidor iniciado com sucesso! --- ");
			System.out.println("--------------------------------------");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new BibliotecaServer();
	}
}
