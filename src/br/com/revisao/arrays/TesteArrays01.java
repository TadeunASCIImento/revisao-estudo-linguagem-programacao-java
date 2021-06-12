package br.com.revisao.arrays;

public class TesteArrays01 {

	public static void main(String[] args) {
		Integer[] array = createIntegerArray();
		showIntegerArray(array);
	}

	private static Integer[] createIntegerArray() {
		// constante que define o tamanho o do array.
		final int ARRAY_LENGTH = 10;
		Integer[] arrayInteger = new Integer[ARRAY_LENGTH];
		for (int index = 0; index < arrayInteger.length; index++) {
			// populando o array com o valor de index ao quadrado
			arrayInteger[index] = (int) Math.pow(index, 2);
		}
		return arrayInteger;
	}

	private static void showIntegerArray(Integer[] integerArray) {
		System.out.print("Elementos no array: ");
		for (Integer integer : integerArray) {
			System.out.printf("%d ", integer);
		}
	}

}
