
package dao;

import entidade.EstadoZ;
import java.util.List;
import javax.persistence.EntityManager;


public class DAOEstado {
    
            private EntityManager em;
            
            DAOGenerico daoGen = new DAOGenerico();

    public void salvar(Object estado) {

        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.persist(estado);
        em.getTransaction().commit();
    }

    public void alterar(EstadoZ estado) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.merge(estado);
        em.getTransaction().commit();
    }

    public void remover(EstadoZ estado) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        em.remove(estado);
        em.getTransaction().commit();
    }

    public void buscaId2(int id) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        EstadoZ estado = em.find(EstadoZ.class, id);
        System.out.println("estado: " + estado.getNome());
        em.getTransaction().commit();
    }

    public List<EstadoZ> listaEstado() {
        List<EstadoZ> estados=daoGen.listar(EstadoZ.class);
        return estados;
    }
    
}
