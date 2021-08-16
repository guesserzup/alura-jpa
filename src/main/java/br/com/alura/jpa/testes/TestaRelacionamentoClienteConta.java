package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaRelacionamentoClienteConta {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setId(2L);

        Cliente cliente = new Cliente();
        cliente.setNome("John Doe");
        cliente.setEndereco("Rua do Rosário, 890");
        cliente.setProfissao("Professor");
        cliente.setConta(conta);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(cliente);

        em.getTransaction().commit();
        em.close();
    }
}
