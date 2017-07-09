package Elbise;

public class Elbise extends Kumas {
	String model;
	
	@Override
	public void kumasKes() {
		System.out.println("Makina ile kes");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
