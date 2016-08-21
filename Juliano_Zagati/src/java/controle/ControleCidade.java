
package controle;

import dao.DAOCidade;
import dao.DAOEstado;
import entidade.CidadeZ;
import entidade.EstadoZ;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@RequestScoped
public class ControleCidade {

    public ControleCidade() {
    }
    private DAOCidade dao = new DAOCidade();
    CidadeZ cidade = new CidadeZ();

    public CidadeZ getCidade() {

        return cidade;
    }

    public List<SelectItem> getEstado() {

        List<SelectItem> item = new ArrayList<SelectItem>();
        DAOEstado daoEstado = new DAOEstado();
        for (EstadoZ e : daoEstado.listaEstado()) {
            item.add(new SelectItem(e, e.getNome()));
        }
        return item;
    }

    public void setCidade(CidadeZ cidade) {
        this.cidade = cidade;

    }

    public List<CidadeZ> getLista() {

           return dao.listaCidade();
    }

    public String salvar() {
        DAOCidade dao = new DAOCidade();

        dao.salvar(cidade);
        return "cadastroEstado";
    }

    public String acaoAlterar(CidadeZ cidade) {
        this.cidade = cidade;
        return "cadastroEstado";
    }

    public String altera() {
        DAOCidade dao = new DAOCidade();
        dao.alterar(this.cidade);
        return "cadastroEstado";
    }

    public String excluir(CidadeZ cidade) {
        DAOCidade dao = new DAOCidade();
        dao.remover(cidade);
        return "cadastroEstado";
    }
    
}
