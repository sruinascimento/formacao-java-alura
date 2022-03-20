package br.com.ruicompany.banco.modelo;
/**
 * 
 * Classe  que representa o Cliente no banco
 *@author rui
 *@version 0.1
 * */
public class Cliente {
	
	private int idade;
	
	/**
	 * Classe Cliente
	 *
	 * @param idade
	 * */
	public Cliente() {
		System.out.println("Cliente criado!");
	}
	
	public int getIdade() {
		/**
		 * retorna a idade que é um tipo inteiro
		 * */
		return this.idade;
	}
}
