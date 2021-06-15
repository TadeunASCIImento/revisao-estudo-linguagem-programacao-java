package br.com.revisao.arrays;

import java.util.Scanner;

/*
 * Comparando Strings entre arrays diferentes.
 */

public class TesteArrays03 {

	private static final String INPUT_USER_MESSAGE = "Digite três palavras:";
	private static final String RESULT_MESSAGE = "existe na lista de palavras.";
	private static final String SHOW_PALAVRAS_MESSAGE = "palavras na lista:";
	private static final Integer SIZE_LIST = 3;
	private static Scanner scanner;

	public static void main(String[] args) {
		showMessageUser(INPUT_USER_MESSAGE);
		String[] palavras = new String[SIZE_LIST];
		for (int index = 0; index < SIZE_LIST; index++) {
			palavras[index] = scanner();
			if (index < SIZE_LIST - 1)
				System.out.println("próxima?");
		}
		showMessageUser(SHOW_PALAVRAS_MESSAGE);
		showPalavras(palavras);
		String[] _palavras = { "filmes", "séries", "documentários" };
		getEquals(palavras, _palavras);

	}

	public static String scanner() {
		scanner = new Scanner(System.in);
		String string = scanner.next();
		return string;
	}

	public static void showMessageUser(String message) {
		System.out.print(message);
	}

	public static void showPalavras(String[] palavras) {
		for (String palavra : palavras) {
			showMessageUser(palavra.concat(" "));
		}
		System.out.println("\n");
	}

	private static void getEquals(String[] palavras, String[] _palavras) {
		for (int palavra = 0; palavra < _palavras.length; palavra++) {
			for (int _palavra = 0; _palavra < _palavras.length; _palavra++) {
				if (palavras[palavra].contains(_palavras[_palavra])) {
					showMessageUser("A palavra ".concat(palavras[palavra]).concat(" ".concat(RESULT_MESSAGE)));
					System.out.println("\n");
				}
			}
		}
	}
}