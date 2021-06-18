package br.com.revisao.arrays;

import java.security.SecureRandom;

/*
 * Operações matemáticas usando arrays.
 */

public class TesteArrays04 {

	private static Integer size = 2; // define o tamanho dos arrays.

	public static void main(String[] args) {

		// Gera e exibe dois arrays de números inteiros.
		imprimirMensagenNoConsole("Elementos no array1: ");
		Integer[] arrayDeInteiros1 = gerarArrayDeInteiros(size);
		exibirArray(arrayDeInteiros1);

		imprimirMensagenNoConsole("Elementos no array2: ");
		Integer[] arrayDeInteiros2 = gerarArrayDeInteiros(size);
		exibirArray(arrayDeInteiros2);

		// Exibe a soma de todos elementos do array1 com array2
		Integer totalSoma = operacao("somar", arrayDeInteiros1, arrayDeInteiros2);
		imprimirMensagenNoConsole("Soma de todos elementos dos arrays:".concat(totalSoma.toString()));

		System.out.println("\n");

		Integer totalMultiplicacao = operacao("multiplicar", arrayDeInteiros1, arrayDeInteiros2);
		imprimirMensagenNoConsole("multiplição de todos elementos dos arrays:".concat(totalMultiplicacao.toString()));

		System.out.println("\n");

	}

	// efetua a operação indicada sobre os arrays e retorna o resultado.
	private static Integer operacao(String operacao, Integer[]... arrays) {
		Integer total = 0;
		for (int index = 0; index < arrays.length; index++) {
			switch (operacao) {
			case "somar":
				total += arrays[0][index] + arrays[1][index];
				try {
					System.out.printf("%d + %d + %d + %d ", arrays[0][index], arrays[0][index + 1], arrays[1][index],
							arrays[1][index + 1]);
				} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

				}
				break;
			case "multiplicar":
				// multiplica todos os elementos nos arrays sucessivamente.
				total = arrays[0][0] * arrays[0][index] * arrays[1][0] * arrays[1][index];
				try {
					System.out.printf("%d x %d x %d x %d ", arrays[0][index], arrays[0][index + 1], arrays[1][index],
							arrays[1][index + 1]);
				} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

				}
				break;
			default:
				break;
			}
		}
		return total;
	}

	// Exibe os elementos nos arrays.
	private static void exibirArray(Integer[] array) {
		for (Integer integer : array) {
			System.out.printf("\t%d", integer);
		}
		System.out.println("\n");

	}

	// Exibe as mensagens no console.
	private static void imprimirMensagenNoConsole(Object mensagem) {
		System.out.print(mensagem);
	}

	// Gera um array de inteiros aleatórios com o tamanho definido em size.
	private static Integer[] gerarArrayDeInteiros(Integer size) {
		Integer seed = 10;// define uma semente para os elementos no array.
		SecureRandom geradorRandomicoSeguro = new SecureRandom();
		Integer[] arrayInteiros = new Integer[size];
		for (int index = 0; index < arrayInteiros.length; index++) {
			arrayInteiros[index] = 1 + geradorRandomicoSeguro.nextInt(seed);
		}
		return arrayInteiros;
	}
}