package hv5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		MyRectangle mr = new MyRectangle();
		System.out.println("初始長方形面積 : " + mr.getArea());
		MyRectangle mr1 = new MyRectangle(20,50);
		System.out.println("長方形面積 : " + mr1.getArea());
		mr.setWidth(5);
		mr.setDepth(10);
		System.out.println("Set長方形面積 : " + mr.getArea());
	}

}
