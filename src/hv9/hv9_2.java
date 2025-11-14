package hv9;

class Account {
	private int amount = 0;
	private int depositCount = 0;
	private int withdrawCount = 0;
	private boolean isOver = false;

	synchronized public void deposit(int count) {

		if (!isOver) {
			while (amount > 3000) {
				System.out.println("餘額超過3000");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			amount += count;
			System.out.println("媽媽存了2000 帳戶剩餘：" + amount);
			depositCount++;
			cheackOver(depositCount);
			notify();
		}
//		System.out.println("存款次數：" + depositCount);
//		System.out.println("提款次數：" + withdrawCount);
	}

	synchronized public void withdraw(int count) {
		if (!isOver) {
			while (amount <= 0) {
				try {
					System.out.println("餘額少於可提款金額");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (amount <= 2000 && amount > 0) {
				System.out.println("餘額少於2000 要求存款");
			}
			;
			amount -= count;
			System.out.println("兒子領了1000 帳戶剩餘：" + amount);
			withdrawCount++;
			cheackOver(withdrawCount);
			notify();
		}

	}

	private void cheackOver(int count) {
		if (count >= 10) {
			isOver = true;
		}
	}
}

class Mon extends Thread {
	Account ac;

	public Mon(Account ac) {
		this.ac = ac;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			ac.deposit(2000);
		}
	}
}

class Son extends Thread {
	Account ac;

	public Son(Account ac) {
		this.ac = ac;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			ac.withdraw(1000);
		}
	}
}

public class hv9_2 {
	public static void main(String[] args) {
		Account ac = new Account();
		Mon mon = new Mon(ac);
		Son son = new Son(ac);

		mon.start();
		son.start();
	}
}
