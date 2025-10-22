package hv3;

import java.util.Scanner;

public class Homework3_2 {
	
	public static void main(String[] args) {
		/*請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
		對則顯示正確訊息。
		(提示:Scanner,亂數方法,無窮迴圈)
		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)*/
		int correct = (int)(Math.random()*101);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("開始猜數字囉！");
			do
			{
				int answer = sc.nextInt();
				
				if(answer < correct) {
					System.out.println("猜錯囉！ 回答小於正確答案");
				}else if(answer > correct) {
					System.out.println("猜錯囉！ 回答大於正確答案");
				}else {
					System.out.println("回答正確");
					break;
				}
			}
			while(true);
		}
	}
	
}
