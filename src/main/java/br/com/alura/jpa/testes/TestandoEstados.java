package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		// Transient
		conta.setTitular("Almiro");
		conta.setAgencia(12353);
		conta.setNumero(542342);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Transient -> Managed
		em.persist(conta);
		
		// Managed -> Removed
		em.remove(conta);
		
		em.getTransaction().commit();
	}
}
