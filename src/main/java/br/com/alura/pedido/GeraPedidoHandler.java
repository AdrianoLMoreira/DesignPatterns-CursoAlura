package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), orcamento, LocalDateTime.now());

        System.out.println("Enviar orçamento por email.");
    }
}
