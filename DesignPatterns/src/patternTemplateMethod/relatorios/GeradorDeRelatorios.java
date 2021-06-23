package patternTemplateMethod.relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import patternTemplateMethod.model.Produto;

public abstract class GeradorDeRelatorios {

	public double totalProdutos = 0;
	
	public final void gerarRelatorio(List<Produto> listaProduto) {
		String cabecalho = this.gerarCabecalho();
		String conteudo = this.gerarConteudo(listaProduto);
		this.gerarVisualizacao(cabecalho, conteudo);
	}
	
	protected abstract void gerarVisualizacao(String cabecalho, String conteudo);
	
	protected abstract String gerarConteudo(List<Produto> produtos);
	
	protected String gerarCabecalho() {
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
		return new String(
				"RELATORIO DE PRODUTOS VENDIDOS\n"+
				sdf.format(new Date()) +
				"\nALM Sistemas.\n"
		);
	}
	
}
