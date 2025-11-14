package hv8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hv8_2 {

	public static void main(String[] args) {
//		設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//		需使用的集合裡
//		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		- (118, “自強”, “高雄”, “台北”, 500)
//		- (1288, “區間”, “新竹”, “基隆”, 400)
//		- (122, “自強”, “台中”, “花蓮”, 600)
//		- (1222, “區間”, “樹林”, 七堵, 300)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
		Train tr1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400.0);
		Train tr2 = new Train(1254, "區間", "屏東", "基隆", 700.0);
		Train tr3 = new Train(118, "自強", "高雄", "台北", 500.0);
		Train tr4 = new Train(1288, "區間", "新竹", "基隆", 400.0);
		Train tr5 = new Train(122, "自強", "台中", "花蓮", 600.0);
		Train tr6 = new Train(1222, "區間", "樹林", "七堵", 300.0);
		Train tr7 = new Train(1254, "區間", "屏東", "基隆", 700.0);
//		請寫一隻程式,能印出不重複的Train物件
//
//		• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//
//		• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//
//		• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
		Set hs = new HashSet();
		hs.add(tr1);
		hs.add(tr2);
		hs.add(tr3);
		hs.add(tr4);
		hs.add(tr5);
		hs.add(tr6);
		hs.add(tr7);
		for(Object obj : hs) {
			System.out.println(obj.toString());
		}
		System.out.println("******************");
		// 不重複大到小
		Set set = new TreeSet();
		set.add(tr1);
		set.add(tr2);
		set.add(tr3);
		set.add(tr4);
		set.add(tr5);
		set.add(tr6);
		set.add(tr7);
		for(Object obj : set) {
			System.out.println(obj.toString());
		}
		
	}
}
