package Trabalho4;
/**
 * @author Marcos Paulo de Castro
 */

import java.io.Serializable;

public class Livro implements Serializable
{
/*
 * Classe para permitir que o objeto Livro seja serializado,
 * possibilitando o envio na rede.
 */
	private long idLivro;
	private String nome;
	private String editora;
	private String autor;
	private String ano;
	
	public Livro(long idLivro, String nome, String editora, String autor, String ano)
	{
		this.idLivro = idLivro;
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.ano = ano;
	}
	
	public long getId()
	{
		return idLivro;
	}
	
	public void setId(long idLivro) 
	{
		this.idLivro = idLivro;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getEditora() 
	{
		return editora;
	}
	
	public void setEditora(String editora) 
	{
		this.editora = editora;
	}
	
	public String getAutor() 
	{
		return autor;
	}
	
	public void setAutor(String autor) 
	{
		this.autor = autor;
	}
	
	public String getAno() 
	{
		return ano;
	}
	
	public void setAno(String ano) 
	{
		this.ano = ano;
	}

	@Override
	public String toString() 
	{
		return "Livro: Codigo do Livro: " + idLivro + ", Nome: " + nome + ", Editora: " + editora 
												 + ", Autor: " + autor + ", Ano: " + ano;
	}
}
