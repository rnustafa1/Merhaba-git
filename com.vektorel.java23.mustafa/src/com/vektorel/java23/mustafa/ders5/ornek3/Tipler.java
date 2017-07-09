package com.vektorel.java23.mustafa.ders5.ornek3;

public class Tipler {
	public static void main(String[] args) {
		byte bb = 3;
		System.out.println(bb);
		byte cc = 4;
		byte gg = (byte) (bb + cc);
		System.out.println(gg);
		short ss = 30;
		short dd = 40;
		System.out.println((ss + dd));
		// int ii=;
		long ll = 5l;
		//
		float ff = 1.5f;
//		double dd;
//		char cc = 'c';
		String sss = "Mustafa";
		
		fonksiyon(5,6);
	}
	static void fonksiyon(int a,int b){
		System.out.println(a+b);
	}
}
