package patternTemplateMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import patternTemplateMethod.model.Produto;
import patternTemplateMethod.relatorios.GeradorDeRelatorios;
import patternTemplateMethod.relatorios.RelSimplesConsole;

public class Main {

	public static void main(String[] args) {
		List<Produto> listaProdutos = new ArrayList<>();
		
		listaProdutos.addAll(Arrays.asList(
				new Produto("Mouse", 15.00), 
				new Produto("Monitor", 500.00),
				new Produto("Smartphone", 1200.00)
				));
		
		GeradorDeRelatorios relSimples = new RelSimplesConsole();
		relSimples.gerarRelatorio(listaProdutos);
	}
}
