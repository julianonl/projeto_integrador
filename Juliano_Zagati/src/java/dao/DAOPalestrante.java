
package dao;

import entidade.PalestranteZ;
import java.util.List;
import javax.persistence.EntityManager;


public class DAOPalestrante {
    
     private EntityManager em;

    public void salvar(PalestranteZ palestrante) {

        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.persist(palestrante);
        em.getTransaction().commit();
    }

    public void alterar(PalestranteZ palestrante) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.merge(palestrante);
        em.getTransaction().commit();
    }

    public void remover(PalestranteZ palestrante) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        em.remove(palestrante);
        em.getTransaction().commit();
    }

    public void buscaId2() {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        PalestranteZ palestrante = em.find(PalestranteZ.class, 2L);
        System.out.println("palestrante: " + palestrante.getNome());
        em.getTransaction().commit();
    }

    public List<PalestranteZ> listaPalestrante() {
        List<PalestranteZ> listaPalestrante;
        em = CriarEntityManager.getInstancia().getEm();
        listaPalestrante = em.createQuery("from palestrante").getResultList();
        return listaPalestrante;
    }
    
    
}
