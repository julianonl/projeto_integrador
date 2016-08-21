package controle;

import dao.DAOCidade;
import dao.DAOFormacao;
import dao.DAOGenerico;
import dao.DAOPalestrante;
import dao.DAOParticipante;
import entidade.CidadeZ;
import entidade.FormacaoZ;
import entidade.PalestranteZ;
import entidade.ParticipanteZ;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@RequestScoped
public class ControlePalestrante {

    private PalestranteZ palestrante = new PalestranteZ();
    private DAOGenerico daoGener = new DAOGenerico();
    private DAOPalestrante dao = new DAOPalestrante();

    public ControlePalestrante() {
    }

    public List<SelectItem> getFormacao() {

        List<SelectItem> item = new ArrayList<SelectItem>();
        DAOFormacao daoFor = new DAOFormacao();
        for (FormacaoZ f : daoFor.listaFormacao()) {
            item.add(new SelectItem(f, f.getFormacao()));
        }
        return item;
    }

    public List<SelectItem> getCidade() {
        List<SelectItem> item = new ArrayList<SelectItem>();
        DAOCidade daoCid = new DAOCidade();
        for (CidadeZ c : daoCid.listaCidade()) {
            item.add(new SelectItem(c, c.getNome()));
        }
        return item;
    }

    public List<PalestranteZ> getLista() {

        return listaPar();
    }

    public String salvar() {

        daoGener.inserir(palestrante);
        return "cadastros";
    }

    public String acaoAlterar(PalestranteZ palestrante) {

        this.palestrante = palestrante;

        return "cadastros";
    }

    public String alterar(PalestranteZ palestrante) {
        dao.alterar(palestrante);
        return "cadastros";
    }

    public String excluirPalestrante(long id) {
        daoGener.remover(palestrante.getClass(), id);
        return "cadastros";
    }

    public PalestranteZ getPalestrante() {
        return palestrante;
    }

    public void setParticipante(PalestranteZ palestrante) {
        this.palestrante = palestrante;
    }

    public List<PalestranteZ> listaPar() {
        List<PalestranteZ> palestrante = daoGener.listar(PalestranteZ.class);
        return palestrante;
    }

}
