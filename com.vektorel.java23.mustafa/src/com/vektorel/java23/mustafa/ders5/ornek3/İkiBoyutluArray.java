package com.vektorel.java23.mustafa.ders5.ornek3;

public class ÝkiBoyutluArray {
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i * j;
				System.out.println(array[i][j]);
			}
		}
	}
}
