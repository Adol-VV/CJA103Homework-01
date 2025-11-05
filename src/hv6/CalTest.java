package hv6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator ca = new Calculator();
		
		int x,y;
		boolean isSuccess = false;
		
		while(!isSuccess) {
			
			x = readText(sc,"x");
			y = readText(sc,"y");
			
			try {
				int total = ca.powerXY(x, y);
				isSuccess = true;
				System.out.println(x+"的"+y+"次方等於"+total);
			}catch(CalException e){
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static int readText(Scanner sc,String text) {
		boolean isCorrect = false;
		int result = 0; 
		
		while(!isCorrect) {
			System.out.println("請輸入"+text + "的值：");
			if(sc.hasNextInt()) {				
				result = sc.nextInt();
				isCorrect = true;
			}else {
				System.out.println("格式輸入不正確");
				sc.next();
			}
		}
		return result;
	}
}
