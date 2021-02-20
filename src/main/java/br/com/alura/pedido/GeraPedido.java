package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class GeraPedido {

    private LocalDateTime dataPedido;
    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdItens){
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
    };


}
