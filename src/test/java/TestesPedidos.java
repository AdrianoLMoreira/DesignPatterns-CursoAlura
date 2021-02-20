import br.com.alura.pedido.GeraPedido;
import br.com.alura.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int qtdItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qtdItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*Dados recebidos de um servico*/);
        handler.execute(gerador);
    }
}
