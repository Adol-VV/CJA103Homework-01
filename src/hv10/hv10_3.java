package hv10;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class hv10_3 {
	public static void main(String[] args) {
		hv10_3 hv = new hv10_3();
		Scanner sc = new Scanner(System.in);
		String inputDate;
		int format = 0;
		// ---------------------
		while(true) {
			System.out.println("請輸入日期(年月日,例如：20110131)：");
			inputDate = sc.next();
			if(hv.isValid(inputDate)) {
				break;
			}
			System.out.println("日期格式不正確，請再輸入一次!");
			sc.nextLine();
		}
		
		//---------------------------------
		while(true) {
			System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年？");
			format = sc.nextInt();
			if(format <=3 && format >= 1) {
				break;
			}
			sc.nextLine();
		}
		sc.close();
		String dateFormat = "yyyy/MM/dd";
		switch(format) {
		case 1:
			dateFormat = "yyyy/MM/dd";
			break;
		case 2:
			dateFormat = "MM/dd/yyyy";
			break;
		case 3:
			dateFormat = "dd/MM/yyyy";
			break;
		}
		
		LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
		DateTimeFormatter outputFmt = DateTimeFormatter.ofPattern(dateFormat);
		System.out.println(date.format(outputFmt)); 

	}

	public boolean isValid(String input) {

		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyyMMdd");
		try {
			LocalDate.parse(input, dt);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}
}
