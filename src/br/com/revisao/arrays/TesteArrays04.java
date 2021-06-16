package br.com.revisao.arrays;

import java.security.SecureRandom;

/*
 * Opera��es matem�ticas usando arrays.
 */

public class TesteArrays04 {

	private static final Integer ARRAY_LENGTH = 10; // define o tamanho do array.

	public static void main(String[] args) {

		Integer total = 0;
		Integer[] arrayInteger;
		// gera dez arrays de n�meros inteiros aleat�rios.
		for (int index = 0; index < ARRAY_LENGTH; index++) {
			arrayInteger = generateArrayInteger(ARRAY_LENGTH);
			showArraysNumbers(arrayInteger);
			total += sumArrayIntegersElements(arrayInteger);
			showMessage("\n");
		}
		System.out.printf("Resultado da soma de todos os arrays: %d", total);

	}

	// Exibe os n�meros nos dez arrays gerados aleat�riamente.
	private static void showArraysNumbers(Integer[] arrayInteger) {
		for (Integer integer : arrayInteger) {
			System.out.printf("%d%s ", integer, " ");
		}

	}

	// Soma todos elementos dos arrays de n�meros inteiros.
	private static Integer sumArrayIntegersElements(Integer[] arrayInteger) {
		Integer total = 0;
		for (Integer integer : arrayInteger) {
			total += integer;
		}
		return total;
	}

	// gera um array de n�meros inteiros aleat�riamente.
	private static Integer[] generateArrayInteger(Integer arrayLenght) {
		SecureRandom secureRandom = new SecureRandom();
		Integer[] arrayInteger = new Integer[arrayLenght];
		Integer seed = 100;
		for (int index = 0; index < arrayLenght; index++) {
			arrayInteger[index] = secureRandom.nextInt(seed);
		}
		return arrayInteger;
	}

	// Exibe as mensagens no console.
	private static void showMessage(String message) {
		System.out.print(message);
	}

}
