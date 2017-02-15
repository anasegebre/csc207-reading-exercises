
public class max {
	public static int max1(int[] arr) {
		int ret = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < ret) {
				ret = arr[i];
			} 
		}
		return ret; 
	}

	public static void main(String[] args) {
		int[] arr = {0, -1, 4, 32, 3, 4, 10};
		System.out.println(max1(arr));
		//It will give out -1 instead of 32 because max is finding the min instead of the max
	}

}

/*
 * The loop invariant for max should start with ret = the first element in arr.
 * Then in the for loop starting with the second element in arr, we will compare and see if
 * that element is greater than ret, if it is, then we change ret to that element and run through
 * the loop again until we go through all of it and compare the greatest-so-far element with 
 * the next. After we are done, ret will be whatever is the max integer in the array and we
 * end by returning that. The max function above does not enfore this properly, instead, it is
 * finding the min integer of the array, not the max. In order to fix this, the < sign should 
 * be changed to >.
 */
