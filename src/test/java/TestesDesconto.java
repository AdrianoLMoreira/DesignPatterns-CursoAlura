import br.com.alura.calculadoras.CalculadoraDeDescontos;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconto {

    public static void main(String[] args) {
        Orcamento orc1 = new Orcamento(new BigDecimal("150"), 6);
        Orcamento orc2 = new Orcamento(new BigDecimal("250"), 2);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println("Desconto para orçamento com mais de 5 itens é de 0.5 = "+ calculadora.calcular(orc1));
        System.out.println("Desconto para orçamento com valor maior que 200,00 é de 0.9 = "+ calculadora.calcular(orc2));
    }

}
