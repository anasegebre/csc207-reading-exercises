public class C implements I {
	public void foo() { System.out.println("C.foo"); }
	public void bar() { System.out.println("C.bar"); }


	public static void main(String[] args) {
		I i = new C(); 
		i.foo(); // (A) 
		i.bar(); // (B)
	}
}

/*
 * (A)
 * 1. Does the line of code type check? 
 * -Yes
 * 2. If so, what is the output?
 * -The output is the string "C.foo"
 * 
 * (B)
 * 1. Does the line of code type check? 
 * -No (if we make it type C it might)
 * 2. If so, what is the output?
 * ----
 * 
 * Recall that the static type of i is I and the dynamic type is C. 
 * What does this exercise tell you about how precise subtyping is? 
 * -Even though we are using the same type C for both foo and bar, bar 
 *  will not work by making it type I, one way of making it work would be making
 *  it type C.
 * In particular, is there code that is safe but rejected by Java’s type system?
 * -We would need to include public void bar(); in I.java. We can also declare
 *  C c = new C(); in main and then it will actually print C.bar without declaring 
 *  bar() in I.java.
 * 
 * 
 */

