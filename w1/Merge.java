import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Merge {
	private static String[] aux;
	public static void merge(String[] a,int lo, int mid, int hi) {
		int i = lo,j=mid,N=hi-lo;
		for (int k = 0; k < N; k++) {
			if (i==mid) {
				aux[k]=a[j++];
			} else if (j==hi) {
				aux[k]=a[i++];
			} else if (a[j].compareTo(a[i])<0) {
				aux[k]=a[j++];
			} else {
				aux[k] = a[i++];
			}
			
		}
		for (int k = 0; k < N; k++) {
			a[lo+k] = aux[k];
		}
	}
	public static void sort(String[] a) {
		aux = new String[a.length];
		sort(a,0,a.length);
	}
	public static void sort(String[] a,int lo, int hi) {
		int N = hi - lo;
		if (N<=1) return;
		int mid = lo + N/2;
		sort(a,lo,mid);
		sort(a,mid,hi);
		merge(a, lo, mid, hi);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] a = new String[args.length];
//		for (int i = 0; i < args.length; i++) {
//			a[i] = args[i];
//		}
//		for (int i = 0; i < a.length; i++) {
//			StdOut.println(a[i]);
//		}
		
		String[] aStrings = StdIn.readAllStrings();
		 sort(aStrings);
		Stopwatch stopwatch = new Stopwatch();
//		sort(a);
		StdOut.println();
//		for (int i = 0; i < a.length; i++) {
//			StdOut.println(a[i]);
//		}

		StdOut.println(stopwatch.elapsedTime());
	}

}
