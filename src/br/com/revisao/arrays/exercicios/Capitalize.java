package br.com.revisao.arrays.exercicios;

public class Capitalize {

	public static void main(String[] args) {
		System.out.print(capitalize("tadeu"));
	}

	private static String capitalize(String string) {
		return string.substring(0, 1).toUpperCase().concat(string.substring(1, string.length()));
	}

}
