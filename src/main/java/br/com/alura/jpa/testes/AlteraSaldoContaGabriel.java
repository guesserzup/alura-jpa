package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraSaldoContaGabriel {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta contaDoGabriel = em.find(Conta.class, 2L);
		
		em.getTransaction().begin();
		
		contaDoGabriel.setSaldo(20.0);
		
		em.getTransaction().commit();
	}
}
