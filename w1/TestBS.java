import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestBS {
	public static int search(String key, String[] a) {
		return search(key, a,0,a.length);
	}
	public static int search(String key, String[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		if (hi<=lo) return -1;
		int mid = lo + (hi - lo)/2;
		int cmp = a[mid].compareTo(key);
		if (cmp>0) return search(key,a,lo,mid);
		else if (cmp<0) {
			return search(key, a,mid+1,hi);
		}
		else {
			return mid;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rijeci = StdIn.readAllStrings();
		Arrays.sort(rijeci);
		int N = rijeci.length;
		double start = System.currentTimeMillis()/1000.0;
		for (int i = 0; i < 10*N; i++) {
			String key = rijeci[StdRandom.uniform(N)];
			if (search(key, rijeci)== -1) {
				StdOut.println(key);
			}
		}
		double now = System.currentTimeMillis()/1000.0;
		StdOut.println(Math.round(now-start) + " sekundi");
		
		
		
	}
}
