package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

//AQUI SERIA UM REPOSITORY -- ESSA CLASSE É APENAS UM EXEMPLO PARA APLICAR O DESIGN PATTERN
public class SalvarDadosPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Salvar os dados do pedido no banco");
    }

}
