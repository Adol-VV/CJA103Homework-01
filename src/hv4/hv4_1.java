package hv4;

public class hv4_1 {
	
	public static void main(String[] args) {
//		• 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
		int[] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			sum += numbers[i]; 
		}
		float ave = sum / numbers.length;
		
		System.out.println(ave);
		
		for(int i = 0 ; i < numbers.length ; i++) {
			if(numbers[i] > ave) {
				System.out.print(numbers[i] + "\t");
			}
		}
		System.out.println();
		System.out.println("----------------NO.2-----------------");
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		StringBuilder s = new StringBuilder("Hello World").reverse();
		System.out.println(s);
		System.out.println("----------------NO.3-----------------");
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
		String[] planet = 
			{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String vowel = "aeiou";
		int count = 0 ;
		for(int i = 0 ; i < planet.length ; i++) {
			for(int z = 0 ; z < planet[i].length() ; z++) {
				char c = planet[i].charAt(z);
				if(vowel.indexOf(c) != -1) {
					count++ ;
				}
			}
		}
		System.out.println(count);
		
	}
	
}
