import java.util.Iterator;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "";
		boolean itis = false;
		while (!StdIn.isEmpty()) {
			string = StdIn.readString();
			
			char[] chars = string.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char a = chars[i];
				int pos = chars.length - (i +1 );
				char b = chars[pos];
				if (a != b) {
					itis = false;
					break;
				}
				itis = true;
			}
			if (itis) {
				StdOut.println(string + "is a palindrome");
			} else {
				StdOut.println(string + "is not a palindrome");
			}
			StdOut.println();
			
		}
		
	}

}
