
package controle;

import dao.DAOGenerico;
import entidade.ParticipanteZ;

/**
 *
 * @author Aluno
 */
public class TEste {
    public static void main(String[] args) {
        DAOGenerico dao=new DAOGenerico();
        
        ParticipanteZ p=new ParticipanteZ();
        p.setCpf("049.039.679-80");
        p.setNome("Juliano Zagati");
        p.setMatricula("2016");
        dao.inserir(p);
    }
    
}
