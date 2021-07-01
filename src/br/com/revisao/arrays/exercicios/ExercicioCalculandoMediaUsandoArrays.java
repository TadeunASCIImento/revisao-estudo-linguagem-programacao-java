package br.com.revisao.arrays.exercicios;

import java.math.BigDecimal;

/*
 *  Calculando o pre�o m�dio de um determinado produto usando arrays.
 */

public class ExercicioCalculandoMediaUsandoArrays {

	private static Integer quantidade = 5;

	public static void main(String[] args) {
		Double total = 0.0;
		String descricao = "";
		Produto[] produtos = Produto.getProdutos(quantidade);
		for (int index = 0; index < quantidade; index++) {
			descricao = produtos[0].getDescricao();
			total += produtos[index].getValor().doubleValue();
		}
		BigDecimal result = Produto.getValorMedio(total, quantidade);
		System.out.printf("valor m�dio do %s R$ %.2f ", descricao, result.doubleValue());
		
		Produto consulta = Produto.getProduto(1009l, produtos);
		if (!(consulta == null)) {
			System.out.println("\n");
			System.out.println(consulta);
		} else {
			System.out.println("\nProduto n�o localizado.");
		}

	}

}
