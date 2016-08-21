package testes;

import controle.ControleEstado;
import dao.DAOGenerico;
import entidade.EstadoZ;
import entidade.FormacaoZ;
import java.util.List;

public class TesteFormacao {

    public static void main(String args[]) {

        DAOGenerico dao = new DAOGenerico();

        FormacaoZ f = new FormacaoZ();
        ControleEstado c = new ControleEstado();
        f.setFormacao("1 grau completo");
        dao.inserir(f);
//        Produto p=(Produto)dao.buscarPorId(Produto.class, 1L);
//        dao2.remover(EstadoZ.class, 1L);
//        List<EstadoZ> estados = dao.listar(EstadoZ.class);
//        for (EstadoZ e : estados) {
//            System.out.println(e.getId() + " " + e.getNome());
//        }

// List<EstadoZ> estadoZ = dao.listarCondicao(EstadoZ.class, "sigla='sp'");
        // System.out.println(estadoZ);
//        List<EstadoZ> estados = c.getLista();
//        for (EstadoZ e : estados) {
//            System.out.println(e.getId() + " " + e.getNome());
//        }
//
//        List<EstadoZ> estado = dao.listar(EstadoZ.class);
//        for (EstadoZ e : estados) {
//            System.out.println(e.getId() + " " + e.getNome());
//        }
    }

}
