package hv7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class hv7_3 {
	
	public static void main(String[ ] args) {
//		請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案
		hv7_3 hv = new hv7_3();
		File sample = new File("Sample.txt");
		File data = new File("Data.txt");
		
		try {
			hv.copyFile(sample,data);
		} catch (IOException e) {
			System.out.print("無法找到檔案");
		}
	}
	public void copyFile(File a ,File b) throws IOException {
		FileReader fr = new FileReader(a);
		FileWriter fw = new FileWriter(b);
		int i = 0;
		while((i=fr.read()) != -1) {
			fw.write(i);
		}
		fw.flush();
		fw.close();
		fr.close();
	}
}
