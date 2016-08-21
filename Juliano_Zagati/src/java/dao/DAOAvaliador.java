package dao;

import entidade.AvaliadorZ;
import java.util.List;
import javax.persistence.EntityManager;

public class DAOAvaliador {

    private EntityManager em;

    public void salvar(AvaliadorZ avaliador) {

        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.persist(avaliador);
        em.getTransaction().commit();
    }

    public void alterar(AvaliadorZ avaliador) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.merge(avaliador);
        em.getTransaction().commit();
    }

    public void remover(AvaliadorZ avaliador) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        em.remove(avaliador);
        em.getTransaction().commit();
    }

    public void buscaId2() {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        AvaliadorZ avaliador = em.find(AvaliadorZ.class, 2L);
        System.out.println("Avaliador: " + avaliador.getNome());
        em.getTransaction().commit();
    }

    public List<AvaliadorZ> listaClientes() {
        List<AvaliadorZ> listaAvaliador;
        em = CriarEntityManager.getInstancia().getEm();
        listaAvaliador = em.createQuery("from avaliador").getResultList();
        return listaAvaliador;
    }

}
