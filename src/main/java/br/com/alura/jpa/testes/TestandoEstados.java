package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		//Transient
		conta.setTitular("Almiro");
		conta.setAgencia(12353);
		conta.setNumero(542342);
		
	}

}
