package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.pedido.acao.AcaoAposGerarPedido;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class GeraPedidoHandler {

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes){
        this.acoes = acoes;
    }

    private List<AcaoAposGerarPedido> acoes;

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), orcamento, LocalDateTime.now());

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
