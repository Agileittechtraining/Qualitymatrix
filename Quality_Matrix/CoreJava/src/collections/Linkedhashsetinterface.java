package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsetinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet lhs = new LinkedHashSet();
lhs.add("Hi");
lhs.add(234567);
lhs.add("Hi");
System.out.println(lhs);
Iterator i = lhs.iterator();
System.out.println(i.next());
	}

}
