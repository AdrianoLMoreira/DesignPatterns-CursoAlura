package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    //PROTECTED PARA CLASSE FILHA CONSEGUIR ACESSAR O ATRIBUTO
    protected Desconto proximo;

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    protected abstract boolean deveAplicar(Orcamento orcamento);
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
}
