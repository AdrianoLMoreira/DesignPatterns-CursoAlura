package br.com.alura.orcamento;

import br.com.alura.orcamento.situacao.EmAnalise;
import br.com.alura.orcamento.situacao.SituacaoOrcamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Orcamento {

    private BigDecimal valor;
    private int qtdItens;
    private SituacaoOrcamento situacao;

    public Orcamento(){
        this.situacao = new EmAnalise();
    }
    public Orcamento(BigDecimal valor,int qtdItens){
        this.valor = valor;
        this.qtdItens = qtdItens;
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

}
