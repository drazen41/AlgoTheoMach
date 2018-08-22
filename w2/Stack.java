import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stack<Item> {
	private Node first = null;
	private int N = 0;
	private class Node {
		private Item item;
		private Node next;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public void push(Item item) {
		Node old = first;
		first = new Node();
		first.item = item;
		first.next = old;
		N++;
	}
	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	public int size() {
		return N;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (item.equals("-")) {
				StdOut.print(stack.pop());
			}
			else {
				stack.push(item);
			}
			StdOut.println();
			
		}
	}

}
