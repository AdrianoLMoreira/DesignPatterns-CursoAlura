package br.com.alura.calculadoras;

import br.com.alura.imposto.Imposto;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

//EXEMPLO DE DESIGN PATTERN STRATEGY
public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
