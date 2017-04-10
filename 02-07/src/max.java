
public class max {

	
	/*
	 * 1. Inputs: arr(n)
	 * 2. Operations: comparison
	 * 3. Best: 1, f ∈ O(1) It is constant
	 *    Worst: n - 1,  f ∈ O(n-1) It is linear
	 *    Average: n/a either one or the other
	 */
	public static int max1(int[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException();
		} else {
			int ret = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (ret < arr[i]) {
					ret = arr[i];
				} 
			}
			return ret; 
		}
	}
	

	public static void main(String[] args) {
		

	}

}
