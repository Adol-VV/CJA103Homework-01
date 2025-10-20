package hv2;

public class Homework2_3 {
	
	public static void main(String[] args) {
		
//		請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		
		
		for(int i = 0 ; i < 6; i++) {
			for(int n = 0; n<=i;n++) {
				System.out.print((char)(i + 'A'));
			}
			System.out.println();
		}
		
	}
}
