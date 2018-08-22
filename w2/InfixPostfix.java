import edu.princeton.cs.algs4.StdOut;

public class InfixPostfix {
	public Node first;
	public int N;
	private class Node {
		private String item;
		private Node next=null;
	}
	private void push(String token) {
		Node old = first;
		first = new Node();
		first.item = token;
		first.next = old;
	}
	private String pop() {
		String item = first.item;
		first = first.next;
		return item;
	}
	public String infixToPostfix(String inString) {
		String outString = "";
		String[] strings = inString.split(",");
		char[] characters = inString.toCharArray();
		for (int i = 0; i < strings.length; i++) {
			String token = strings[i];
			if (token.equals("(")) {
				
				continue;
				
			}
			else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
				push(token);
				N++;
			}
			else if (token.equals(")")) {
				if (N>0) {
					outString += pop() + ",";
					N--;
				}
				
			}
			else {
				outString += token + ",";
			}
			
			
		}
		if (N>0) {
			
			Node i = first;
			while (i!=null) {
				outString += pop();
				i = i.next;
				
			}
		}
		//createInfix(inString);
		return outString;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfixPostfix infixPostfix = new InfixPostfix();
		//StdOut.println(infixPostfix.infixToPostfix("(1+(5*6))-(11*(7-4))"));
		StdOut.println(infixPostfix.infixToPostfix("(,1,+,(,5,*,6,),),-,(,11,*,(,7,-,4,),)"));
	}

}
