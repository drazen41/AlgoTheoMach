import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Postfix {
	public static void main(String[] args) {
		Stack<Double> stack = new Stack<Double>();
		for (int i = 0; i < args.length; i++) {
			String token = args[i];
			if (token.equals("x")) {
				stack.push(stack.pop() * stack.pop());
			}
			else if (token.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			}
			else if (token.equals("-")) {
				stack.push(stack.pop() - stack.pop());
			}
			else if (token.equals("/")) {
				stack.push(1.0/stack.pop() * stack.pop());
			}
			else if (token.equals("sqrt")) {
				stack.push(Math.sqrt(stack.pop()));
			}
			else {
				stack.push(Double.parseDouble(token));
			}
		}
//		while (!StdIn.isEmpty()) {
//			
//			
//		}
		StdOut.println(stack.pop());
	}
}
