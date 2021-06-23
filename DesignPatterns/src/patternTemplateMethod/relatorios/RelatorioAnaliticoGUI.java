package patternTemplateMethod.relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import patternTemplateMethod.model.Produto;

public class RelatorioAnaliticoGUI extends GeradorDeRelatorios{

	@Override
	protected String gerarCabecalho() {
		SimpleDateFormat sdf = new SimpleDateFormat("H:m:s d/M/y G");
		return new String(
				"RELATORIO ANALITICO DE PRODUTOS VENDIDOS\n"+
				sdf.format(new Date()) +
				"\nALM Sistemas.\n"
		);
	}
	
	@Override
	protected void gerarVisualizacao(String cabecalho, String conteudo) {
		JOptionPane.showMessageDialog(null, cabecalho + conteudo, "Relatório Analitico", JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	protected String gerarConteudo(List<Produto> produtos) {
		StringBuilder conteudo = new StringBuilder();
		conteudo.append("\nPRODUTOS VENDIDOS\n");
		produtos.forEach(p -> {
			totalProdutos += p.getPreco();
			conteudo.append(p.getNome() + " R$ "+ p.getPreco() + "\n");		
		});
		conteudo.append("\nTOTAL VENDIDO: R$ "+totalProdutos);
		return conteudo.toString();
	}

}
