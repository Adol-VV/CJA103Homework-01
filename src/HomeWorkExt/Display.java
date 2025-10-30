package HomeWorkExt;

public class Display {
	
	public static void main(String[] args) {
		Pen[] pens = new Pen[2];
		pens[0] = new Pencil("Pencil",10);
		pens[1] = new InkBrush("InkBrush",10);
		
		for(int i = 0 ; i < pens.length ; i++) {
			System.out.println("商品名稱：" + pens[i].getBrand());
			System.out.println("價格：" + pens[i].getPrice());
			pens[i].write();
		}
		
		
		
	}

}
