
package testes;

import dao.DAOGenerico;
import entidade.CidadeZ;
import entidade.EstadoZ;
import entidade.FormacaoZ;
import entidade.ParticipanteZ;


public class TesteParticipante {
    
    
     public static void main(String args[]) {

        DAOGenerico dao = new DAOGenerico();
        CidadeZ c = new CidadeZ();
        FormacaoZ f = new FormacaoZ();
        EstadoZ e = new EstadoZ();
        e.setNome("Salvador");
        e.setSigla("SA");
        
        f.setFormacao("ensino superior");
        c.setNome("cidade");
        c.setEstado(e);
     
        ParticipanteZ p = new ParticipanteZ();
        
        p.setNome("Joao");
        p.setCpf("049.039.679-80");
        p.setTelefone("(44) 3432-1133");
        p.setEmail("joao@gmail.com");
        p.setEndereco("Rua sat catarina 33");
      //  p.setCidade(c);
        p.setMatricula("123456");
      //  p.setFormacao(f);
        dao.inserir(p);
        
     
     
     
     
     }
     
     
     
     
    
}
