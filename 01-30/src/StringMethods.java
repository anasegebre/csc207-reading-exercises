
public class StringMethods {

	public static boolean endsWithRep(String s1, String s2, int n) {
		String s = s2;
		for (int i = 0; i < n - 1; i++) {
			s2 = s2.concat(s);
		}
		boolean ret;
		ret = s1.endsWith(s2);
		if (ret == true) {
			System.out.println(ret);
		} else if (ret == false) {
			System.out.println("false");
		}
		return ret;
	}

	public static void main(String[] args) {
		endsWithRep("foobarbar", "bar", 2);
		endsWithRep("foobarbar", "baz", 1);
	}

}
