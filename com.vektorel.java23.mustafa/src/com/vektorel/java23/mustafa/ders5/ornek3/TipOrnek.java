package com.vektorel.java23.mustafa.ders5.ornek3;

public class TipOrnek {
	public static void main(String[] args) {
		topla(1, 3);
		carp(5, 4);
		bol(6,3);
		cýkar(5,2);
		kokAl(16);
		delta(4,8,2);
		usAl(3,5);
		kokBul(6,2,4);
	}
	static void topla(int a, int b) {
		System.out.println(a + b);
	}

	static void carp(int a, int b) {
		System.out.println(a * b);
	}
	static void bol(int a, int b){
		System.out.println(a/b);
	}
	static void cýkar(int a, int b){
		System.out.println(a-b);
	}
	static void kokAl(int a){
		System.out.println(Math.sqrt(a));
	}
	static void usAl(int a,int b){
		System.out.println(Math.pow(a, b));
	}
	static void delta(double a,double b,double c){
		System.out.println(Math.sqrt(Math.pow(b, 2)-(4*a*c)));
	}
	static double kokBul(double b,double a,double c){+
		System.out.println((-b+Math.sqrt(Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a));
		return;
	}
}


