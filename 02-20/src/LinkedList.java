
public class LinkedList {

	private static Node first;
	public int size;

	public LinkedList() {
		first = null;
		size = 0;
	}

	public void insertFront(int value) {
		Node n = new Node(value, null);
		size++;
		if (first == null) {
			first = n;
		} 
		else {
			n.setNext(first);
			first = n;

		}
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertFront(5);
		l.insertFront(4);
		l.insertFront(3);
		l.insertFront(2);
		l.insertFront(1);
		l.insertFront(0);

		//trying to print this list
		Node n = first;
		n = first.getNext();
		System.out.print(first.getValue()+ ", ");
		while (n.getNext() != null) {
			System.out.print(n.getValue()+ ", ");
			n = n.getNext();
		}
		System.out.print(n.getValue()+ "\n");
	}
}