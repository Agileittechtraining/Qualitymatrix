package collections;

import java.util.TreeSet;

public class Treesetinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts = new TreeSet();
ts.add("Hi");
ts.add("Hello");
ts.add("How are you");
System.out.println(ts);
System.out.println(ts.first());
System.out.println(ts.last());
System.out.println(ts.pollFirst());//Retrives the root element and deletes the value from memory after retreival
System.out.println(ts.pollLast());
System.out.println(ts.first());
System.out.println(ts.last());
	}

}
