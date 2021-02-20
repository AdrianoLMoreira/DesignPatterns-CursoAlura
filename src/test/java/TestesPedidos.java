import br.com.alura.pedido.GeraPedido;
import br.com.alura.pedido.GeraPedidoHandler;
import br.com.alura.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.pedido.acao.EnviarEmailPedido;
import br.com.alura.pedido.acao.SalvarDadosPedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Cliente teste";
        BigDecimal valorOrcamento = new BigDecimal("250.00");
        int qtdItens = 3;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qtdItens);
        List<AcaoAposGerarPedido> acoes = new ArrayList<>();
        AcaoAposGerarPedido acao1 = new EnviarEmailPedido();
        AcaoAposGerarPedido acao2 = new SalvarDadosPedido();
        acoes.addAll(Arrays.asList(acao1, acao2));
        GeraPedidoHandler handler = new GeraPedidoHandler(acoes);
        handler.execute(gerador);
    }
}
