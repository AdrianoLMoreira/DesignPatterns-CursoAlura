package patternTemplateMethod.relatorios;

import java.util.List;

import patternTemplateMethod.model.Produto;

public class RelSimplesConsole extends GeradorDeRelatorios {

	@Override
	protected void gerarVisualizacao(String cabecalho, String conteudo) {
		System.out.println(cabecalho);
		System.out.println(conteudo);
	}
	
	private double totalProdutos = 0;
	
	@Override
	protected String gerarConteudo(List<Produto> produtos) {
		
		StringBuilder conteudo = new StringBuilder();
		
		produtos.forEach(p -> totalProdutos += p.getPreco());
		
		conteudo.append("QTD VENDIDA: "+ produtos.size());
		conteudo.append("\nTOTAL VENDIDO: "+ totalProdutos);
		return conteudo.toString();
		
	}

}
