package hv8;

import java.util.Objects;

public class Train implements Comparable<Train>{
//	請設計一個Train類別,並包含以下屬性:
//		- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//		- 目的地 dest,型別為String - 票價 price,型別為double
	int number;
	String type;
	String start;
	String dest;
	double price;
	
	
	public Train(int number ,String type,String start,String dest,Double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	//override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj instanceof Train) {
			Train tr = (Train)obj;
			return(this.number == tr.number);
		}
		return false;
	}
	public int hashCode() {
		
		return Objects.hash(number, type);

	}
	public String toString() {
		String trainClass = "班次:"+number+"  車種:"+type + "  出發地："+start+"  目的地："+dest+"  票價："+price;
		return trainClass;
	}
	public int compareTo(Train train){
		
		return Integer.compare(train.number, this.number); 
	}
	//getter/setter
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
