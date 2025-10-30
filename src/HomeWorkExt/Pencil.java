package HomeWorkExt;

public class Pencil extends Pen {
	
	public Pencil(String brand,float price) {
		this.brand = brand;
		this.price = price * 0.8f;
	}
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
		
	}

}
