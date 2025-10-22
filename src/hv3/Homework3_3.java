package hv3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
	
	public static void main(String[] args) {
		
		/*阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
		的號碼與總數。
		(提示:Scanner)
		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)*/
		int[] number = new int[49];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		
		System.out.println("輸入不想要的數字1~9：");
		int dislike = sc.nextInt();
		//把不喜歡的數字剔除
		int[] avalibleNumber = new int[49];
		int count = 0;
		for(int i = 0; i < number.length; i++) {
			if(!String.valueOf(number[i]).contains(String.valueOf(dislike))) {
				avalibleNumber[count] = number[i] ;
				count ++;
			}
		}
		System.out.println("可選號碼：");
		for(int i = 0 ; i < count ; i++ ) {
			System.out.print(avalibleNumber[i] + "  ");
		}
		System.out.println();
		System.out.println("總數：" + count);
		
		//隨機6個
		Random rand = new Random();
		int[] chosen = new int[6];
		int choseCount = 0;
		
		while(choseCount < 6) {
			int x = avalibleNumber[rand.nextInt(count)];
			
			//檢查是否已獲得
			boolean isGet = false;
			for(int i = 0; i < choseCount ; i++) {
				if(chosen[i] == x ) {
					isGet = true;
					break;
				}
			}
			
			if(!isGet) {
				chosen[choseCount] = x;
				choseCount ++;
			}
			
		}
		Arrays.sort(chosen);
		System.out.print("隨機選出的6個號碼：");
		for(int i = 0 ;i < choseCount; i ++) {
			System.out.print(chosen[i] +"  ");
		}
		
	}

}
