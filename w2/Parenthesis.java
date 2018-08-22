import edu.princeton.cs.algs4.StdOut;

public class Parenthesis {
	public Node first;
	public int N=0;
	private class Node {
		private Character item;
		private Node next=null;
	}
	private void push(Character token) {
		Node old = first;
		first = new Node();
		first.item = token;
		first.next = old;
	}
	private Character pop() {
		Character item = first.item;
		first = first.next;
		return item;
	}
	public boolean balances(Character token) {
		if (token.equals(']')) {
			if (!pop().equals('[')) {
				return false;
			}
		}
		else if (token.equals('}')) {
			if(!pop().equals('{')) {
				return false;
			}
		}
		else if (token.equals(')')) {
			if (!pop().equals('(')) {
				return false;
			}
		}
		else {
			push(token);
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [()]{}{[()()]()} - true
		//  [(]) - false
		Parenthesis parenthesis = new Parenthesis();
		char[] characters = args[0].toCharArray();
		boolean balance = true;
		for (int i = 0; i < characters.length; i++) {
			if(!parenthesis.balances(characters[i])) {
				balance = false;
				break;
			}
			
		}
		if (balance) {
			StdOut.println("Balance.");
		}
		else {
			StdOut.println("No balance.");
		}
	}

}
