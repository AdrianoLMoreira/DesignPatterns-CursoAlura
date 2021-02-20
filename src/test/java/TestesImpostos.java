import br.com.alura.calculadoras.CalculadoraImpostos;
import br.com.alura.imposto.ICMS;
import br.com.alura.imposto.ISS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 4);
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        System.out.println("Valor do ICSM: "+calculadora.calcular(orcamento, new ICMS()));
        System.out.println("Valor do ISS: "+calculadora.calcular(orcamento, new ISS()));
    }
}
