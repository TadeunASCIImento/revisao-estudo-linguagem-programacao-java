package br.com.revisao.arrays.exercicios;

import java.math.BigDecimal;

/*
 * Classe que representa o produto.
 */

public class Produto {

	private Long codigo;
	private String descricao;
	private BigDecimal valor;
	private Integer quantidade;

	public Produto(Long codigo, String descricao, BigDecimal valor, Integer quantidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	// cálcula o valor médio dos produtos.
	public static BigDecimal getValorMedio(Double total, Integer quantidade) {
		return new BigDecimal(total).divide(new BigDecimal(quantidade));

	}

	// cria e retorna uma lista de produtos.
	public static Produto[] getProdutos(Integer quantidade) {
		Produto[] produtos = new Produto[quantidade];
		Long[] codigos = { 1001l, 1002l, 1003l, 1004l, 1005l };
		String descricao = "smartphone";
		Double[] valores = { 1290.99, 1469.98, 990.00, 790.95, 1350.00 };
		for (int index = 0; index < quantidade; index++) {
			produtos[index] = new Produto(codigos[index], descricao, new BigDecimal(valores[index]), 10);
		}
		return produtos;
	}

	// busca produto pelo código e exibe a quantidade do mesmo.
	public static Produto getProduto(Long codigo, Produto[] produtos) {
		for (int index = 0; index < produtos.length; index++) {
			if (produtos[index].codigo.equals(codigo)) {
				return produtos[index];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return String.format("Produto codigo: %s, descricao: %s, valor: %s, quantidade: %d", codigo, descricao, valor,
				quantidade);
	}

}
////