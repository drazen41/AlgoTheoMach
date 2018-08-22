import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StrawStack {
	private String[] aStrings;
	private int N = 0;
	public StrawStack(int max) {
		aStrings = new String[max];
	}
	public String pop() {
		if (!isEmpty()) {
			return aStrings[--N];
		}
		return "";
	}
	public void push(String item) {
		aStrings[N++] = item;
	}
	public boolean isEmpty() {
		return N == 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.parseInt(args[0]);
		StrawStack stack = new StrawStack(max);
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

// Get-Content tobe.txt | java-algs4 StrawStack 10