import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class LRS {
	private static String lcp(String s,String t) {
		int N = Math.min(s.length(), t.length());
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0,N);
	}
	public static String lrs(String s) {
		int N = s.length();
		String[] suffixes = new String[N];
		for (int i = 0; i < N; i++) {
			suffixes[i] = s.substring(i, N);
		}
		Merge.sort(suffixes);
		String lrString = "";
		for (int i = 0; i < N-1; i++) {
			String xString = lcp(suffixes[i], suffixes[i+1]);
			if (xString.length()>lrString.length()) {
				lrString = xString;
			}
		}
		return lrString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = StdIn.readString();
		Stopwatch stopwatch = new Stopwatch();
		String lrString = lrs(aString);
		StdOut.println(lrString);
		StdOut.println();
//		for (int i = 0; i < a.length; i++) {
//			StdOut.println(a[i]);
//		}

		StdOut.println(stopwatch.elapsedTime());
	}

}
