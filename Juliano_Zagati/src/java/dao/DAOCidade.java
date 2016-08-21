
package dao;

import entidade.CidadeZ;
import java.util.List;
import javax.persistence.EntityManager;


public class DAOCidade {
    
        private EntityManager em;
         DAOGenerico daoGen = new DAOGenerico();

    public void salvar(CidadeZ cidade) {

        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.persist(cidade);
        em.getTransaction().commit();
    }

    public void alterar(CidadeZ cidade) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.merge(cidade);
        em.getTransaction().commit();
    }

    public void remover(CidadeZ cidade) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        em.remove(cidade);
        em.getTransaction().commit();
    }

    public void buscaId2() {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.getTransaction().begin();
        CidadeZ cidade = em.find(CidadeZ.class, 2L);
        System.out.println("cidade: " + cidade.getNome());
        em.getTransaction().commit();
    }

        public List<CidadeZ> listaCidade() {
        List<CidadeZ> cidade=daoGen.listar(CidadeZ.class);
        return cidade;
    }
    
}
