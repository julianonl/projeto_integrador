package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CriarEntityManager {

    private static CriarEntityManager criarem;
    private EntityManager em;

    public CriarEntityManager() {
        em = Persistence.createEntityManagerFactory("Juliano_ZagatiPU").createEntityManager();
    }

    public static CriarEntityManager getInstancia() {
        if (criarem == null) {
            criarem = new CriarEntityManager();
            System.out.println("criado");
        }
        return criarem;
    }

    public EntityManager getEm() {
        return em;
    }
}
