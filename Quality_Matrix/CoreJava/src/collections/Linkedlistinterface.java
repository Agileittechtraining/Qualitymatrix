package collections;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l = new LinkedList();
l.add(1234);
l.add("Hello");
l.add("How are you");
l.add(1.234);

System.out.println(l.get(1));
System.out.println(l.get(2));
l.removeAll(l);
System.out.println(l);
	}

}
