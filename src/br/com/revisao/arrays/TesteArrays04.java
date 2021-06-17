package br.com.revisao.arrays;

import java.security.SecureRandom;

/*
 * Operações matemáticas usando arrays.
 */

public class TesteArrays04 {

	private static Integer size = 2; // define o tamanho dos arrays.

	public static void main(String[] args) {

		// Gera e exibe dois arrays de números inteiros.
		imprimiAsMensagensNoConsole("Elementos no array1:");
		Integer[] arrayDeInteiros1 = gerarArrayDeInteiros(size);
		exibirElementosNoArray(arrayDeInteiros1);
		
		imprimiAsMensagensNoConsole("Elementos no array2:");
		Integer[] arrayDeInteiros2 = gerarArrayDeInteiros(size);
		exibirElementosNoArray(arrayDeInteiros2);

		// Exibe a soma de todos elementos do array1 com array2 
		Integer somaTotalArrays = somarTodosElementosDoArray(arrayDeInteiros1, arrayDeInteiros2);
		imprimiAsMensagensNoConsole("Soma de todos elementos dos arrays:".concat(somaTotalArrays.toString()));
	}

	// Soma os arrays e retorna o resultado..
	private static Integer somarTodosElementosDoArray(Integer[]... arrays) {
		Integer total = 0;
		for (int index = 0; index < size; index++) {
			total += arrays[0][index] + arrays[1][index];
		}
		return total;
	}

	// Exibe os elementos nos arrays.
	private static void exibirElementosNoArray(Integer[] array) {
		for (Integer integer : array) {
			System.out.printf("%d ", integer);
		}
		System.out.print("\n");

	}

	// Exibe as mensagens no console.
	private static void imprimiAsMensagensNoConsole(Object mensagem) {
		System.out.print(mensagem);
	}

	// Gera um array de inteiros aleatórios com o tamanho definido em size. 
	private static Integer[] gerarArrayDeInteiros(Integer size) {
		Integer seed = 100;// define uma semente para os elementos no array.
		SecureRandom geradorRandomicoSeguro = new SecureRandom();
		Integer[] arrayInteiros = new Integer[size];
		for (int index = 0; index < arrayInteiros.length; index++) {
			arrayInteiros[index] = 1 + geradorRandomicoSeguro.nextInt(seed);
		}
		return arrayInteiros;
	}
}