package hv2;

public class Homework2_1 {
	
	public static void main(String[] args) {
		
		int sum =0 ;
//		請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		for(int i = 1 ; i <=1000; i++) {
			if(i % 2 == 0) {
				sum += i;
				System.out.print(i + "+");
			}
		}
		System.out.println( "\n1~1000的偶數和為 "+sum );
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		 sum = 1;
		 for(int i = 1;i<=10;i++) {
			 sum *= i;
		 }
		 System.out.println( "for迴圈 1~10的連乘積為 "+sum );
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		 sum = 1;
		 int number = 1;
		 while(number <=10) {
			 sum*=number;
			 number+=1;
		 }
		 System.out.println( "while迴圈 1~10的連乘積為 "+sum );
		 
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		 sum = 0 ;
		 for(int i = 1 ; i <=100; i++) {
			 if( i % 2 != 0) {
				 sum += i ;
				 if(sum>100)
					 break;
				 System.out.print(  sum + " " );
			 }
		 }
	}
	
}
