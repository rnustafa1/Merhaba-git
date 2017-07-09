package com.vektorel.java23.mustafa.ders5.ornek3;

import java.util.Scanner;

public class DonguOperatorKosul {
	public static void main(String[] args) {
	Scanner klavye= new Scanner(System.in);
	System.out.println("Not giriniz:");
	int not =	klavye.nextInt();
//	int not = 85;
		if (not>=90 && not<=100) {
			System.out.println("Öðrencinin notu AA");
		}else if (not>=80 && not<90) {
			System.out.println("Öðrencinin notu BB");

		} else if (not>=70 && not<80) {
			System.out.println("Öðrencinin notu CC");
			
		}else if (not>=60 && not<70) {
			System.out.println("Öðrencinin notu DD");
		}else if  (not<60) {
			System.out.println("Öðrencinin notu FF");
		}
	}

}
