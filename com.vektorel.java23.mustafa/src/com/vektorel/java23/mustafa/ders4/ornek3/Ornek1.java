package com.vektorel.java23.mustafa.ders4.ornek3;

import java.util.Scanner;

public class Ornek1 {
	public static void main(String[] args) {
		int sayi;
		int toplam = 0;
		double ortalama;
		int sayac = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.println(i + ". sayi giriniz :");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
			
		}
		ortalama = toplam / sayac;
		int sonDeger = ortalamaBul(ortalama);
		System.out.println(sonDeger);
	}

	private static int ortalamaBul(double ortalama) {
		if (ortalama % 2 == 0) {
			return ciftOrt(ortalama);

		} else {
			return tekOrt(ortalama);

		}

	}

	private static int tekOrt(double ortalama) {

		return (int) Math.pow(3, ortalama);
	}

	private static int ciftOrt(double ortalama) {

		return (int) Math.pow(2, ortalama);
	}
	
}
