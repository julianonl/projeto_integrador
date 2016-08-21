package testes;

import controle.ControleEstado;
import dao.DAOEstado;
import dao.DAOFormacao;
import dao.DAOGenerico;
import entidade.EstadoZ;
import java.util.List;

public class TestePersistencia {

    public static void main(String args[]) {

        DAOGenerico dao = new DAOGenerico();

        DAOEstado dao1 = new DAOEstado();
     //    EstadoZ e = new EstadoZ();
         ControleEstado c = new ControleEstado();
//      e.setNome("Ceara");
//     e.setSigla("ce");
//    dao.inserir(e);
//        Produto p=(Produto)dao.buscarPorId(Produto.class, 1L);
//        dao2.remover(EstadoZ.class, 1L);
//        List<EstadoZ> estados = dao.listar(EstadoZ.class);
//        for (EstadoZ e : estados) {
//            System.out.println(e.getId() + " " + e.getNome());
//        }

// List<EstadoZ> estadoZ = dao.listarCondicao(EstadoZ.class, "sigla='sp'");
        // System.out.println(estadoZ);
        
        
        List<EstadoZ> estados=c.getLista();
         for (EstadoZ e : estados) {
            System.out.println(e.getId() + " " + e.getNome());
        }
         
               List<EstadoZ> estado = dao.listar(EstadoZ.class);
         for (EstadoZ e : estados) {
            System.out.println(e.getId() + " " + e.getNome());
        }
    }

}
