package com.vektorel.java23.mustafa.ders5.ornek3;

public class MySwitch {
	public static void main(String[] args) {
		int sonuc = Mat(5, 4, '+');
		System.out.println("Sonuç: ");
	}

	static int Mat(int a, int b, char key) {
		// int a=8,b=4;
		// char key='/' ;
		int sonuc = 0;
		switch (key) {
		case '+':
			sonuc = a + b;
			break;
		case '-':
			sonuc = a - b;
			break;
		case '*':
			sonuc = a * b;
			break;
		case '/':
			sonuc = a / b;
			break;
		default:
			break;
		}
		return 0;
	}
}