public class Tree<T extends Comparable<T>> {
	private static class Node<T> {
		public T value;
		public Node<T> left;
		public Node<T> right;

		public Node(T value, Node<T> left, Node<T> right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}

		public Node(T value) { 
			this(value, null, null); 
		}

	}

	private Node<T> root;
	public Tree() { 
		root = null;
	}

	private static <T extends Comparable<T>> Node<T> insertH(T value, Node<T> cur) {
		if (cur == null) {
			return new Node<>(value);
		} else {
			if (value.compareTo(cur.value) < 0) {
				cur.left = insertH(value, cur.left);
			} else {
				cur.right = insertH(value, cur.right);
			}
			return cur; 
		}
	}

	public void insert(T value) {
		root = insertH(value, root);
	}

	public void printInorderH(Node<T> cur) {
		if(cur == null) {
		} else {
			printInorderH(cur.left);
			System.out.println("" + cur.value);
			printInorderH(cur.right);
		}
	}

	public void printInorder() {
		printInorderH(root);
	}

	public static <T extends Comparable<T>> void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();
		tree.insert(5);
		tree.insert(8);
		tree.insert(2);
		tree.insert(7);
		tree.insert(10);
		tree.insert(3);
		tree.printInorder();
	}
}