
package dao;

import entidade.ParticipanteZ;
import java.util.List;
import javax.persistence.EntityManager;


public class DAOParticipante {
    
     private EntityManager em;

    public void salvar(ParticipanteZ participante) {

        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.persist(participante);
        em.getTransaction().commit();
    }

    public void alterar(ParticipanteZ participante) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.merge(participante);
        em.getTransaction().commit();
    }

    public void remover(ParticipanteZ participante) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        em.remove(participante);
        em.getTransaction().commit();
    }

    public void buscaId2() {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        ParticipanteZ participante = em.find(ParticipanteZ.class, 2L);
        System.out.println("estado: " + participante.getNome());
        em.getTransaction().commit();
    }

    public List<ParticipanteZ> listaParticipante() {
        List<ParticipanteZ> listaParticipante;
        em = CriarEntityManager.getInstancia().getEm();
        listaParticipante = em.createQuery("from participante_Z").getResultList();
        return listaParticipante;
    }
    

    
}
