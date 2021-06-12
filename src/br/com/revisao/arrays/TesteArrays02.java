package br.com.revisao.arrays;

import java.util.Scanner;

/*
 * Calculando a m�dia dos elementos em um array.
 */

public class TesteArrays02 {

	private static Scanner scanner = new Scanner(System.in);// cria um fluxo de entrada.
	private static String message = "Digite os cinco n�meros para calcular a m�dia entre eles.";
	private static final Integer ARRAY_LENGTH = 5; // define o tamanho do array.
	private static Float[] numbers = new Float[ARRAY_LENGTH];// cria um array vazio. 

	public static void main(String[] args) {
		Float[] _numbers = getNumbersForCalculateMean(numbers);
		Float _result = calculateMean(_numbers);
		showUserMessage("A m�dia dos n�meros informados �: ".concat(_result.toString()));
	}

	// Exibe as mensagens ao usu�rio.
	private static void showUserMessage(String message) {
		System.out.println(message);
	}

	// Captura entrada do teclado para os n�meros e popula o array.
	private static Float[] getNumbersForCalculateMean(Float[] numbers) {
		showUserMessage(message);
		for (int index = 0; index < ARRAY_LENGTH; index++) {
			numbers[index] = scanner.nextFloat();
		}
		return numbers;

	}

	// Calcula m�dia dos n�meros informados.
	private static Float calculateMean(Float[] _numbers) {
		Float total = 0F;
		for (Float _number : _numbers) {
			total += _number;
		}
		Float mean = total / ARRAY_LENGTH;
		return mean;
	}

}
