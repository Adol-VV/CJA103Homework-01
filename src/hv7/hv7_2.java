package hv7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hv7_2 {
	public static void main(String[] args) throws IOException {
//		• 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//				append功能讓每次執行結果都能被保存起來)
		
		Set set = new HashSet();
		while(set.size() < 10) {
			int i = (int)((Math.random()*1000)+1);
			set.add(i);
			
		}
		Iterator objs = set.iterator();
		FileWriter fw = new FileWriter("Data.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		while(objs.hasNext()) {
			Integer number = (int)objs.next();
			bw.append(String.valueOf(number));
			bw.append("\t");
		}
		bw.close();
		fw.close();
	}
}
