package com.vektorel.java23.mustafa.ders6.Super;

public class Masa extends Odun {
@Override
protected void kurutma() {
	nemMiktari=(this.nemMiktari-((nemMiktari/100)*20))
	super.kurutma();
}
}
