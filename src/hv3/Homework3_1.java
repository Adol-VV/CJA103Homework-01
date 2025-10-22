package hv3;

import java.util.Scanner;

public class Homework3_1 {
	
	public static void main(String[] args) {
		/*
		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
		三角形、其它三角形或不是三角形,如圖示結果:*/
		int x,y,z;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("請輸入三個整數：");
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
		}
		if (x + y <= z | x + z <= y | y + z <= x) {
			System.out.println("不是三角形");
		}else if (x == y && y == z) {
			System.out.println("正三角形");
		}else if (x == y | x == z | z ==y) {
			System.out.println("等腰三角形");
		}else if ((x*x) + (y*y) == (z*z) | (x*x) + (z*z) == (y*y) | (z*z) + (y*y) == (x*x)) {
			//a*a + b*b = c*c
			System.out.println("直角三角形");
		}else {
			System.out.println("其他三角形");
		}
		
		
		
	}

}
