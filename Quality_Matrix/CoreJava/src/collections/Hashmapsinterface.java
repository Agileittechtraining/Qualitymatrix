package collections;

import java.util.HashMap;

public class Hashmapsinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm = new HashMap();
hm.put(1, "A");
hm.put("xyz", 125);
hm.put(null,123);
hm.put(2, null);
System.out.println(hm.get(2));
	}

}
