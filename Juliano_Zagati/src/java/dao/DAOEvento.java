
package dao;

import entidade.EstadoZ;
import entidade.EventoZ;
import java.util.List;
import javax.persistence.EntityManager;


public class DAOEvento {
     private EntityManager em;

    public void salvar(EventoZ evento) {

        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
    }

    public void alterar(EventoZ evento) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.merge(evento);
        em.getTransaction().commit();
    }

    public void remover(EventoZ evento) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        em.remove(evento);
        em.getTransaction().commit();
    }

    public void buscaId2() {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        EventoZ evento = em.find(EventoZ.class, 2L);
        System.out.println("estado: " + evento.getNome());
        em.getTransaction().commit();
    }

    public List<EventoZ> listaEvento() {
        List<EventoZ> listaEvento;
        em = CriarEntityManager.getInstancia().getEm();
        listaEvento = em.createQuery("from evento").getResultList();
        return listaEvento;
    }
    
    
}
