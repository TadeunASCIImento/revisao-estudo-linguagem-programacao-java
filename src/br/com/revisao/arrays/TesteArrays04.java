package br.com.revisao.arrays;

import java.security.SecureRandom;

/*
 * Operações matemáticas usando arrays.
 */

public class TesteArrays04 {

	private static final Integer ARRAY_LENGTH = 10; // define o tamanho do array.

	public static void main(String[] args) {

		Integer[] array;
		for (int index = 0; index < ARRAY_LENGTH; index++) {
			array = generateArrayInteger(ARRAY_LENGTH);
			showArrayNumbers(array);
			showMessage("\n");
		}

	}

	private static void showArrayNumbers(Integer[] arrayInteger) {
		for (Integer integer : arrayInteger) {
			System.out.printf("%d%s ", integer, " ");
		}

	}

	// gera dez arrays de números inteiros aleatóriamente.
	private static Integer[] generateArrayInteger(Integer arrayLenght) {
		SecureRandom secureRandom = new SecureRandom();
		Integer[] arrayInteger = new Integer[arrayLenght];
		Integer seed = 100;
		for (int index = 0; index < arrayLenght; index++) {
			arrayInteger[index] = secureRandom.nextInt(seed);
		}
		return arrayInteger;
	}

	private static void showMessage(String message) {
		System.out.print(message);
	}

}
