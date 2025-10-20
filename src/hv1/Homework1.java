package hv1;

public class Homework1 {
	
	public static void main(String [] args) {
		int day, hour,min,sec;
//		• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		//      + 是加法  *是乘法
		System.out.println("12與6的和 "+ (12+6) + " + " +"12與6的積 " +(12*6));
//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		//                / 是除法          %是取餘數
		System.out.println("共 " +(200/12) + "打 " + (200 % 12)+"顆");
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		//
		int totalSec = 256559;
		sec = totalSec%60;
		min = (totalSec/60) %60;
		hour = (totalSec/60/60) %24;
		day =  (totalSec/60/60/24);
		System.out.println( day + "天 " + hour +"小時 "+min + "分 "+ sec +"秒");
//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		// A = pi r*r
		System.out.printf("圓面積 = %.4f%n", (3.1415*(Math.pow(5,2))) );
		// C = 2 * pi * r
		System.out.printf("圓周長 = %.4f%n", (2*3.1415*5) );
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		// 公式  A=P(1+r)^t) 
		System.out.printf("共 %.2f  元%n" ,(1500000*(Math.pow((1+0.02),10))));
//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
		// 正常5+5 = 10
		System.out.println("5 + 5 = " +(5+5));
		// 5+ ASC '5' = 5+53 = 58
		System.out.println("5 + ‘5’ =" + (5 + '5'));
		//5 +字串 5 = "55"
		System.out.println("5 + “5” =" + 5 + "5" );
//		並請用註解各別說明答案的產生原因
	}

}
