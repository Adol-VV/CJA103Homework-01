package hv4;

import java.util.Arrays;

public class hv4_4 {
	
	public static void main(String[] args) {
//		班上有8位同學,他們進行了6次考試結果如下:
//      {1,10,37,100,77,98,90}
//		{2,35,75,70,95,70,80}
//		{3,40,77,79,70,89,100}
//		{4,100,89,90,89,90,75}
//		{5,90,64,75,60,75,50}
//		{6,85,75,70,75,90,20}
//		{7,75,70,79,85,89,99}
//		{8,70,95,90,89,90,75}
//			請算出每位同學考最高分的次數
		int[][] score ={{1,10,37,100,77,98,90},
		{2,35,75,70,95,70,80},
		{3,40,77,79,70,89,100},
		{4,100,89,90,89,90,75},
		{5,90,64,75,60,75,50},
		{6,85,75,70,75,90,20},
		{7,75,70,79,85,89,99},
		{8,70,95,90,89,90,75}};
		int[] count  = new int[8];
		for(int i = 1;i < score[0].length;i++) {
			int max = 0;
			int maxStudent = 0;
			for(int z = 0;z < score.length;z++) {
				if(score[z][i] > max) {
					max = score[z][i];
					maxStudent = z;
				}
			}
			count[maxStudent] +=1;
		}
		System.out.println(Arrays.toString(count));
		
	}
	

}
