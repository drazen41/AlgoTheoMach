import java.util.ArrayList;
import java.util.TreeMap;

import edu.princeton.cs.algs4.StdOut;
public class ST<Key extends Comparable<Key>,Value> {
	private TreeMap<Key, Value> st = new TreeMap<Key,Value>(); 
	
	public void put(Key key, Value value ) {
		if (value== null)  {
			st.remove(key);
		} else {
			st.put(key, value);
		}
	}
	public Value get(Key key) {
		return st.get(key);
	}
	public Value remove(Key key) {
		return st.remove(key);
	}
	public boolean contains(Key key) {
		return st.containsKey(key);
	}
	public Iterable<Key> keys() {
		return st.keySet();
	}
	public Key min() {
		ArrayList<Key> arrayList = new ArrayList<>();
		for (Key key : keys()) {
			arrayList.add(key);
		}
		return arrayList.get(0);
		//return get(arrayList.get(0));
	}
	public Key max() {
		ArrayList<Key> arrayList = new ArrayList<>();
		for (Key key : keys()) {
			arrayList.add(key);
		}
		return arrayList.get(arrayList.size()-1);
		//return get(arrayList.get(arrayList.size()-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ST<String, Integer> st = new ST<>();
		st.put("test", 1);
		st.put("abc", 2);
		st.put("zdravko", 3);
		st.put("marko", 5);
		StdOut.println(st.min());
		StdOut.println(st.max());
		
		
	}

}
