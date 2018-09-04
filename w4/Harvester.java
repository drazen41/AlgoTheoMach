import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.regex.Pattern;
import java.util.regex.Matcher; 

public class Harvester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String re = "C.{2,4}C...[LIVMFYWC].{8}H.{3,5}H"; 
//		String zincFinger = "CAASCGGPYACGGAAGYHAGAH"; 
//		boolean test = zincFinger.matches(re);
//		StdOut.println(test);
		
		String re = args[0];
		In in = new In(args[1]);
		String input = in.readAll();
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			StdOut.println(matcher.group());
		}
		
	}

}
