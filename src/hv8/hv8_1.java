package hv8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class hv8_1 {
	
	public static void main(String[] args) {
//		• 請建立一個Collection物件並將以下資料加入:
//			Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//			Object物件、“Snoopy”、BigInteger(“1000”)
//
//			• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		//add element
		Collection<Object> element = new ArrayList<Object>();
		element.add(Integer.valueOf(100));
		element.add(Double.valueOf(3.14));
		element.add(Long.valueOf(21L));
		element.add(Short.valueOf("100"));
		element.add(Double.valueOf(5.1));
		element.add("Kitty");
		element.add(Integer.valueOf(100));
		element.add(new Object());
		element.add("Snoopy");
		element.add(BigInteger.valueOf(1000));
		
		//---print
		hv8_1 hv = new hv8_1();
		hv.printIterator(element);
		hv.printFor(element);
		hv.printForeach(element);
		
//		移除不是java.lang.Number相關的物件
//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		//remove 
		element.removeIf(obj->!(obj instanceof Number));
		hv.printIterator(element);
		hv.printFor(element);
		hv.printForeach(element);
		
		
	}
	private void printIterator(Collection<Object> element) {
		//*******************Iterator
		System.out.println("*****Iterator*****");
		Iterator it = element.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		};
		System.out.println();
	}
	private void printFor(Collection<Object> element) {
		System.out.println("*****for*****");
		List<Object> count = new ArrayList<Object>(element);
		for(int i = 0 ; i < count.size();i++) {
			System.out.print(count.get(i) + "\t");
		};
		
		System.out.println();
	}
	private void printForeach(Collection<Object> element) {
		
		System.out.println("*****foreach*****");
		for(Object obj : element) {
			System.out.print(obj + "\t");
		}
		System.out.println();
	}

}
