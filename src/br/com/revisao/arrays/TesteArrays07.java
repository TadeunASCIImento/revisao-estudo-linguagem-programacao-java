package br.com.revisao.arrays;

import java.security.SecureRandom;
import java.util.Arrays;

public class TesteArrays07 {

	public static void main(String[] args) {

		// cria um array de 100 n�meros inteiros usando uma semente 200.
		Integer seed = 200;
		Integer[] array = new Integer[100];
		SecureRandom secureRandom = new SecureRandom();

		// popula o array.
		for (int indice = 0; indice < array.length; indice++) {
			array[indice] = 1 + secureRandom.nextInt(seed);
		}

		// exibe os elementos do array antes da ordena��o.
		System.out.print("Array em ordem original");
		showArray(array);

		Arrays.sort(array); // m�todo sort de Arrays, classifica os elementos em ordem crescente.

		// exibe os elementos do array ordenado.
		System.out.print("\n\nArray em ordem crescente");
		showArray(array);

		// Insere o valor 20 em todos as posi��es do array.
		Arrays.fill(array, 20);
		showArray(array);
		System.out.print("Array preenchido com o valor 20 em todas as posi��es.");

		// copiando os elementos de um array para outro.
		Integer[] _array = { 12, 45, 67, 23, 89, 90 };
		Integer[] copy = new Integer[_array.length];
		System.arraycopy(_array, 0, copy, 0, _array.length);
		showArray(_array);
		System.out.print("C�pia de _array.");

		// Comparando os elementos em dois arrays.
		boolean isEquals = Arrays.equals(_array, copy);
		System.out.printf("\n\n_array �  %s copy", (isEquals ? "igual �" : "diferente de"));

		// realiza busca bin�ria no array pelo elemento 23 caso exista retorna o ind�ce.
		Integer elemento = 90;
		Integer posicao = Arrays.binarySearch(_array, elemento);
		System.out.println("\n\nO n�mero ".concat(elemento.toString())
				.concat((posicao >= 0 ? " est� na posi��o ".concat(posicao.toString()) : " n�o foi localizado.")));
	}

	// Exibe os elementos do array.
	private static void showArray(Number[] array) {
		for (int indice = 0; indice < array.length; indice++) {
			if (indice % 30 != 0) {
				System.out.printf("%d ", array[indice]);
			} else {
				System.out.println("\n");
			}
		}
	}

}
