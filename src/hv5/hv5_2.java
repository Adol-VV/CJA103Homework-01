package hv5;

public class hv5_2 {
	
	public static void main(String[] args) {
		
//		利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//		可以找出二維陣列的最大值並回傳
		hv5_2 hv = new hv5_2();
		int[][] intArray = {{1,6,3},{9,5,2}};
		double[][] doubleArray = {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		System.out.println(hv.maxElement(intArray));
		System.out.println(hv.maxElement(doubleArray));
	}
	
	private int maxElement(int[][] arrays) {
		int max = 0;
		for(int i = 0 ;i < arrays.length;i++) {
			for(int z = 0 ;z < arrays[i].length;z++) {
				if(arrays[i][z] > max) {
					max = arrays[i][z];
				}
			}
		}
		return max;
	}
	private double maxElement(double[][] arrays) {
		double max = 0;
		for(int i = 0 ;i < arrays.length;i++) {
			for(int z = 0 ;z < arrays[i].length;z++) {
				if(arrays[i][z] > max) {
					max = arrays[i][z];
				}
			}
		}
		return max;
	}

}
