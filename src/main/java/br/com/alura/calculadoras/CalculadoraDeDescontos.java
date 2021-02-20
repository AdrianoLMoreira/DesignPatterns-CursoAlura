package br.com.alura.calculadoras;

import br.com.alura.desconto.Desconto;
import br.com.alura.desconto.DescontoPorQtdItens;
import br.com.alura.desconto.DescontoPorValor;
import br.com.alura.desconto.SemDesconto;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

//EXEMPLO DE DESIGN PATTERN CHAIN OF RESPONSIBILITY
public class CalculadoraDeDescontos {

    //O CONSTRUTOR DO DESCONTO SEMPRE RECEBE UM NOVO DESCONTO ATÉ QUE NÃO EXISTA MAIS NENHUMA REGRA E RECEBE SEMD_DESCONTO
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoPorQtdItens(
                new DescontoPorValor(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
