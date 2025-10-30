package HomeWorkExt;

public class InkBrush extends Pen{

	public InkBrush(String brand,float price) {
		this.brand = brand;
		this.price = price * 0.9f;
	}
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}

}
