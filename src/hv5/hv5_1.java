package hv5;

import java.util.Arrays;
import java.util.Scanner;

public class hv5_1 {
	
	public static void main(String[] args) {
		try (
		//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
		Scanner sc = new Scanner(System.in)) {
			int width,height;
			System.out.println("請輸入寬與高：");
			width = sc.nextInt();
			height = sc.nextInt();
			
			for(int i = 0;i < height;i++) {
				for(int z = 0;z < width;z++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		hv5_1 hv5 = new hv5_1();
		hv5.randAvg();
	}
	
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	private void randAvg() {
		
		System.out.println("本次亂數的結果：");
		int[] rang = new int[10];
		int count = 0;
		for(int i = 0 ; i < 10;i++) {
			
			boolean isGet = false;
			int number = (int)(Math.random()*101);
			for(int z = 0 ; z < count ; z++) {
				if(rang[z] == number) {
					isGet = true;
					break;
				}
			}
			
			if(!isGet) {
				rang[i] = number;
				count++;
			}
		}
		System.out.println(Arrays.toString(rang));
		int sum = 0 ;
		for(int i = 0 ;i <rang.length;i++) {
			sum += rang[i];
		}
		double avg = sum / rang.length ;
		System.out.println("平均：" + avg);
	}

}
