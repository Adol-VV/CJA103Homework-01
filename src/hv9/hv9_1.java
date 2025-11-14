package hv9;

public class hv9_1 implements Runnable{
	String name;
	
	public hv9_1(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
//		• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//		競賽過程。
//		• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//		Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//		• 參考範例:CounterRunnable.java
//		• 需留意主執行緒執行順序
		hv9_1 m1 = new hv9_1("饅頭人");
		Thread t1 = new Thread(m1);
		hv9_1 m2 = new hv9_1("詹姆士");
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------大胃王快食比賽結束-------------");
	}
	
	@Override
	public void run() {
		int count = 0;
		while(count <10) {
			count++;
			System.out.println(name + "吃第" + count + "碗飯了");
			int rest = (int)(Math.random()*(3000-499)+500);
			
			try {
				Thread.sleep(rest);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
