

public class Program {
	public static Counter doWork(Counter c) {
		c.increment();
		System.out.println("2:" + c.value);
		c = new Counter(); 
		System.out.println("3:" + c.value);
		// Point A 
		c.increment();
		c.increment();
		System.out.println("4:" + c.value);
		return c;
	}
	public static void main(String[] args) {
		Counter c = new Counter(); 
		System.out.println("1:" + c.value);
		doWork(c);
		System.out.println("5:" + c.value);
		// Point B
	} 
}


/* 1. Stack-and-heap diagram: 
 *  Stack         Heap
 *  -----        -----
 *  c[]--------->Counter
 *              value [1]
 *  c[]--------->Counter
 *              value [0]            
 * 
 * 2. c.value is 1. c.value in doWork is 2, but after the function ends
 *    and we return to main, the original c.value was just incremented just
 *    once whereas the new Counter c made in doWork is incremented twice so that
 *    one would be 2.
 */
