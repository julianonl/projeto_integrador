package dao;

import java.util.List;
import javax.persistence.EntityManager;

public class DAOGenerico {



        private EntityManager em;

        public void inserir(Object obj) {
            em = CriarEntityManager.getInstancia().getEm();
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        }

        public void alterar(Object obj) {
            em = CriarEntityManager.getInstancia().getEm();
            em.getTransaction().begin();
            em.merge(obj);
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

        public Object buscarPorId(Class classe, Long id) {
            em = CriarEntityManager.getInstancia().getEm();
            Object retorno = em.find(classe, id);
            return retorno;
        }

        public List listar(Class classe) {
            em = CriarEntityManager.getInstancia().getEm();
            List<Object> retorno = em.createQuery("from " + classe.getSimpleName()).getResultList();
            return retorno;
        }

        public List listarCondicao(Class classe, String condicao) {
            em = CriarEntityManager.getInstancia().getEm();
            List<Object> retorno = em.createQuery("from " + classe.getSimpleName() + " where " + condicao).getResultList();
            return retorno;
        }
    }

