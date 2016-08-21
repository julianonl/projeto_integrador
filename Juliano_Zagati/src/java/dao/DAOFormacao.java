package dao;

import entidade.FormacaoZ;
import static java.util.Collections.list;
import java.util.List;
import javax.persistence.EntityManager;

public class DAOFormacao {

    private EntityManager em;
    DAOGenerico daoGen = new DAOGenerico();

    public void salvar(Object generico) {

        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.persist(generico);
        em.getTransaction().commit();
    }

    public void alterar(Object generico) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        em.merge(generico);
        em.getTransaction().commit();
    }

    public void remover(Class classe, Long id) {
        em = CriarEntityManager.getInstancia().getEm();
        em.getTransaction().begin();
        Object obj = em.find(classe, id);
        if (obj != null) {
            em.remove(obj);
        }
        em.getTransaction().commit();
    }

    public List listar(Class classe, Long id) {
        em = CriarEntityManager.getInstancia().getEm();
        List<Object> retorno = em.createQuery("from " + classe.getSimpleName()).getResultList();
        return retorno;
    }

    public List listarCondicao(Class classe, String cond) {
        em = CriarEntityManager.getInstancia().getEm();
        List<Object> retorno = em.createQuery("from " + classe.getSimpleName()).getResultList();
        return retorno;
    }

        public List<FormacaoZ> listaFormacao() {
        List<FormacaoZ> formacao=daoGen.listar(FormacaoZ.class);
        return formacao;
    }
    
}
