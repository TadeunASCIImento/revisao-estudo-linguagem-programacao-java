package br.com.revisao.arrays;

import java.security.SecureRandom;

/*
 * @author TadeunASCIImento
 */

/*
 * Usando arrays multidimensionais.
 */

public class TesteArrays05 {

	private static Integer linhas = 5;
	private static Integer colunas = 5;
	private static final Integer semente = 100;

	public static void main(String[] args) {

		// tipos dos arrays gerados.
		String tipos[] = { "Integer", "Double", "Float", "BigInteger" };

		// Cria um array multidimensional do tipo Integer.
		Integer array[][] = new Integer[linhas][colunas];
		array = (Integer[][]) gerador(linhas, colunas, tipos[0]);

		// Cria um array multidimensional do tipo Double.
		Double _array[][] = new Double[linhas][colunas];
		_array = (Double[][]) gerador(linhas, colunas, tipos[1]);

		// Cria um array multidimensional do tipo Float.
		Float[][] __array = new Float[linhas][colunas];
		__array = (Float[][]) gerador(linhas, colunas, tipos[2]);

		// mostrando os arrays gerados.
		exibir(array);
		exibir(_array);
		exibir(__array);
	}

	// retorna um array bidimensional numérico baseado no tipo.
	private static Number[][] gerador(Integer linhas, Integer colunas, String tipo) {
		SecureRandom random = new SecureRandom(); // gerador de números aleatórios.
		switch (tipo) {
		case "Integer":
			Integer[][] array = new Integer[linhas][colunas];
			for (int linha = 0; linha < linhas; linha++) {
				for (int coluna = 0; coluna < colunas; coluna++) {
					array[linha][coluna] = 1 + random.nextInt(semente);
				}
			}
			return array;
		case "Double":
			Double[][] _array = new Double[linhas][colunas];
			for (int linha = 0; linha < linhas; linha++) {
				for (int coluna = 0; coluna < colunas; coluna++) {
					_array[linha][coluna] = 1 + random.nextDouble();
				}
			}
			return _array;
		case "Float":
			Float[][] __array = new Float[linhas][colunas];
			for (int linha = 0; linha < linhas; linha++) {
				for (int coluna = 0; coluna < colunas; coluna++) {
					__array[linha][coluna] = 1 + random.nextFloat();
				}
			}
			return __array;
		default:
			break;
		}
		return null;
	}

	private static void exibir(Number[][] array) {
		String controle = "%s";
		String classe = array.getClass().getName().substring(13, array.getClass().getName().length() - 1);
		if (controle.equalsIgnoreCase("Integer")) {
			controle = "%d";
		} else if (controle.equalsIgnoreCase("Double") || controle.equalsIgnoreCase("Float")) {
			controle = "%f";
		}
		for (int linha = 0; linha < array.length; linha++) {
			System.out.printf("tipo %s ", classe);
			for (int coluna = 0; coluna < array.length; coluna++) {
				System.out.printf(controle.concat(" "), array[linha][coluna]);
			}
			System.out.println("\n");
		}
	}

}
