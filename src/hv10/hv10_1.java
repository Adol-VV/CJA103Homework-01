package hv10;

import java.util.HashSet;
import java.util.Set;

public class hv10_1 {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		while (numbers.size() < 5) {
			int number = (int) (Math.random() * 100 + 1);
			numbers.add(number);
		}
		for (int obj : numbers) {
			hv10_1 hv = new hv10_1();
			if (hv.checkPrime(obj)) {
				System.out.println(obj + "是質數");
			} else {

				System.out.println(obj + "不是質數");
			}
		}

	}

	public boolean checkPrime(int number) {
		if ((number < 2) || (number % 2 == 0)) {
			return false;
		} else if (number == 2) {
			return true;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
