package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Enviar email com dados do pedido");
    }

}
