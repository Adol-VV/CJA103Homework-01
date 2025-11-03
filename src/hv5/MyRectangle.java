package hv5;

public class MyRectangle {
	double width =10;
	double depth = 20;
	
	//=================================================
	public MyRectangle() {
	}
	public MyRectangle(double width,double depth) {
		setWidth(width);
		setDepth(depth);
	}
	//=================================================
	public void setWidth(double width) {
		if(width > 0) {
			this.width = width;
		}else {
			this.width = 1;
		}
		
		
	}
	public void setDepth(double depth) {
		if(depth > 0) {
			this.depth = depth;
		}else {
			this.depth = 1;
		}
	}
	//=================================================
	
	public double getArea(){
		return width * depth;
	}
	
}
