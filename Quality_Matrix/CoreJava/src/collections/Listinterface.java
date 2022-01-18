package collections;

import java.util.ArrayList;
import java.util.List;

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> al = new ArrayList<Integer>();
al.add(123);
//al.add("Hello");
//al.add("How are you");
al.add(123);
//sal.add(null);
System.out.println("The Values in list are-->"+al);
System.out.println(al.get(2));
System.out.println(al.get(4));
System.out.println("The size of the array is"+al.size());
System.out.println("The Value Removed is"+al.remove(3));
System.out.println(al.get(3));
	}

}
