package hv4;

import java.time.Year;
import java.util.Scanner;

public class hv4_3 {
	
	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		
		System.out.println("請分別輸入日期 依照 年 月 日 ：");
		try (Scanner sc = new Scanner(System.in)) {
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			int[] days = {31, 28, 31, 30, 31, 30,
			        31, 31, 30, 31, 30, 31};
			if(Year.isLeap(year)) {
				days[1] = 29;
			}
			//判斷資料正確--------------
			if(month < 1 | month > 12) {
				System.out.println("月份輸入錯誤");
				return;
			}
			if(day < 1 | day > days[month - 1]) {
				System.out.println("日期輸入錯誤");
				return;
			}
			//-------------------------
			int count = 0 ;
			for(int i = 0 ; i < month ;i++) {
				count += days[i];
			}
			count += day;
			System.out.println("輸入的日期為該年第"+count+"天");
		}
	}

}
