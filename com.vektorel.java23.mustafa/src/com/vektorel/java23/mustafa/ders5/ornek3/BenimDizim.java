package com.vektorel.java23.mustafa.ders5.ornek3;

public class BenimDizim {
	public static void main(String[] args) {
		int[] array = new int[]{4,16,25,36};

		arrayBul(array);
	}

	private static int[] arrayBul(int[] array) {
		int[] newArray = new int[array.length];
		int sonuc;
		for (int i = 0; i < array.length; i++) {

			sonuc = (int) Math.pow(array[i], 2);
			newArray[i] = sonuc;

		}
		for (int i = 0; i < newArray.length; i++) {

			System.out.println(newArray[i]);

		}
		return newArray;
	}
}
