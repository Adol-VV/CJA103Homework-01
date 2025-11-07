package hv7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class hv7_1 {
	
	public static void main(String[] args) throws IOException {
		
//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//			Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
		//------------------file---------------
		String fisPath = "Sample.txt";
		File fis = new File(fisPath);
		
		System.out.println("Sample.txt檔案共有"+fis.length() +"個位元組");
		
		//---------------Reader-------------------
		
		FileReader rd = new FileReader (fisPath);
		BufferedReader br = new BufferedReader(rd);
		int count = 0 ;
		int lineCount = 0 ;
//		while(rd.read() != -1)
//			count++;
		String s;
		while(( s = br.readLine()) != null) {
			
			count += s.length();
			lineCount++;
		}
			
		System.out.println("Sample.txt檔案共有"+count +"個字元");
		System.out.println("Sample.txt檔案共有"+lineCount +"列資料");
		br.close();
		rd.close();
		
	}
	
}
