package br.com.revisao.arrays;

import java.security.SecureRandom;

/*
 * Modificando valores em arrays.
 */

public class TesteArrays06 {

	private static Integer tamanho = 10;
	private static Integer[] array = new Integer[tamanho];
	private static final Integer semente = 100;

	public static void main(String[] args) {

		// cria o array e exibe os elementos antes da chamada do m�todo modifyArray.
		showMensagem("Elementos originais do array.");
		array = createArray(tamanho);
		showArray(array);

		// exibe o array com os novos valores ap�s a chamada do m�todo modifyArray.
		showMensagem("Todos os elmentos do array elevados ao quadrado.");
		showArray(modifyArray(array));

		// dividindo o �ltimo elemento do array por 2.
		showMensagem("Divis�o do �ltimo elemento do array por 2");
		System.out.printf("%d", array[array.length - 1] / 2);

	}

	private static Integer[] createArray(Integer tamanho) {
		SecureRandom secureRandom = new SecureRandom();
		for (int index = 0; index < array.length; index++) {
			array[index] = 1 + secureRandom.nextInt(semente);
		}
		return array;
	}

	private static void showArray(Integer[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.printf("%d ", array[index]);
		}
		System.out.println("\n");
	}

	private static void showMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	private static Integer[] modifyArray(Integer[] array) {
		for (int index = 0; index < array.length; index++) {
			array[index] = (int) Math.pow(array[index], 2);
		}
		return array;
	}

}
