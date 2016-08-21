
package controle;

import dao.DAOEstado;
import dao.DAOGenerico;
import entidade.EstadoZ;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ControleEstado {


    private DAOEstado dao = new DAOEstado();
    EstadoZ estado = new EstadoZ();

    public ControleEstado() {

    }

   

    public EstadoZ getEstado() {

        return estado;
    }

    public void setEstado(EstadoZ estado) {
        this.estado = estado;

    }

    public List<EstadoZ> getLista() {

        return dao.listaEstado();
    }

    public String salvar() {
        DAOGenerico dao = new DAOGenerico();
        dao.inserir(estado);
        return "cadastroEstado";
    }
    
    public String acaoAlterar(EstadoZ estado){
    
        this.estado = estado;
    
    return "cadastroEstado";
    }
    
    public String alterar(EstadoZ estado){
     DAOEstado dao = new DAOEstado();
        dao.alterar(estado);
    return "cadastroEstado";
    }
    
    public String excluir(long id){
    DAOGenerico dao = new DAOGenerico();
    dao.remover(estado.getClass(), id);
   return "cadastroEstado";
    }

}
