package com.vektorel.java23.mustafa.ders5.Araba;

public class Islem {
	public static void main(String[] args) {
		BinekAraba binekAraba = new BinekAraba();
		binekAraba.setMotor(1600);
		binekAraba.setMarka("Honda");
		binekAraba.setRenk("Gri");
		binekAraba.setTup(true);
		System.out.println(binekAraba.getMarka() + " " + binekAraba.getMotor() + " " + binekAraba.getRenk()
				+ " Tüplü mü?  " + binekAraba.isTup());
		SporAraba sAraba = new SporAraba();
		sAraba.setMotor(3000);
		sAraba.setMarka("BMW");
		sAraba.setRenk("Mavi");
		System.out.println(sAraba.getMarka() + " " + sAraba.getMotor() + " " + sAraba.getRenk());
	}

}
