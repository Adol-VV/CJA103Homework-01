package hv10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class hv10_2 {
	public static void main(String[] args) {
		
		hv10_2 hv = new hv10_2();
		int format = 0;
		double number;
		
		
		System.out.println("請輸入數字：");
		Scanner sc = new Scanner(System.in);
		while (!(sc.hasNextDouble())) {
			System.out.println("數字格式不正確,請再輸入一次!");
			sc.next();
		}
		number = sc.nextDouble();
		sc.nextLine();
		//---------------------
		System.out.println("欲格式化為(1)千分位(2)百分比(3)科學記號：");
		while (true) {
			if(sc.hasNextInt()) {
				format = sc.nextInt();
				if(format < 4 && format > 0) {
					break;
				}
			}
			System.out.println("格式不正確,請再輸入一次!");
			sc.nextLine();
		}
		sc.close();
		//---------------------
		if(format == 1) {
			System.out.println(hv.formatAsThousands(number));
		}else if (format ==2) {
			System.out.println(hv.formatAsPercentage(number));
		}else {
			System.out.println(hv.formatAsScientific(number));
		}
		
	}
	public String formatAsThousands(Double number) {
		Format dfm1 = new DecimalFormat("#,###.00");
		return dfm1.format(number);
	}
	public String formatAsPercentage(Double number) {
		Format dfm1 = new DecimalFormat("0.00%");
		return dfm1.format(number);
	}
	public String formatAsScientific(Double number) {
		Format dfm1 = new DecimalFormat("0.###E0");
		return dfm1.format(number);
	}
}
