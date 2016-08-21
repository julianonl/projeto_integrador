package controle;

import dao.DAOCidade;
import dao.DAOFormacao;
import dao.DAOGenerico;
import dao.DAOParticipante;
import entidade.CidadeZ;
import entidade.FormacaoZ;
import entidade.ParticipanteZ;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class ControleParticipante {

    private ParticipanteZ participante = new ParticipanteZ();
    private DAOGenerico daoGener = new DAOGenerico();
    private DAOParticipante dao = new DAOParticipante();

    public ControleParticipante() {
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

    public List<ParticipanteZ> getLista() {

        return listaPar();
    }

    public String salvar() {

        daoGener.inserir(participante);
        return "listaParticipantes";
    }

    public String acaoAlterar(ParticipanteZ participante) {

        this.participante = participante;

        return "cadastros";
    }

    public String alterar(ParticipanteZ participante) {
        dao.alterar(participante);
        return "cadastros";
    }

    public String excluirParticipante(long id) {
        daoGener.remover(participante.getClass(), id);
        return "cadastros";
    }

    public ParticipanteZ getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteZ participante) {
        this.participante = participante;
    }

    public List<ParticipanteZ> listaPar() {
        List<ParticipanteZ> participante = daoGener.listar(ParticipanteZ.class);
        return participante;
    }

}
