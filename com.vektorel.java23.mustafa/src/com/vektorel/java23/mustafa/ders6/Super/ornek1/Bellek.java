package com.vektorel.java23.mustafa.ders6.Super.ornek1;

public class Bellek extends Flipflop{
int kapasite =128;
@Override
	public void kacAdet(int i) {
	double sonuc =i/kapasite;
		System.out.println(Math.ceil(sonuc));
		super.kacAdet(i);
	}

}

