package HomeWorkExt;

public abstract class Pen {
	
	String brand;
	float price;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public abstract void write();
}
